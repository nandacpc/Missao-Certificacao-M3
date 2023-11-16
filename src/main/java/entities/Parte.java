/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nanda
 */
@Setter
@Getter
@Entity
public class Parte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Column(unique = true, nullable = false)
    @Pattern(regexp = "^[0-9]{11,14}$")
    private String documento;

    private String email;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parte parte = (Parte) o;
        return Objects.equals(documento, parte.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}