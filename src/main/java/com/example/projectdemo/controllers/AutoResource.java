package com.example.projectdemo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdemo.models.entities.Auto;
import com.example.projectdemo.models.services.iAutoService;

@RestController
@RequestMapping("/api/v1")
public class AutoResource {

   @Autowired
   private iAutoService autoService;

   @PostMapping("autos")
   public ResponseEntity<Auto> saveAuto(@RequestBody Auto auto) {
      return new ResponseEntity(this.autoService.save(auto), HttpStatus.CREATED);
   }

   @GetMapping("/autos/{id}")
   public ResponseEntity<Auto> obtenerAuto(@PathVariable("id") Long id) {
      Optional<Auto> optionalAuto = this.autoService.obtenerId(id);
      if (optionalAuto.isPresent())
         return new ResponseEntity(optionalAuto, HttpStatus.OK);
      return ResponseEntity.notFound().build();

   }

   @PutMapping("/autos/{id}/nuevoprecio/{precio}")
   public ResponseEntity<Auto> actualizarAuto(@PathVariable("id") Long id, @PathVariable("precio") double precio) {
      Auto autoActualizar = this.autoService.actualizarAuto(id, precio);
      if (autoActualizar != null) {
         return new ResponseEntity(autoActualizar, HttpStatus.OK);
      }
      return ResponseEntity.notFound().build();
   }

   @DeleteMapping("/autos/{id}")
   public ResponseEntity<Void> eliminarAuto(@PathVariable("id") Long id) {
      this.autoService.delete(id);
      return ResponseEntity.noContent().build();
   }
}
