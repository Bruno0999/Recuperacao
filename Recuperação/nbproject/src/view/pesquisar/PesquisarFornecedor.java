/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.BcmFornecedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author migma
 */
public class PesquisarFornecedor extends AbstractTableModel {


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public BcmFornecedores getBcmFornecedores(int row) {
        return (BcmFornecedores) lista.get(row);
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
        BcmFornecedores bcmFornecedores = (BcmFornecedores) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcmFornecedores.getIdbcmFornecedores();
        }
        if (columnIndex == 1) {
            return bcmFornecedores.getBcmNome();
        }
        if (columnIndex == 2) {
            return bcmFornecedores.getBcmRepresentante();
        }

        return "";
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "Ativo";
        }
        return "";
    }

 
    
}
