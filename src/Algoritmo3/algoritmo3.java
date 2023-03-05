/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo3;

import javax.swing.JOptionPane;

/**
 *
 * @author notte
 */
public class algoritmo3 {
    
    static float baseMaior, baseMenor, altura, area;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        baseMaior = Float.parseFloat(JOptionPane.showInputDialog("Valor de uma base = "));
        baseMenor = Float.parseFloat(JOptionPane.showInputDialog("Valor da outra base = "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Valor da altura = "));
        
        // processamento
        area = baseMaior + baseMenor * altura;
        
        // definição de saida de dados
        JOptionPane.showMessageDialog(null,"Area = " + area);
        
    }
    
}
