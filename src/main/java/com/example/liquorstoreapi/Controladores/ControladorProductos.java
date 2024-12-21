package com.example.liquorstoreapi.Controladores;

import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Servicios.ProductoService;
import com.example.liquorstoreapi.common.EntityDtoConverter;
import com.example.liquorstoreapi.dto.ProductoRequest;
import com.example.liquorstoreapi.dto.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ControladorProductos {
    @Autowired
    private ProductoService productoService;
    @Autowired
    private EntityDtoConverter entityDtoConverter;

    @PostMapping
    public ResponseEntity<ProductoResponse> createProducto(@RequestBody ProductoRequest productoRequest) throws Exception{
        Producto producto = productoService.createProducto(productoRequest);
        return new ResponseEntity<>(entityDtoConverter.convertEntityToDtoProducto(producto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProductoResponse>> findAll() throws Exception{
        List<Producto> productos = productoService.findAllProducto();
        return new ResponseEntity<List<ProductoResponse>>(
                entityDtoConverter.convertEntityToDtoProducto(productos),
                HttpStatus.OK);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<ProductoResponse> deleteById(@PathVariable int productId) throws Exception{
        productoService.deleteProductById(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
