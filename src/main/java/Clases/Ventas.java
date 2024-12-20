package Clases;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idVenta;
    public String clienteVenta;
    public Date fechaVenta;
    public double montoTotalVenta;
    public double utilidadTotalVenta;

    @ManyToOne()
    @JoinColumn(name = "idMedioPago")
    public MedioPago idMedioPagoVenta;
}
