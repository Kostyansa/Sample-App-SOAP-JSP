package org.example.shop.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.shop.service.BundleService;
import org.example.shop.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.text.normalizer.NormalizerBase;

@Controller
@RequiredArgsConstructor
public class BundleController {

    private final BundleService bundleService;

    private final ItemService itemService;

    @GetMapping
    public ModelAndView getHome(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("search")
    public ModelAndView getItems(ModelAndView modelAndView, @RequestParam("p") Long page, @RequestParam("l") Long pageSize){
        modelAndView.setViewName("search");
        modelAndView.addObject("items", itemService.findItemsWithLimitOffset(pageSize, page*pageSize));
        return modelAndView;
    }
}
