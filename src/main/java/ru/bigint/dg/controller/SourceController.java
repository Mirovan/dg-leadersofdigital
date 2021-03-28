package ru.bigint.dg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.bigint.dg.model.Source;

@RequestMapping("/source")
@Controller
public class SourceController {

    @GetMapping("/list/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }


    @GetMapping("/add/")
    public ModelAndView add() {
        Source source = new Source();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("source", source);
        modelAndView.setViewName("source/add");

        return modelAndView;
    }


    @PostMapping(value = "/add/")
    public ModelAndView addPost(@ModelAttribute Source source) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("source", source);
        modelAndView.setViewName("source/complete");

        return modelAndView;
    }

}