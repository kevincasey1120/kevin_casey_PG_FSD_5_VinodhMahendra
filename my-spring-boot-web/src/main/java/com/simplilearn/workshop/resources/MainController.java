package com.simplilearn.workshop.resources;

/* ====================== PHASE 5 ASSESSMENT PROJECT =========================
 *    COURSE:  SIMPLI-LEARN, CALTECH FSD
 * DEVELOPER:  Kevin Casey (software engineer, full-stack web)
 *   PURPOSE:  LandingPage - Controller
 *
 *   FILENAME: [MainController.java]
 *   UPDATED:  9/26/2021
 * ===========================================================================*/


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "index.html";
  }
}