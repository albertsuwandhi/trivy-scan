package com.pwdemo.demomicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoFileController {
  private final String [] filesList = new String[] {"test", "test2"};

  @GetMapping("/file")
  public DemoFile getFiles() {
    return new DemoFile(12, "testing123");
  }
}
