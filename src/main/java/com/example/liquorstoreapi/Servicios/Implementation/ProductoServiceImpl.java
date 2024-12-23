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
    private CategoriaService categoriaService;

    @Override
    public Producto createProducto(ProductoRequest productoRequest) {
        Producto newProducto = initProducto(productoRequest);
        return productoRepository.save(newProducto);
    }
    @Override
    public List<Producto> findAllProducto() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }

    @Override
    public Producto initProducto(ProductoRequest productoRequest) {
        Categoria categoria = categoriaService.findCategoriaById(productoRequest.getIdCategoriaProductos());
        Producto producto = new Producto();
        producto.setNombreProducto(productoRequest.getNombreProducto());
        producto.setCostoProducto(productoRequest.getCostoProducto());
        producto.setPrecioProducto(productoRequest.getPrecioProducto());
        producto.setIdCategoriaProductos(categoria);
        producto.setStockProducto(productoRequest.getStockProducto());
        producto.setRutaimagenProducto(productoRequest.getRutaimagenProducto());
        producto.setImage(productoRequest.getImage());
        return producto;
    }

    @Override
    public void deleteProductById(int productId) {
        productoRepository.deleteById(productId);
    }

    @Override
    public List<Producto> findProductosByDescription(String desc){
        List<Producto> productos = productoRepository.findByDescrip(desc);
        return productos;
    }

}
