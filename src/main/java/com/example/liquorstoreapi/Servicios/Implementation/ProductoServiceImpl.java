package com.example.liquorstoreapi.Servicios.Implementation;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Repositorios.ProductoRepository;
import com.example.liquorstoreapi.Servicios.CategoriaService;
import com.example.liquorstoreapi.Servicios.ProductoService;
import com.example.liquorstoreapi.dto.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private CategoriaService categoriaServiceImpl;

    public Producto createProducto(ProductoRequest productoRequest) {
        Producto newProducto = initProducto(productoRequest);
        return productoRepository.save(newProducto);
    }
    public List<Producto> findAllProducto() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }

    public Producto initProducto(ProductoRequest productoRequest) {
        //ProductoValidator.validateProducto(productoRequest);

        Categoria categoria = categoriaServiceImpl.findCategoriaById(productoRequest.getIdCategoriaProductos());

        Producto producto = new Producto();
        producto.setNombreProducto(productoRequest.getNombreProducto());
        producto.setCostoProducto(productoRequest.getCostoProducto());
        producto.setPrecioProducto(productoRequest.getPrecioProducto());
        producto.setIdCategoriaProductos(categoria);
        producto.setStockProducto(productoRequest.getStockProducto());
        producto.setRutaimagenProducto(productoRequest.getRutaimagenProducto());
        return producto;
    }

}
