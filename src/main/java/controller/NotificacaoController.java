/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entities.CriarNotificacaoRequest;
import entities.Endereco;
import entities.Notificacao;
import entities.Parte;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import service.EnderecoService;
import service.ParteService;
/**
 *
 * @author Nanda
 */


@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;
    
     @Autowired
    private ParteService parteService;

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Notificacao> criarNotificacao(@RequestBody CriarNotificacaoRequest request) {
        
        Parte parte = parteService.obterPartePorId(request.getParteId());
        Endereco endereco = enderecoService.obterEnderecoPorId(request.getEnderecoId());
        
        Notificacao notificacao = notificacaoService.criarNotificacao(parte, endereco, request.getTipoNotificacao(), request.getTipoEnvio());

        return ResponseEntity.ok(notificacao);
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarNotificacao(@RequestBody Notificacao notificacao) {
        notificacaoService.enviarNotificacao(notificacao);
        return ResponseEntity.ok("Notificação enviada com sucesso!");
    }

    @GetMapping("/correios")
    public ResponseEntity<List<Notificacao>> consultarNotificacoesCorreios() {
        List<Notificacao> notificacoes = notificacaoService.consultarNotificacoesCorreios();
        return ResponseEntity.ok(notificacoes);
    }

    @GetMapping("/email")
    public ResponseEntity<List<Notificacao>> consultarNotificacoesEmail() {
        List<Notificacao> notificacoes = notificacaoService.consultarNotificacoesEmail();
        return ResponseEntity.ok(notificacoes);
    }

    @GetMapping("/dje")
    public ResponseEntity<List<Notificacao>> consultarNotificacoesDje() {
        List<Notificacao> notificacoes = notificacaoService.consultarNotificacoesDje();
        return ResponseEntity.ok(notificacoes);
    }
    
    @GetMapping("/correios-nao-enviadas")
    public ResponseEntity<List<Notificacao>> obterNotificacoesCorreiosNaoEnviadas() {
        List<Notificacao> notificacoes = notificacaoService.obterNotificacoesCorreiosNaoEnviadas();
        return ResponseEntity.ok(notificacoes);
    }
}

