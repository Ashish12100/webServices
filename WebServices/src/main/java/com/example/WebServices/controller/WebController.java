package com.example.WebServices.controller;

import com.example.WebServices.entity.WebModel;
import com.example.WebServices.service.WebService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webServices")
public class WebController {
    WebService webService;

    public WebController(WebService webService) {
        this.webService = webService;
    }
@GetMapping("/get")
    public List<WebModel> getAllDetails(){
        return webService.getAllDetails();

    }
@PostMapping("/post")
    public String createWebController(@RequestBody  WebModel webModel){
        webService.createWebService(webModel);
        return "Success";
    }
    @PutMapping("/update")
    public String updateWebController(@RequestBody WebModel webModel){
        webService.updateWebService(webModel);
        return "Success";
    }
@DeleteMapping("/delete/{Id}")
    public String deleteWebController(@PathVariable("Id") String Id)
    {
         webService.deleteWebService(Id);
         return "SUCCESS";
    }
}

