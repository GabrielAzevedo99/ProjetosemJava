/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo2;

import javax.swing.JOptionPane;

/**
 *
 * @author notte
 */
public class algoritmo2 {
    
    static float base, altura, area;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base = "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura = "));
        
        // processamento
        area = base * altura / 2;
        
        // definição de saida de dados
        JOptionPane.showMessageDialog(null,"Area = " + area);
        
    }
    
}
