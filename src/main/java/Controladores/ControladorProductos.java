package Controladores;

import Clases.Producto;
import Servicios.ProductoService;
import common.EntityDtoConverter;
import dto.ProductoRequest;
import dto.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
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
}
