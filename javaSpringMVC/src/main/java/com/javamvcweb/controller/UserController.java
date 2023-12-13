package com.javamvcweb.controller;

import com.javamvcweb.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {

    private final FormService formService;
    private final RestTemplate restTemplate; // Inject a RestTemplate for making API calls

    @Autowired
    public UserController(FormService formService, RestTemplate restTemplate) {
        this.formService = formService;
        this.restTemplate = restTemplate;
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageHits", getPageHits());
        return "home";
    }
    @GetMapping("/user-form")
    public String showForm(Model model) {
        long pageHits = getPageHits();  // Fetch page hits from the API
        model.addAttribute("pageHits", pageHits);

        // Your form controller logic

        return "user-form";
    }

    private long getPageHits() {
        // Make a REST API call to fetch the page hits
        return restTemplate.getForObject("/api/page-hits", Long.class);
    }
}
