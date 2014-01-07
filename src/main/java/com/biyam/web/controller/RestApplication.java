package com.biyam.web.controller;

import com.sun.jersey.api.core.PackagesResourceConfig;

public class RestApplication extends PackagesResourceConfig {
  public RestApplication() {
    super("com.kth.nscreen.web.controller");
  }
}