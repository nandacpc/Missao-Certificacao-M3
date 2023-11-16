/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Nanda
 */

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

