package org.example.shop.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.shop.entity.Bundle;
import org.example.shop.entity.Customer;
import org.example.shop.entity.Item;
import org.example.shop.service.BundleService;
import org.example.shop.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BundleController {

    private final BundleService bundleService;

    private final ItemService itemService;

    @GetMapping("/")
    public ModelAndView getHome(ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("search")
    public ModelAndView getItems(ModelAndView modelAndView,
                                 @RequestParam("p") Long page,
                                 @RequestParam("l") Long pageSize,
                                 @RequestParam(required = false) String name) {
        String addName = "";
        List<Item> items;
        if (name != null){
            addName = "&name=" + name;
            items = itemService.findItemsWithLimitOffset(pageSize, (page - 1) * pageSize, name);
        }
        else {
            items = itemService.findItemsWithLimitOffset(pageSize, (page - 1) * pageSize);
        }
        modelAndView.setViewName("search");
        Long maxPage = itemService.maxPage(pageSize);
        if (page < 1) {
            page = 1L;
        }
        List<String> pageList = new ArrayList<>(Collections.singletonList(
                "<a href=/search?p=1&l=" + pageSize + addName + ">1</a>"
        ));
        for (long i = page - 2; i < page + 3; i++) {
            if ((i < 2) || (i >= maxPage)) {
                continue;
            }
            pageList.add("<a href=/search?p=" + i + "&l=" + pageSize + addName + ">" + i +"</a>");
        }
        pageList.add("<a href=/search?p=" + maxPage + "&l=" + pageSize + addName + ">" + maxPage +"</a>");
        modelAndView.addObject("items", items);
        modelAndView.addObject("pages", pageList);
        return modelAndView;
    }

    @PostMapping("search")
    public ModelAndView getItemsByBundle(ModelAndView modelAndView,
                                 @RequestParam("p") Long page,
                                 @RequestParam("l") Long pageSize,
                                 @RequestBody String bundleName){
        modelAndView.setViewName("redirect:/search?p=" + page + "&l=" + pageSize + "&name=" + bundleName);
        return modelAndView;
    }


    @ResponseBody
    @GetMapping("bundles")
    public List<Bundle> find(@RequestParam("p") Long page, @RequestParam("l") Long limit) {
        return bundleService.find(limit, page * limit);
    }
}
