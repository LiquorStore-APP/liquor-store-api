package Controladores;

import Clases.Categoria;
import Clases.Producto;
import Servicios.CategoriaService;

import common.EntityDtoConverter;

import dto.CategoriaRequest;
import dto.CategoriaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias/")
public class ControladorCategorias {
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private EntityDtoConverter entityDtoConverter;

    @PostMapping
    public ResponseEntity<CategoriaResponse> createProducto(@RequestBody CategoriaRequest categoriaRequest) throws Exception{
        Categoria categoria = categoriaService.createCategoria(categoriaRequest);
        return new ResponseEntity<>(entityDtoConverter.convertEntityToDtoCategoria(categoria), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> findAll() throws Exception{
        List<Categoria> categorias = categoriaService.findAllCategorias();
        return new ResponseEntity<List<CategoriaResponse>>(
                entityDtoConverter.convertEntityToDtoCategoria(categorias),
                HttpStatus.OK);
    }

}
