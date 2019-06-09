/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connector.config;
import java.sql.PreparedStatement;

/**
 *
 * @author albariiqy
 */
public class m_Overview extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Overview() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public int getcapacity(int id_wh) {
        int capacity = 0;
        
        try {
        String sql = "select kapasitas_wh from warehouse where id_wh = " + id_wh;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        capacity = resultSet.getInt("kapasitas_wh");
            
        } catch (Exception e) {
        }
        return capacity;
    }

    public int datapercentage(int id_wh) {
        int progress = 0;
        try {

            m_Service_Load load = new m_Service_Load();

            int a = load.whava(id_wh);
            int b = getcapacity(id_wh);

            progress = b-a;
//            System.out.println(a +","+ b +","+(b-a)+"," +progress);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(progress);
        return progress;
    }

}
