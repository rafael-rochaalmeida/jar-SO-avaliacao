/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api.captura.get.Connection;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Luis
 */
public class ConnectionGetmobi {

    private BasicDataSource dataSource;

    private String urlConexao = "jdbc:sqlserver:"
            + "//getmobiserver.database.windows.net:1433;"
            + "database=getmobiBd;"
            + "user=getmobiadmin;"
            + "password={#Gfgrupo4};"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=30;";
    

    public ConnectionGetmobi() {
        this.dataSource = new BasicDataSource();
        this.dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.dataSource.setUrl(urlConexao);
        this.dataSource.setUsername("getmobiadmin");
        this.dataSource.setPassword("#Gfgrupo4");
    }

    // Getter

    public BasicDataSource getDatasource() {
        return dataSource;
    }

    public String getUrlConexao() {
        return urlConexao;
    }

//    public ConnectionGetmobi() {
//        
//        
//
////        dataSource = new BasicDataSource();
////        dataSource​.setDriverClassName("org.h2.Driver");
////        dataSource​.setUrl("jdbc:h2:file:D:\\Bandtec\\2ADSA-2021-1-Grupo-04\\API\\getmobi");
////        dataSource​.setUsername("sa");
////        dataSource​.setPassword("");
////        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
////        dataSource.setUrl("jdbc:mysql://localhost:3306/getmobi"
////                + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
////        //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
////        dataSource.setUsername("root");
////        dataSource.setPassword("bandtec");
////        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
////        dataSource.setUrl("jdbc:sqlserver://getmobiserver.database.windows.net/getmobiBd");
////        dataSource.setUsername("getmobiadmin");
////        dataSource.setPassword("#Gfgrupo4");
//        
//     
//        
//    }

    
}
