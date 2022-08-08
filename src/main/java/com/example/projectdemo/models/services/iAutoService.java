package com.example.projectdemo.models.services;

import java.util.Optional;

import com.example.projectdemo.models.entities.Auto;

public interface iAutoService {
   Auto save(Auto auto);

   Optional<Auto> obtenerId(Long id);

   Auto actualizarAuto(Long id, double nuevoPrecio);

   boolean delete(Long id);
}
