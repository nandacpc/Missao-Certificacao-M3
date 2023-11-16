/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nanda
 */
@Entity
@Getter
@Setter
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parte_id")
    private Parte parte;
    
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    private String tipoProcesso;

    private String numeroProcesso;

    @Lob
    private String dadosNotificacao;

    private String tipoNotificacao; // "correios", "email" ou "DJe"

    private String status; // "não notificado", "enviado"

    private Date dataEnvio;

}
