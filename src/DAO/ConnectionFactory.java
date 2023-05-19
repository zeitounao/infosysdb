/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kazuo
 */
public class ConnectionFactory {
    private static final String URL ="jdbc:sqlite:C:\\Users\\kazuo\\Documents\\NetBeansProjects\\InfoSys\\db\\InfoSysDB.db";
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL);
        }catch (SQLException e){
            throw new RuntimeException("Erro na conexão");
        }
    }
    public static void closeConnetion(Connection con){
        try{
            if(con != null) con.close();
        }catch (SQLException e){
            throw new RuntimeException("Erro no fechamento da conexão");
        }
    }
}
