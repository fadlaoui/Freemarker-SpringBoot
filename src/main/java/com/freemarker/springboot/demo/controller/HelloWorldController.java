package com.freemarker.springboot.demo.Controller;

/**
 * Created by fadal on 26/05/2017.
 */
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController  {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("/salam")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {

        String message="We are Columbus Team";
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        return "hello";
    }

}