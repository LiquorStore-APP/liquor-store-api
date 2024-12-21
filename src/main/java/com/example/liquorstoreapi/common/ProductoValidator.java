package com.example.liquorstoreapi.common;

import com.example.liquorstoreapi.dto.ProductoRequest;

public class ProductoValidator {
    public static boolean validateProducto(ProductoRequest producto) {
        //if(producto.getNombreProducto().isBlank() || Double.toString(producto.getPrecioProducto()).isBlank()) {
           // throw new BadResourceRequestException("Completar todos los datos en blanco.");
      //  }
        return true;
    }
}
