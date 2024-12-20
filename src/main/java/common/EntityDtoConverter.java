package common;

import Clases.Categoria;
import Clases.Producto;
import dto.CategoriaResponse;
import dto.ProductoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityDtoConverter {
    @Autowired
    private ModelMapper modelMapper;
    public ProductoResponse convertEntityToDtoProducto(Producto producto) {
        return modelMapper.map(producto, ProductoResponse.class);
    }

    public List<ProductoResponse> convertEntityToDtoProducto(List<Producto> productos) {
        return productos.stream()
                .map(this::convertEntityToDtoProducto)
                .collect(Collectors.toList());
    }

    public CategoriaResponse convertEntityToDtoCategoria(Categoria categoria) {
        return modelMapper.map(categoria, CategoriaResponse.class);
    }

    public List<CategoriaResponse> convertEntityToDtoCategoria(List<Categoria> categorias) {
        return categorias.stream()
                .map(this::convertEntityToDtoCategoria)
                .collect(Collectors.toList());
    }
}
