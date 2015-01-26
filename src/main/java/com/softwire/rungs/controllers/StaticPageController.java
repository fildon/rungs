package com.softwire.rungs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
    @RequestMapping("/")
    public String serveStaticIndexPage() {
        return "static/html/index.html";
    }
}
