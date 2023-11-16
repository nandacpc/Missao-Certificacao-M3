/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entities.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EnderecoRepository;

/**
 *
 * @author Nanda
 */
@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    
    public Endereco obterEnderecoPorId(Long id) {
    return enderecoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Endereco nao encontrado com ID: " + id));
    }
}
