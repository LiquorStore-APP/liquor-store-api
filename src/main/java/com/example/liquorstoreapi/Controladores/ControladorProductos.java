package com.example.liquorstoreapi.Controladores;

import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Servicios.ProductoService;
import com.example.liquorstoreapi.common.EntityDtoConverter;
import com.example.liquorstoreapi.dto.ProductoRequest;
import com.example.liquorstoreapi.dto.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ControladorProductos {
    @Autowired
    private ProductoService productoService;
    @Autowired
    private EntityDtoConverter entityDtoConverter;

    @PostMapping
    public ResponseEntity<ProductoResponse> createProducto(@RequestBody ProductoRequest productoRequest) throws Exception{
        Producto producto = productoService.createProducto(productoRequest);
        return new ResponseEntity<>(entityDtoConverter.convertEntityToDtoProducto(producto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProductoResponse>> findAll() throws Exception{
        List<Producto> productos = productoService.findAllProducto();
        return new ResponseEntity<List<ProductoResponse>>(
                entityDtoConverter.convertEntityToDtoProducto(productos),
                HttpStatus.OK);
    }


//    public ProductoResponse convertToProductoResponse(Producto producto) {
//        ProductoResponse response = new ProductoResponse();
//        response.setIdProducto(producto.getIdProducto());
//        response.setNombreProducto(producto.getNombreProducto());
//        response.setCostoProducto(producto.getCostoProducto());
//        response.setPrecioProducto(producto.getPrecioProducto());
//        response.setIdCategoriaProductos(producto.getIdCategoriaProductos().getIdCategoria());
//        response.setStockProducto(producto.getStockProducto());
//        response.setRutaimagenProducto(producto.getRutaimagenProducto());
//
//        return response;
//    }
}
