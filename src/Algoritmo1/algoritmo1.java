package Algoritmo1;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author notte
 */
public class algoritmo1 {

    /**
     * @param args the command line arguments
     */
     static float lado,area,peri;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        lado = Float.parseFloat(JOptionPane.showInputDialog("ENTRE COM O LADO DO QUADRADO"));
        
        // processamento
        area = lado * lado;
        peri = lado * 4;
        // definição de saida de dados
        JOptionPane.showMessageDialog(null,"Area = " + area);
        JOptionPane.showMessageDialog(null,"Perimetro = " + peri);
    }
    
}
