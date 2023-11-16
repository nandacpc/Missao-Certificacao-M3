/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Notificacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nanda
 */

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
    List<Notificacao> findByTipoNotificacao(String tipoNotificacao);
    List<Notificacao> findByTipoNotificacaoAndTipoEnvioAndStatus(String tipoNotificacao, String tipoEnvio, String status);
}

