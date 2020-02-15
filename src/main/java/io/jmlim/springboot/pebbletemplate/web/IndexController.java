package io.jmlim.springboot.pebbletemplate.web;

import io.jmlim.springboot.pebbletemplate.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final PostService postService;

    @GetMapping(value = {"", "/", "/home"})
    public String home(Model model) {
        model.addAttribute("posts", this.postService.getPosts());
        return "home";
    }
}
