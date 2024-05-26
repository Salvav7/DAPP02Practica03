/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DAAPP02Practica03;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Ville
 */
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "usuario_id_usuarios_seq")
    @SequenceGenerator(name = "usuario_id_usuarios_seq",
            sequenceName = "usuario_id_usuarios_seq",
            initialValue = 1, allocationSize = 1)
    @Column(name = "id_usuarios")
    private Long clave;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    public Long getClave() {
        return clave;
    }

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
