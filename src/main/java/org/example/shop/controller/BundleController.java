package org.example.shop.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.shop.entity.Bundle;
import org.example.shop.entity.Customer;
import org.example.shop.service.BundleService;
import org.example.shop.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BundleController {

    private final BundleService bundleService;

    private final ItemService itemService;

    @GetMapping("/")
    public ModelAndView getHome(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("search")
    public ModelAndView getItems(ModelAndView modelAndView, @RequestParam("p") Long page, @RequestParam("l") Long pageSize){
        modelAndView.setViewName("search");
        modelAndView.addObject("items", itemService.findItemsWithLimitOffset(pageSize, page*pageSize));
        modelAndView.addObject("page", page);
        return modelAndView;
    }

    @ResponseBody
    @GetMapping("bundles")
    public List<Bundle> find(@RequestParam("p") Long page, @RequestParam("l") Long limit) {
        return bundleService.find(limit, page*limit);
    }
}
