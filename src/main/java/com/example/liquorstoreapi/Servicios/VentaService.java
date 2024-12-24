package com.example.liquorstoreapi.Servicios;

import com.example.liquorstoreapi.Clases.DetalleVenta;
import com.example.liquorstoreapi.Clases.Venta;
import com.example.liquorstoreapi.dto.VentaRequest;

import java.util.List;

public interface VentaService {
    Venta createVenta(VentaRequest ventaRequest);
    List<Venta> findAllVenta();
    void deleteSaleById(int ventaId);
    List<Venta> findVentasByDescription(String desc);
}
