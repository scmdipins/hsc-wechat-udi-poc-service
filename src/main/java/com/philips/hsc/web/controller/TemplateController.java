package com.philips.hsc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    private static Logger logger = LoggerFactory.getLogger(TemplateController.class);

    @GetMapping("/hello")
    public String test(){

        logger.info("test method is invoked");
        return "hello hsc";
    }
}
