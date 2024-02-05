package com.example.WebServices.repository;

import com.example.WebServices.entity.WebModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebRepository extends JpaRepository<WebModel,String> {
}
