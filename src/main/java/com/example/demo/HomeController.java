package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    Repository bullhornRepository;

    @RequestMapping("/")
    public String listBullhorn(Model model) {
        model.addAttribute("bullhorn", bullhornRepository.findAll());
        return "list";
    }
    @GetMapping("/add")
    public String bullhornForm(Model model){
        model.addAttribute("bullhorn", new Bullhorn());
        return "bullhornform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Bullhorn bullhorn, BindingResult result){
        if (result.hasErrors()) {
            return "bullhornform";
        }
        listRepository.save(list);
        return "redirect:/";
    }
}