/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo4;

import javax.swing.JOptionPane;

/**
 *
 * @author notte
 */
public class algoritmo4 {
    
    static float num1, num2;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor = "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro valor = "));
        
        
        // definição de saida de dados
        JOptionPane.showMessageDialog(null,"Primeiro valor elevado ao segundo = " + Math. pow(num1, num2));
        JOptionPane.showMessageDialog(null,"Primeiro valor vezes o segundo = " + num1 * num2);
        JOptionPane.showMessageDialog(null,"soma do primeiro numero com a metade do primeiro = " + (num2 + (num1 / 2)));
        JOptionPane.showMessageDialog(null,"Valor oposto do segundo numero = " + num2 * -1);
        
    }
}
