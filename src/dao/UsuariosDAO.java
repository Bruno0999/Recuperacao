/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.BcmUsuarios;
import static java.lang.Thread.State.NEW;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u08774796151
 */


public class UsuariosDAO extends DAO_Abstract {
    
    // Suponha que users seja uma coleção que contém seus usuários
    private static List<BcmUsuarios> users = new ArrayList<>();

    // Método para adicionar usuários (simulando o banco de dados)
    public static void adicionarUsuario(BcmUsuarios usuario) {
        users.add(usuario);
    }

    // Método para validar o login
    public static BcmUsuarios Validar(String username, String password) {
        for (BcmUsuarios usuario : users) {
            if (usuario.getBcmNome().equals(username) && usuario.getBcmSenha().equals(password)) {
                return usuario;  // Retorna o usuário se as credenciais coincidirem
            }
        }
        return null;  // Retorna null se as credenciais não forem encontradas
    }

 
    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.beginTransaction().commit();    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.beginTransaction().commit();     }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(BcmUsuarios.class);
        criteria.add(Restrictions.eq("idbcm_usuarios", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(BcmUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;    }
    
    public List ListNome(String nome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(BcmUsuarios.class);
        criteria.add(Restrictions.like("nome", "%"+nome+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public static void main(String[] args){
        UsuariosDAO usuariosDAO = new UsuariosDAO();
    }
}


