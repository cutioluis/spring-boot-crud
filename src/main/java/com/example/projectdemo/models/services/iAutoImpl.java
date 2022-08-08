package com.example.projectdemo.models.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.models.dao.AutoRepository;
import com.example.projectdemo.models.entities.Auto;

@Service
public class iAutoImpl implements iAutoService {

   @Autowired
   private AutoRepository autoRepository;

   @Override
   public boolean delete(Long id) {
      // TODO Auto-generated method stub
      this.autoRepository.deleteById(id);
      return true;
   }

   @Override
   public Optional<Auto> obtenerId(Long id) {
      // TODO Auto-generated method stub
      return this.autoRepository.findById(id);
   }

   @Override
   public Auto save(Auto auto) {
      // TODO Auto-generated method stub
      return this.autoRepository.save(auto);
   }

   @Override
   public Auto actualizarAuto(Long id, double nuevoPrecio) {
      Optional<Auto> auto = this.autoRepository.findById(id);
      if (auto.isPresent()) {
         Auto tmp = auto.get();
         tmp.setPrecio(nuevoPrecio);
         return save(tmp);
      }
      return null;
   }

}
