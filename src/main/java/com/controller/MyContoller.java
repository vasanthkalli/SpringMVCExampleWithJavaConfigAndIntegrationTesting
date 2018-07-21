package com.controller;

import com.POJO.Countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/application")
public class MyContoller {
    @Autowired
    private Countries countries;
    @RequestMapping(value = "/getresponse",method = RequestMethod.GET,produces = "application/xml")
    @ResponseBody
    public  Countries getResponse(){

        return countries;
    }
}
