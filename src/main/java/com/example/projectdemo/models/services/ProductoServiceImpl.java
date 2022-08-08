package com.example.projectdemo.models.services;

import com.example.projectdemo.models.dao.ProductoDao;
import com.example.projectdemo.models.entities.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductService {
    @Autowired
    private ProductoDao producttoDao;
    

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) producttoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return producttoDao.findById(id).orElse(null);
    }
}
