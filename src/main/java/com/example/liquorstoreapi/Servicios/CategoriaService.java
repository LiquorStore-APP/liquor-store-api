package com.example.liquorstoreapi.Servicios;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.dto.CategoriaRequest;
import com.example.liquorstoreapi.exception.ResourceNotFoundException;

import java.util.List;

public interface CategoriaService {

    Categoria createCategoria(CategoriaRequest categoriaRequest);

    List<Categoria> findAllCategorias();

    Categoria findCategoriaById(int categoriaId) ;

    Categoria initCategoria(CategoriaRequest categoriaRequest);

}
