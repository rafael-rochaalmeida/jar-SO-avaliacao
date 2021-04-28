/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
idEscola int primary key auto_increment,
	nomeEscola varchar(45),
	email varchar(45),
	telFixo int
*/
package com.mycompany.api.captura.get.Entidades;

public class Escola {
    
    
  private Integer idEscola;  
  private String nomeEscola;
  private String email;
  private Integer telFixo;

    @Override
    public String toString() {
        return "idEscola: " + idEscola + 
                "\nnomeEscola: " + nomeEscola + 
                "\nemail: " + email + 
                "\ntelFixo: " + telFixo;
    }
  
    public Integer getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Integer idEscola) {
        this.idEscola = idEscola;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(Integer telFixo) {
        this.telFixo = telFixo;
    }
    

    
}
