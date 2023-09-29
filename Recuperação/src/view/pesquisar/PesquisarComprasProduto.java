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
public class PesquisarComprasProduto extends AbstractTableModel{


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public Bcm_compras_produto getBcm_compras_produto(int row) {
        return (Bcm_compras_produto) lista.get(row);
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
        Bcm_compras_produto bcm_compras_produto = (Bcm_compras_produto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return bcm_compras_produto.getIdbcm_compras_produto();
        }
        if (columnIndex == 1) {
            return bcm_compras_produto.getNome();
        }
        if (columnIndex == 2) {
            return bcm_compras_produto.getAtivo();
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
