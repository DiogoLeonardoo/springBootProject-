package br.edu.ifs.apinewsigaa.model;

import java.util.Date;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "aluno")

public class AlunoModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", length = 255, nullable = false)
    private String nome;
    @Column(name = "cpf" , length = 14, nullable = false, unique = true)
    private String cpf;
    @Column(name = "email", length = 255, nullable = false)
    private String email;
    @Column(name = "dataNascimento", nullable = false)
    private Date dataNascimento;
    @Column(name = "celular", length = 14, nullable = false)
    private String celular;
    @Column(name = "apelido", length = 255, nullable = true)
    private String apelido;
    @Column(name = "matricula", nullable = false, unique = true)
    private int matricular;
    
}
