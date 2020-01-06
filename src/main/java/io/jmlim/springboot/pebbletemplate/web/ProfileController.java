package io.jmlim.springboot.pebbletemplate.web;

import io.jmlim.springboot.pebbletemplate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ProfileController {

  private final UserService userService;

  @GetMapping(value = "/profile")
  public String getUserProfile(@RequestParam("id") long id, Model model) {
    model.addAttribute("user", this.userService.getUser(id));
    return "profile";
  }
}