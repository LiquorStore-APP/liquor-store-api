package com.example.liquorstoreapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaResponse {
    private String nombreCliente;
    private String fechaVenta;
    private double montoTotalVenta;
    private double utilidadTotalVenta;
    private String nombreMedioPagoVenta;
}
