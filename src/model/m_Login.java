/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import connector.config;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import static view.Login.status;
import view.v_service;
import view.v_storage;
import view.Login;
import static view.Login.status;

public class m_Login extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Login() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] getAkun(String user, String pass) throws SQLException {
        status = new int[2];
        String sql = "select * from users where username = ? and password = ?";
        connection = connection();
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
        preparedStatement.setString(1, user);
        preparedStatement.setString(2, pass);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        status[0] = resultSet.getInt("user_id");
        status[1] = resultSet.getInt("status");
        System.out.println(status[1]);
        return status;
    }

    public String getUsername(int id) throws SQLException {
        String sql = "select * from users where user_id = ?";
        connection = connection();
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String user = resultSet.getString("username");
        return user;
    }
}
