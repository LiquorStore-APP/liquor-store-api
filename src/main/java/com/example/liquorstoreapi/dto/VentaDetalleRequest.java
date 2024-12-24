package com.example.liquorstoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaDetalleRequest {
    public String productoDetalleVenta;
    public int cantidadDetalleVenta;
    public double precioDetalleVenta;
    public double subutilidadDetalleVenta;
    public double subTotalDetalleVenta;
}
