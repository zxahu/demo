package com.zxahu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zxahu on 16-11-13.
 */
@Controller
@RequestMapping()
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
