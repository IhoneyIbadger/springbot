package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {

    @GetMapping
    public BlogPost getBlog() {
        return new BlogPost("2 Boys am Verzweifeln", "Erst ging gar nix aber jetzt geht ein bisschen mehr", "Ich wer sonst?");
    }
}
