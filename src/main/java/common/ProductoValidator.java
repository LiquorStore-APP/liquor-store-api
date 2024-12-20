package common;

import dto.ProductoRequest;
import exception.BadResourceRequestException;
import lombok.ToString;

public class ProductoValidator {
    public static boolean validateProducto(ProductoRequest producto) {
        //if(producto.getNombreProducto().isBlank() || Double.toString(producto.getPrecioProducto()).isBlank()) {
           // throw new BadResourceRequestException("Completar todos los datos en blanco.");
      //  }
        return true;
    }
}
