package com.example.projectdemo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.projectdemo.models.entities.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long> {
}

