package com.example.prova2024.Entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Size(min = 3, message = "O modelo deve ter no minimo 3 caracteres")
    private String modelo;

    @Size(min = 2, message = "A marca deve ter no minimo 2 caracteres")
    private String marca;

    @Min(value = 1886, message = "O ano não pode ser menor que 1886")
    @Max(value = 2024, message = "O ano não pode ser maior que 2024")
    private int ano;
    private String cor;

    @Min(value = 1, message = "O preço não pode ser menor que 1")
    private double preco;

    @Min(value = 0, message = "A quilometragem não pode ser menor que 0")
    private double quilometragem;
    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;
}
