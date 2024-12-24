package com.example.liquorstoreapi.Clases;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    public Venta venta;

    public String productoDetalleVenta;
    public int cantidadDetalleVenta;
    public double precioDetalleVenta;
    public double subutilidadDetalleVenta;
    public double subTotalDetalleVenta;
}
