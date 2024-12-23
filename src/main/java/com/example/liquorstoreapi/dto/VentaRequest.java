package com.example.liquorstoreapi.dto;

import com.example.liquorstoreapi.Clases.DetalleVenta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaRequest {
    private String nombreCliente;
    private Date fechaVenta;
    private double montoTotalVenta;
    private double utilidadTotalVenta;
    private int idMedioPagoVenta;
    private DetalleVenta detalleVenta;
}
