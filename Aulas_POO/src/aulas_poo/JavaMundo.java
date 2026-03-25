/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author 86243542505
 */
public class JavaMundo {
    public static void main(String[] args) {
        // TODO code application logic here
        String arm="";
        Aulas_POO.SerHumano Caio = new Aulas_POO().new SerHumano();
        String res;
        
        do{
            Caio.setNome(JOptionPane.showInputDialog(null,"Digite o nome:","Nome",1));
            Caio.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade:","Idade",1)));
            Caio.setCorDosOlhos(JOptionPane.showInputDialog(null,"Digite a cor dos olhos:","CorDosOlhos",1));
            Caio.setCorDosCabelos(JOptionPane.showInputDialog(null,"Digite a cor dos cabelos:","CorDosCabelos",1));
            Caio.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura:","Altura",1)));
            Caio.setEtnia(JOptionPane.showInputDialog(null,"Digite a etnia:","Etnia",1));
            
            
        arm += "Nome: " + Caio.getNome() + "\n" +
        "Idade: " + Caio.getIdade() + "\n" +
        "Cor dos olhos: " + Caio.getCorDosOlhos() + "\n" +
        "Cor dos cabelos: " + Caio.getCorDosCabelos() + "\n" +
        "Altura: " + Caio.getAltura() + "\n" +
        "Etnia: " + Caio.getEtnia() + "\n\n";
            
            res=JOptionPane.showInputDialog(null,"Deseja continuar cadastrando [s/n]:","Aviso",0);
        }while((res.equals("s"))||(res.equals("S")));
        
        Caio.falar();
        Caio.dormir();
        
        JOptionPane.showMessageDialog(null,arm,"Relatório", 1);
       
    }
}
