/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyecto004;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        
        Ventana01 v1 = new Ventana01("BorderLayout");
        v1.setVisible(true);
        Ventana02 v2 = new Ventana02("GridLayout");
        v2.setVisible(true);
        Ventana03 v3 = new Ventana03("FlowLayout");
        v3.setVisible(true);
        
        VentanaBandera v4 = new VentanaBandera("BorderLayout");
        v4.setVisible(true);
    }
}
