package com.example.liquorstoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRequest {
    private String nombreProducto;
    private double costoProducto;
    private double precioProducto;
    private int idCategoriaProductos;
    private int stockProducto;
    private String rutaimagenProducto;
}
