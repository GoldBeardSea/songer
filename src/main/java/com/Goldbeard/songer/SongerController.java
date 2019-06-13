package com.Goldbeard.songer;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class SongerController {

    @GetMapping("/")
    public String helloWorldBase() {
        return "Hello Base World";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello Base World";
    }

    @GetMapping("/capitalize/{string}")
    public String capitalize(@PathVariable String string) {
        return string.toUpperCase();
    }

    @GetMapping("/reverse")
    @ResponseBody
    public String reverse(
            @RequestParam String sentence) {
        String[] reverser = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = reverser.length - 1; i >= 0; i--) {
            if (i != 0) {
                String added = reverser[i] + " ";
                reversed.append(added);
            } else {
                reversed.append(reverser[i]);
            }
        }
        return reversed.toString();
    }

}
