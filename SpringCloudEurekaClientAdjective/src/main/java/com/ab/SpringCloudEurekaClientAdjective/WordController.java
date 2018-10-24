package com.ab.SpringCloudEurekaClientAdjective;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController {

    @Value("${words}")
    String words;

    @GetMapping("/")
    public @ResponseBody
    String getWord(){
        String[] wordArray = words.split(",");
        int i = new Random().nextInt(wordArray.length -1);
        return wordArray[i];
    }
}
