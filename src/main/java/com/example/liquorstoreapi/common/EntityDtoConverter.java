package com.example.liquorstoreapi.common;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.dto.CategoriaResponse;
import com.example.liquorstoreapi.dto.ProductoResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityDtoConverter {
    @Autowired
    private ModelMapper modelMapper;

    EntityDtoConverter() {
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.addMappings(new PropertyMap<Producto, ProductoResponse>() {
            @Override
            protected void configure() {
                map(source.getIdCategoriaProductos().getNombreCategoria(), destination.getNombreCategoriaProducto());}
        });
    }


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
