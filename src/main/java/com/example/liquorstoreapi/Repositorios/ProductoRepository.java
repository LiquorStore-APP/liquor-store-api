package com.example.liquorstoreapi.Repositorios;

import com.example.liquorstoreapi.Clases.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
    @Query(value = "SELECT prod FROM Producto prod WHERE " +
            "CAST(prod.id AS string) LIKE %?1% OR " +
            "prod.nombreProducto LIKE %?1% OR " +
            "CAST(prod.costoProducto AS string) LIKE %?1% OR " +
            "CAST(prod.precioProducto AS string) LIKE %?1% OR " +
            "CAST(prod.idCategoriaProductos AS string) LIKE %?1% OR " +
            "CAST(prod.stockProducto AS string) LIKE %?1% OR " +
            "prod.rutaimagenProducto LIKE %?1%")
    List<Producto> findByDescrip(String desc);
}
