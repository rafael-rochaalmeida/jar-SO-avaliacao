
package com.mycompany.api.captura.get.Entidades;

import Connection.ConnectionGetmobi;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
idComputador int primary key auto_increment,
	usoRam double,
	qtdGravacao double,
	porcetagemCPU double,
	frequenciaCPU double,
	horario datetime
 */
public class Computador {
    
    ConnectionGetmobi conexao = new ConnectionGetmobi();
    
   
    
    private Integer idComputador;
    private Double freqTotalCPU;
    private Double qtdGravacao;
    private Double porcentagemCPU;


    @Override
    public String toString() {
        return "idComputador: " + idComputador +
               "\nFrequenciaTotal: " + freqTotalCPU + 
               "\narmazenamentoTotal: " + qtdGravacao + 
               "\nfkUsuario: " + porcentagemCPU;
    }     

    
    
    
    
    
    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public Double getFreqTotalCPU() {
        return freqTotalCPU;
    }

    public void setFreqTotalCPU(Double freqTotalCPU) {
        this.freqTotalCPU = freqTotalCPU;
    }

    public Double getQtdGravacao() {
        return qtdGravacao;
    }

    public void setQtdGravacao(Double qtdGravacao) {
        this.qtdGravacao = qtdGravacao;
    }

    public Double getPorcentagemCPU() {
        return porcentagemCPU;
    }

    public void setPorcentagemCPU(Double porcentagemCPU) {
        this.porcentagemCPU = porcentagemCPU;
    }
    
    
  


    
}
