/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo6;

import javax.swing.JOptionPane;

/**
 *
 * @author notte
 */
public class algoritmo6 {
    
    static float raio, altura, area, ab, al, at, litros, latas, custo;
     
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    // definição de entrada de dados
        raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio = "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura = "));
        
        area = (float) (2 * 3.14 * raio * (altura + raio));
        JOptionPane.showMessageDialog(null,"Area primeiro metodo = " + area);
        
        ab = (float) (3.14 * (Math. pow(raio, 2)));
        al = (float) (2 * 3.14 * raio * altura);
        at = 2 * ab + al;
        JOptionPane.showMessageDialog(null,"Area segundo metodo = " + at);
        
        litros = area / 3;
        latas = litros / 5;
        JOptionPane.showMessageDialog(null,"Latas necessarias = " + latas);
        
        custo = latas * 50;
        JOptionPane.showMessageDialog(null,"Custo total = " + custo);
        
    }
    
}
