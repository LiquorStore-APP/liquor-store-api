package com.example.liquorstoreapi.dto;

import com.example.liquorstoreapi.Clases.Categoria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {
    private int id;
    private String nombreProducto;
    private double costoProducto;
    private double precioProducto;
    private String nombreCategoriaProducto;
    private int stockProducto;
    private String rutaimagenProducto;
    private String image;
}
