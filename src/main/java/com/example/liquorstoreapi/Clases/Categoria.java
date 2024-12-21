package com.example.liquorstoreapi.Clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Categorias")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int idCategoria;
    public String nombreCategoria;
}
