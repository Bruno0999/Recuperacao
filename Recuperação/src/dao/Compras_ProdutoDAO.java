/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.BcmComprasProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author migma
 */
public class Compras_ProdutoDAO extends DAO_Abstract{

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
        session.beginTransaction().commit();
        }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.beginTransaction().commit();  
        }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(BcmComprasProduto.class);
        criteria.add(Restrictions.eq("idbcm_compras_produto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
        }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(BcmComprasProduto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;   
    }   
}
    

