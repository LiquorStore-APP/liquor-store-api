package com.example.liquorstoreapi.Controladores;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Servicios.CategoriaService;

import com.example.liquorstoreapi.common.EntityDtoConverter;

import com.example.liquorstoreapi.dto.CategoriaRequest;
import com.example.liquorstoreapi.dto.CategoriaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class ControladorCategorias {
    @Autowired
    private CategoriaService categoriaServiceImpl;
    @Autowired
    private EntityDtoConverter entityDtoConverter;

    @PostMapping
    public ResponseEntity<CategoriaResponse> createProducto(@RequestBody CategoriaRequest categoriaRequest) throws Exception{
        Categoria categoria = categoriaServiceImpl.createCategoria(categoriaRequest);
        return new ResponseEntity<>(entityDtoConverter.convertEntityToDtoCategoria(categoria), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> findAll() throws Exception{
        List<Categoria> categorias = categoriaServiceImpl.findAllCategorias();
        return new ResponseEntity<List<CategoriaResponse>>(
                entityDtoConverter.convertEntityToDtoCategoria(categorias),
                HttpStatus.OK);
    }

}
