package com.wolfogre.bookshelfcircle.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wolfogre on 9/18/16.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
