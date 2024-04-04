/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_CLiente;

import javax.swing.JOptionPane;

/**
 *
 * @author jsml
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        do {
            String menu = JOptionPane.showInputDialog("Compretencia \n"
                    + "1. Registrar Atleta \n"
                    + "2. Datos del campeon \n"
                    + "3. Atletas por pais \n"
                    + "4. Tiempo promedio de todos los ateltas \n"
                    + "5. Salir");

            opc = Integer.parseInt(menu);

            switch (opc) {
                case 1:
                    String Nombre = JOptionPane.showInputDialog("Ingresar el nombre: ");

                    break;

                case 2:
                    String NomCampeon = JOptionPane.showInputDialog("Ingrese el nombre del campeon: ");
                    String Nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad del campeon: ");
                    String Tiempo = JOptionPane.showInputDialog("Ingrese el tiempo del campeon: ");

                    int TiempoF = Integer.parseInt(Tiempo);

                    break;

                case 4:

                    break;

                case 5:
                    //Salir
                    break;
                default:
                    System.out.println("Opcion no valida para el menu");

                    break;
            }
        } while (opc != 5);
    }

}
