/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class DAO_Abstract {
    
    public Session session;
    public Connection cnt = null;
    public PreparedStatement pstm = null;
    public ResultSet rs = null;
    public String sql = "";

    public DAO_Abstract() {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       session = sessionFactory.openSession();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/robotica?useTimeZone=true&serverTimezone=UTC";
            user = "root";
            password = "bcm200507";
            
            cnt = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_Abstract.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Abstract.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public abstract void insert(Object object);

    public abstract void update(Object object);

    public abstract void delete(Object object);

    public abstract Object list(int id);

    public abstract List listAll();
}
