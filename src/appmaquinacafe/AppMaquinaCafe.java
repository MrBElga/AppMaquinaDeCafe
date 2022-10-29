
package appmaquinacafe;

import javax.swing.JOptionPane;

public class AppMaquinaCafe {
    
    public static void main(String[] args) {
        String s="";
        MaquinaCafe mc = new MaquinaCafe();
        double moeda;
        mc.iniciarNovaVenda();
        while(JOptionPane.showConfirmDialog(null,
                "Deseja comprar café\nR$ "+mc.getPreco())!=JOptionPane.CANCEL_OPTION)
        {
           do{
               moeda=Double.parseDouble(JOptionPane.showInputDialog(null,
                       "Valor já Inserido R$ "+mc.getAcValorInserido()+
                       "\nInsira uma moeda"));
               if (mc.receberMoeda(moeda)==false)
                   JOptionPane.showMessageDialog(null, "Moeda inválida");
           }
           while(! mc.valorSuficiente());  
           JOptionPane.showMessageDialog(null, 
                   "Pegue seu café\nPegue seu troco de R$ "+mc.devolverTroco());
        }
        JOptionPane.showMessageDialog(null,
                "Total faturado R$ "+ mc.getTotFaturado()+
                "\nForam vendidos "+mc.getTotalCafesVendidos()+" cafés");
    }
}
