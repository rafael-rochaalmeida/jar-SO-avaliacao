/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api.captura.get.Entidades;

/**
 *
 * @author nicho
 */
public class UsoMaquina {
    
    private Integer idUsoMaquina;
    private Double usoRam;
    private Double velocidadeGravacao;
    private Double porcentagemCPU;
    private Integer horario;
    private Integer fkComputador;

    @Override
    public String toString() {
        return "idUsoMaquina: " + idUsoMaquina +
                "\nusoRam: " + usoRam +
                "\nvelocidadeGravacao: " + velocidadeGravacao +
                "\nporcentagemCPU: " + porcentagemCPU + 
                "\nhorario: " + horario +
                "\nfkComputador: " + fkComputador;
    }
    

    public Integer getIdUsoMaquina() {
        return idUsoMaquina;
    }

    public void setIdUsoMaquina(Integer idUsoMaquina) {
        this.idUsoMaquina = idUsoMaquina;
    }

    public Double getUsoRam() {
        return usoRam;
    }

    public void setUsoRam(Double usoRam) {
        this.usoRam = usoRam;
    }

    public Double getVelocidadeGravacao() {
        return velocidadeGravacao;
    }

    public void setVelocidadeGravacao(Double velocidadeGravacao) {
        this.velocidadeGravacao = velocidadeGravacao;
    }

    public Double getPorcentagemCPU() {
        return porcentagemCPU;
    }

    public void setPorcentagemCPU(Double porcentagemCPU) {
        this.porcentagemCPU = porcentagemCPU;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }
           
         
         
    
}
