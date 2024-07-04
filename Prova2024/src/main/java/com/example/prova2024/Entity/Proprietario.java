package com.example.prova2024.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private Long id;

    @Size(min = 3, message = "O nome deve ter no minimo 3 caracteres")
    private String nome;
    private String cpf;

    @Email(message = "Email informado não é valido")
    private String email;
    private String telefone;
    private String endereco;

    @Past
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "proprietario")
    private List<Carro> carro;

}
