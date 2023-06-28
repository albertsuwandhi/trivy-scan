package com.pwdemo.demomicroservice;

public class DemoFile {
  private final String fileName;
  private final long id;

  public DemoFile(long id, String fileName) {
    this.id = id;
    this.fileName = fileName;
  }


  public long getId() { return  id; }

  public String getDemoFile() {
    return fileName;
  }
}
