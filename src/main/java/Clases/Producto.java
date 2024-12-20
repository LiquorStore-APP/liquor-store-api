package Clases;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idProducto;
    public String nombreProducto;
    public double costoProducto;
    public double precioProducto;

    @ManyToOne()
    @JoinColumn(name = "idCategoria")
    public Categoria idCategoriaProductos;

    public int stockProducto;
    public String rutaimagenProducto;
}
