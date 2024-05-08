/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.DAAPP02Practica03;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ville
 */
public interface RepositoryEmpleado extends JpaRepository<Empleado, Long> {
    
}
