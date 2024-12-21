package com.example.liquorstoreapi.Servicios;

import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.dto.ProductoRequest;

import java.util.List;

public interface ProductoService {
    Producto createProducto(ProductoRequest productoRequest);
    List<Producto> findAllProducto();
    Producto initProducto(ProductoRequest productoRequest);
}
