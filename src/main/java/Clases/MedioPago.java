package Clases;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="MedioPago")
public class MedioPago {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idMedioPago;
    public String nombreMedioPago;
}
