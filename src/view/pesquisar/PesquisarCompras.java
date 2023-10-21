/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.BcmCompras;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author migma
 */
public class PesquisarCompras extends AbstractTableModel {
private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public BcmCompras getBcmCompras(int row) {
        return (BcmCompras) lista.get(row);
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
        BcmCompras bcmCompras = (BcmCompras) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcmCompras.getIdbcmCompras();
        }
        if (columnIndex == 1) {
            return bcmCompras.getBcmPreco();
        }
        if (columnIndex == 2) {
            return bcmCompras.getBcmDataCompra();
        }

        return "";
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Quantia";
            case 2:
                return "DataCompra";
        }
        return "";
    }

 
    
}