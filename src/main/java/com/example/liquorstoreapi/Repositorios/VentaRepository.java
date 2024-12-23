package com.example.liquorstoreapi.Repositorios;

import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Clases.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Ventas,Integer> {
}
