package com.ot001z;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/api/help")
  public String getHelp() {
    return "Se precisar de ajuda, entre em contato pelo Instagram: @0t001z";
  }
}