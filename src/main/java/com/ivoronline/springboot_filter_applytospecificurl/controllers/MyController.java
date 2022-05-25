package com.ivoronline.springboot_filter_applytospecificurl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //===================================================================
  // NOT FILTERED
  //===================================================================
  @ResponseBody
  @RequestMapping("/NotFiltered")
  public String notFiltered() {
    System.out.println("CONTROLLER: NOT Filtered");
    return "Hello from NOT Filtered Endpoint";
  }

  //===================================================================
  // FILTERED
  //===================================================================
  @ResponseBody
  @RequestMapping("/Filtered")
  public String filtered() {
    System.out.println("CONTROLLER: Filtered");
    return "Hello from Filtered Endpoint";
  }

}
