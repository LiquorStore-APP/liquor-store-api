package com.example.liquorstoreapi.Repositorios;


import com.example.liquorstoreapi.Clases.MedioPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioPagoRepository extends JpaRepository<MedioPago,Integer> {
}
