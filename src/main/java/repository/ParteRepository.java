/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Parte;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Nanda
 */

public interface ParteRepository extends JpaRepository<Parte, Long> {
    Parte findByDocumento(String documento);
}

