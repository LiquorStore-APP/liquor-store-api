package com.example.liquorstoreapi.Servicios;

import com.example.liquorstoreapi.Clases.DetalleVenta;
import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Clases.Ventas;
import com.example.liquorstoreapi.dto.ProductoRequest;
import com.example.liquorstoreapi.dto.VentaRequest;

import java.util.List;

public interface VentaService {
    Ventas createVenta(VentaRequest ventaRequest);
    List<Ventas> findAllVenta();
    Ventas initVenta(VentaRequest ventaRequest);
    DetalleVenta initDetalleVenta(VentaRequest ventaRequest);
    void deleteSaleById(int ventaId);
    List<Ventas> findVentasByDescription(String desc);
}
