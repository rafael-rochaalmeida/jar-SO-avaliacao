/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*idUsuario int primary key auto_increment,
	nomeUsuario varchar(45),
	usuario varchar(45),
	sala varchar(45),
	senhaUsuario varchar(45),
	fkEscola int,*/
package com.mycompany.api.captura.get.Entidades;

/**
 *
 * @author nicho
 */
public class Usuario {
    private Integer IdUsuario;
    private String nomeUsuario;
    private String usuario;
    private String sala;
    private String senhaUsuario;
    private Integer fkEscola;

    public Usuario(Integer IdUsuario, String nomeUsuario, String usuario, String sala, String senhaUsuario, Integer fkEscola) {
        this.IdUsuario = IdUsuario;
        this.nomeUsuario = nomeUsuario;
        this.usuario = usuario;
        this.sala = sala;
        this.senhaUsuario = senhaUsuario;
        this.fkEscola = fkEscola;
    }

    

    @Override
    public String toString() {
        return "nomeUsuario: " + nomeUsuario + 
                "\nusuario: " + usuario +
                "\nsala: " + sala + 
                "\nsenhaUsuario: " + senhaUsuario +
                "\nfkEscola: " + fkEscola;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Integer getFkEscola() {
        return fkEscola;
    }

    public void setFkEscola(Integer fkEscola) {
        this.fkEscola = fkEscola;
    }

    
    
    
  
}
