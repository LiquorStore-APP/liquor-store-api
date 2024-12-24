package com.example.liquorstoreapi.Repositorios;

import com.example.liquorstoreapi.Clases.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Integer> {
}
