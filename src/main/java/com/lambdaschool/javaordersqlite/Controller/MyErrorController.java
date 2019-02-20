package com.lambdaschool.javaordersqlite.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handeError(HttpServlet request) {

        return "error";
    }


    @Override
    public String getErrorPath() {
        return "/error";
    }
}
