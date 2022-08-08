package com.example.projectdemo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.projectdemo.models.entities.Auto;

public interface AutoRepository extends CrudRepository<Auto, Long> {

}
