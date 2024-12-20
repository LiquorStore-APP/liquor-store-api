package dto;

import Clases.Categoria;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {
    private int idProducto;
    private String nombreProducto;
    private double costoProducto;
    private double precioProducto;
    private int idCategoriaProductos;
    private int stockProducto;
    private String rutaimagenProducto;
}
