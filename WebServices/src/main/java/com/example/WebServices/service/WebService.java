package com.example.WebServices.service;

import com.example.WebServices.entity.WebModel;

import java.util.List;

public interface WebService {

    public String createWebService(WebModel webModel);
    public String updateWebService(WebModel webModel);

    public String deleteWebService(String Id);

    public WebModel getWebModelService(String Id);
    public List<WebModel> getAllDetails();

}
