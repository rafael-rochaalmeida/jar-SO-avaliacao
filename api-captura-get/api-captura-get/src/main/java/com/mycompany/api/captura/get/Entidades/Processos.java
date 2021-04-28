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
public class Processos {
    
    private Integer idProcessos;
    private String nomePrograma;
    private Double qtdRam;
    private Double qtdCPU;
    private Double qtdDisco;
    private Integer horario;
    private Integer fkComputadorP;

    @Override
    public String toString() {
        return "idProcessos: " + idProcessos +
                "\nnomePrograma: " + nomePrograma + 
                "\nqtdRam: " + qtdRam + 
                "\nqtdCPU: " + qtdCPU + 
                "\nqtdDisco: " + qtdDisco +
                "\nhorario: " + horario + 
                "\nFkComputadorP: "  + fkComputadorP;
    }
    
    

    public Integer getIdProcessos() {
        return idProcessos;
    }

    public void setIdProcessos(Integer idProcessos) {
        this.idProcessos = idProcessos;
    }

    public String getNomePrograma() {
        return nomePrograma;
    }

    public void setNomePrograma(String nomePrograma) {
        this.nomePrograma = nomePrograma;
    }

    public Double getQtdRam() {
        return qtdRam;
    }

    public void setQtdRam(Double qtdRam) {
        this.qtdRam = qtdRam;
    }

    public Double getQtdCPU() {
        return qtdCPU;
    }

    public void setQtdCPU(Double qtdCPU) {
        this.qtdCPU = qtdCPU;
    }

    public Double getQtdDisco() {
        return qtdDisco;
    }

    public void setQtdDisco(Double qtdDisco) {
        this.qtdDisco = qtdDisco;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }
        
}
