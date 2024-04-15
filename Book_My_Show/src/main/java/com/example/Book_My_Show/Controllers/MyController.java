package com.example.Book_My_Show.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello, Welcome to Book My Show!!");
    }
}
