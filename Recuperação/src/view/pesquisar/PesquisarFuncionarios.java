/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

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

    public Bcm_funcionarios getBcm_funcionarios(int row) {
        return (Bcm_funcionarios) lista.get(row);
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
        Bcm_funcionarios bcm_funcionarios = (Bcm_funcionarios) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcm_funcionarios.getIdbcm_funcionarios();
        }
        if (columnIndex == 1) {
            return bcm_funcionarios.getNome();
        }
        if (columnIndex == 2) {
            return bcm_funcionarios.getAtivo();
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
