package Servicios;

import Clases.Categoria;
import Repositorios.CategoriaRepository;
import dto.CategoriaRequest;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
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

    private Categoria initCategoria(CategoriaRequest categoriaRequest) {
        Categoria categoria = new Categoria();

        categoria.setNombreCategoria(categoriaRequest.getNombreCategoria());

        return categoria;
    }
}
