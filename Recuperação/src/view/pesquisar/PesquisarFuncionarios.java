/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.BcmFuncionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author migma
 */
public class PesquisarFuncionarios extends AbstractTableModel{


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public BcmFuncionarios getBean(int row) {
        return (BcmFuncionarios) lista.get(row);
    }

    public BcmFuncionarios getBcmFuncionarios(int row) {
        return (BcmFuncionarios) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BcmFuncionarios bcmFuncionarios = (BcmFuncionarios) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcmFuncionarios.getIdbcmFuncionario();
        }
        if (columnIndex == 1) {
            return bcmFuncionarios.getBcmNome();
        }
        if (columnIndex == 2) {
            return bcmFuncionarios.getBcmAtivo();
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
                return "Ativo";
        }
        return "";
    }

 
    
}
