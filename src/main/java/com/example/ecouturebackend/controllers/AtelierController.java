package com.example.ecouturebackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.example.ecouturebackend.domaines.entities.Atelier;
import com.example.ecouturebackend.infrastructures.AtelierServiceImp;
import org.springframework.web.bind.annotation.GetMapping;




@RequestMapping("api/atelier")
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequiredArgsConstructor
public class AtelierController {

    private final AtelierServiceImp atelierServiceImp;


    @GetMapping("/all")
    public List<Atelier> getAtelierAll()
    {
        return atelierServiceImp.getAtelier();
    }

    @GetMapping("/get/{atelierId}")
    public Atelier getAtelierById(@PathVariable("atelierId") Long atelierId)
    {
        return atelierServiceImp.getAtelierById(atelierId).get();
    }
    

    
}