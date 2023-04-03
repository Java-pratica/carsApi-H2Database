package com.testacamp.modelaai.controller;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testacamp.modelaai.dto.carsDTO;
import com.testacamp.modelaai.models.CarsModels;
import com.testacamp.modelaai.repository.CarsRepository;

import lombok.var;

@RestController
@RequestMapping("/")

public class modelaai {

    @Autowired
    private CarsRepository repository;

    @GetMapping
    public String getAll() {
        var res = repository.findAll();
        System.out.println(res);
        return res.toString();
    }

    @PostMapping
    public String create(@RequestBody carsDTO req){
        var res = repository.save(new CarsModels(req));
        System.out.println(res);
        return "Inserido com Sucesso";
    }
}
 