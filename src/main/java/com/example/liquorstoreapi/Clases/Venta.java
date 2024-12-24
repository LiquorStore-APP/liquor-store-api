package com.example.liquorstoreapi.Clases;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="Ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idVenta;
    public String clienteVenta;
    public Date fechaVenta;
    public double montoTotalVenta;
    public double utilidadTotalVenta;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detalleVentas;

    @ManyToOne()
    @JoinColumn(name = "idMedioPago")
    public MedioPago idMedioPagoVenta;

    public void setDetalleVentas(List<DetalleVenta> detalles) {
        this.detalleVentas = detalles;
        if (detalles != null) {
            detalles.forEach(detalle -> detalle.setVenta(this));
        }
    }
}
