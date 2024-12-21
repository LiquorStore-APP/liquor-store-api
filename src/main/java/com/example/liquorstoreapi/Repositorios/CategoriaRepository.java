package com.example.liquorstoreapi.Repositorios;

import com.example.liquorstoreapi.Clases.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
