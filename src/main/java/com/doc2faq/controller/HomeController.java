package com.doc2faq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for handling home page requests
 */
@Controller
public class HomeController {

    /**
     * Handles requests to the root path and returns the landing page
     * 
     * @param model the model to pass data to the view
     * @return the name of the template to render
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "Doc2FAQ");
        model.addAttribute("appVersion", "1.0.0-SNAPSHOT");
        model.addAttribute("description", 
            "Transform your documents into comprehensive FAQ formats with ease. " +
            "Upload documents and let our intelligent system generate relevant " +
            "questions and answers to improve accessibility and understanding.");
        return "index";
    }
}