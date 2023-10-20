/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.BcmProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author migma
 */
public class PesquisarProdutos extends AbstractTableModel{
private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public BcmProdutos getBcmProdutos(int row) {
        return (BcmProdutos) lista.get(row);
    }
     public BcmProdutos getBean(int row) {
        return (BcmProdutos) lista.get(row);
    }

    @Override
    public int getRowCount() {
        if (lista == null) {
            return 0;
        } else {
            return lista.size();
        }
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BcmProdutos bcm_produtos = (BcmProdutos) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcm_produtos.getIdbcmProdutos();
        }
        if (columnIndex == 1) {
            return bcm_produtos.getBcmNome();
        }
        if (columnIndex == 2) {
            return bcm_produtos.getBcmPreco();
        }

        return null;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "Preco";
        }
        return "";
    }

 
    
}