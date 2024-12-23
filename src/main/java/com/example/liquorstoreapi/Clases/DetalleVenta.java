package com.example.liquorstoreapi.Clases;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idDetalleVenta;

    @ManyToOne()
    @JoinColumn(name = "idVenta")
    public Ventas idVentaDetalleVenta;
    public String ProductoDetalleVenta;
    public int cantidadDetalleVenta;
    public double precioDetalleVenta;
    public double subutilidadDetalleVenta;
    public double subTotalDetalleVenta;
}
