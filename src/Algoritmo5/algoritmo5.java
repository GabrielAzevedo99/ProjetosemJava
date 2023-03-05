/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo5;

import javax.swing.JOptionPane;

/**
 *
 * @author notte
 */
public class algoritmo5 {
    static float a,b,c, delta, x1, x2;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        a = Float.parseFloat(JOptionPane.showInputDialog("Primeiro valor = "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Segundo valor = "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Terceiro valor = "));
        
        // processamento
        delta = (float) Math. pow(b, 2) - 4 * a * c;
        JOptionPane.showMessageDialog(null,"Delta = " + delta);
        
        if(delta > 0){
            x1 = (float) (-b + Math. pow(delta, 0.5) / 2 * a);
            x2 = (float) (-b - Math. pow(delta, 0.5) / 2 * a);
            JOptionPane.showMessageDialog(null,"Delta = " + x1 + x2);
        }else{
            JOptionPane.showMessageDialog(null,"Não pode ser calculado");
            
        
    }
    
    }
}
