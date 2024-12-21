package com.example.liquorstoreapi.Servicios.Implementation;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Repositorios.CategoriaRepository;
import com.example.liquorstoreapi.Servicios.CategoriaService;
import com.example.liquorstoreapi.dto.CategoriaRequest;
import com.example.liquorstoreapi.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria createCategoria(CategoriaRequest categoriaRequest) {
        Categoria newCategoria = initCategoria(categoriaRequest); //
        return categoriaRepository.save(newCategoria);
    }

    public List<Categoria> findAllCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }

    public Categoria findCategoriaById(int categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId)
                .orElseThrow( () -> ResourceNotFoundException.byIndex("Categoria", categoriaId));
        return categoria;
    }

    public Categoria initCategoria(CategoriaRequest categoriaRequest) {
        Categoria categoria = new Categoria();

        categoria.setNombreCategoria(categoriaRequest.getNombreCategoria());

        return categoria;
    }
}
