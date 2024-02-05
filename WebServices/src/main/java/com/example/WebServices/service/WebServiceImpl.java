package com.example.WebServices.service;

import com.example.WebServices.entity.WebModel;
import com.example.WebServices.repository.WebRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WebServiceImpl implements WebService{

    WebRepository webRepository;

    public WebServiceImpl(WebRepository webRepository) {
        this.webRepository = webRepository;
    }

    @Override
    public String createWebService(WebModel webModel) {
    webRepository.save(webModel);
    return "Success";
    }

    @Override
    public String updateWebService(WebModel webModel) {
        webRepository.save(webModel);
        return "Success";
    }

    @Override
    public String deleteWebService(String Id) {
    webRepository.deleteById(Id);
    return "success";
    }

    @Override
    public WebModel getWebModelService(String Id) {
        return webRepository.findById(Id).get();
    }

    @Override
    public List<WebModel> getAllDetails() {
        return webRepository.findAll();
    }
}
