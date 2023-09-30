/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tools;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
            

/**
 *
 * @author u08774796151
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... vetCampo) {
        for (int i = 0; i < vetCampo.length; i++) {
           vetCampo[i].setEnabled(valor);
            
        }
    }
    
    public static void limp(JComponent ... vetCamp) {
        for (int i = 0; i < vetCamp.length; i++) {
            
            
           ((JTextField) vetCamp[i]).setText("");
            
        }
    }
    public static void msg( String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static int perguntar(String mensagem, String pergunta) {
      return  JOptionPane.showConfirmDialog(null,  mensagem, pergunta, JOptionPane.YES_NO_OPTION);
        
    }
    public static int strInt(String cad) {
        return 0;
    }
     public static String intStr(int num) {
        return "" ;
    }
     public static double strDouble(String cad) {
        return 0;
    }
      public static String doubleStr(String num) {
        return "";
    }
      public static Date strData(String cad) {
        return null;
    }
      public static String dataStr(String data) {
        return "";
    }
}
