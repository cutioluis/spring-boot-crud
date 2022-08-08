package com.example.projectdemo.models.services;

import java.util.List;

import com.example.projectdemo.models.entities.Producto;

public interface IProductService {

    public List<Producto> findAll();
    public Producto findById(Long id);

}

