/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.BcmComprasProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author migma
 */
public class PesquisarComprasProduto extends AbstractTableModel{


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public BcmComprasProduto getBcmComprasProduto(int row) {
        return (BcmComprasProduto) lista.get(row);
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
        BcmComprasProduto bcmComprasProduto = (BcmComprasProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcmComprasProduto.getIdbcmComprasProduto();
        }
        if (columnIndex == 1) {
            return bcmComprasProduto.getBcmQuantia();
        }
        if (columnIndex == 2) {
            return bcmComprasProduto.getBcmDataCompra();
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
