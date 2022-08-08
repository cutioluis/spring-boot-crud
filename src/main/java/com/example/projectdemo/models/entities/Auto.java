package com.example.projectdemo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Auto {

   @Id
   private Long id;
   private String modelo;
   private int anno;
   private int capacidad;
   private double precio;
}
