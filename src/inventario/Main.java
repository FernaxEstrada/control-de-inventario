/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import javax.swing.*;

/**
 *
 * @author achoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------------------------");
        Inventario I = new Inventario();
        // Establecer el Nimbus al aspecto del sistema
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//Inicio mi interfaz principal
        SwingUtilities.invokeLater(() -> {
            JControl index = new JControl(I);
            index.setVisible(true);
        });
    }

}
