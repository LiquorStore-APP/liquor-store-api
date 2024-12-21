package com.example.liquorstoreapi.Clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table(name="Productos")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id;
    public String nombreProducto;
    public double costoProducto;
    public double precioProducto;

    @ManyToOne()
    @JoinColumn(name = "idCategoria")
    public Categoria idCategoriaProductos;

    public int stockProducto;
    public String rutaimagenProducto;
}
