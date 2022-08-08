package com.example.projectdemo.controllers;

import com.example.projectdemo.dto.ProductoDto;
import com.example.projectdemo.models.dao.ProductoDao;
import com.example.projectdemo.models.entities.Producto;
import com.example.projectdemo.models.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // JSON TO HANDDLE METOD
public class ProductController {

    @Autowired
    private ProductoDao producttoDao;

    @Autowired
    private IProductService productService;

    @GetMapping("/test")
    public String test() {
        return "HOlaa";
    }

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productService.findAll();
    }

    @PostMapping(value = "/save")
    public Producto postMethodName(@RequestBody Producto producto) {
        return producttoDao.save(producto);
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productService.findById(id);
    }
}
