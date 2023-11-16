/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entities.Parte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ParteRepository;

/**
 *
 * @author Nanda
 */

@Service
public class ParteService {

    @Autowired
    private ParteRepository parteRepository;

    public Parte salvarParte(Parte parte) {
        
        Parte parteExistente = parteRepository.findByDocumento(parte.getDocumento());
        
        if (parteExistente != null) {            
            return parteExistente;
        }

        return parteRepository.save(parte);
    }
    
    public Parte obterPartePorId(Long id) {

        return parteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Parte não encontrada com ID: " + id));
    }
}

