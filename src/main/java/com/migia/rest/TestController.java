package com.migia.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    GetDataFromAnotherService service;

    @Autowired
    public TestController(GetDataFromAnotherService service){
        this.service = service;
        
    }

    @GetMapping("/")
    public List<CandleStick> getCandlesticks(){

        return service.getCandlesticks();

    }
}