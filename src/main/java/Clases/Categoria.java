package Clases;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idCategoria;
    public String nombreCategoria;
}
