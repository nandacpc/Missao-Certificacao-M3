/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nanda
 */

@Setter
@Getter
public class CriarNotificacaoRequest {

    private Long parteId;

    private Long enderecoId;

    private String tipoNotificacao;

    private String tipoEnvio;

}

