package ru.bigint.dg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bigint.dg.model.Source;
import ru.bigint.dg.service.SourceService;

import java.util.List;

@RequestMapping("/source")
@Controller
public class SourceController {

    private final SourceService sourceService;

    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }


    @GetMapping("/")
    public ModelAndView index() {
        List<Source> list = sourceService.list();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("source/list");
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
        Source res = sourceService.add(source);

        ModelAndView modelAndView = new ModelAndView();
        if (res != null) {
            modelAndView.addObject("source", res);
            modelAndView.setViewName("source/complete");
        } else {
            //some error
        }
        return modelAndView;
    }

}