package com.example.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class RecordController {
  @GetMapping({"", "/index"})
  public String getIndex() {
    return "record/index";
  }
}
