package Servicios;

import Clases.Categoria;
import Clases.Producto;
import Repositorios.ProductoRepository;
import common.ProductoValidator;
import dto.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaService categoriaService;

    public Producto createProducto(ProductoRequest productoRequest) {
        Producto newProducto = initProducto(productoRequest);
        return productoRepository.save(newProducto);
    }
    public List<Producto> findAllProducto() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }

    private Producto initProducto(ProductoRequest productoRequest) {
        //ProductoValidator.validateProducto(productoRequest);

        Categoria categoria = categoriaService.findCategoriaById(productoRequest.getIdCategoriaProductos());

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
