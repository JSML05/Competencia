/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_CLiente;

import Logica_Negocio.Atleta;
import java.util.ArrayList;
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
        String Nombre;
        String Nacionalidad;
        double Tiempo;

        ArrayList<Atleta> Atletas = new ArrayList<>();
        int opc = 0;
        double retornop = 0;

        do {
            String menu = JOptionPane.showInputDialog(null, "Elija una opcion: \n"
                    + "1. Registrar Atleta \n"
                    + "2. Consultar Atletas por pais \n"
                    + "3. Consultar el tiempo promedio de todos los ateltas \n"
                    + "4. Consultar los datos del campeon \n"
                    + "5. Consultar todos los atletas \n"
                    + "6. Salir", "Competencia", 1);

            opc = Integer.parseInt(menu);

            switch (opc) {
                case 1:
                    Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de atleta: ", "Registrar", 1);
                    Nacionalidad = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad del atleta: ", "Registrar", 1);
                    Tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tiempo del atleta: ", "Registrar", 1));

                    Atleta objatleta = new Atleta(Nombre, Nacionalidad, Tiempo);
                    Atletas.add(objatleta);

                    break;

                /* Registrar campeon
                    case 2:
                    String NomC = JOptionPane.showInputDialog("Ingrese el nombre del campeon: ");
                    String NacionalidadC = JOptionPane.showInputDialog("Ingrese la nacionalidad del campeon: ");
                    double TiempoC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo del campeon: "));

                    Atleta objatleta1 = new Atleta(NomC, NacionalidadC, TiempoC);
                    Atletas.add(objatleta1);

                    break;
                 */
                case 2:
                    String NombrePais = JOptionPane.showInputDialog(null, "Ingrese el nombre del pais: ", "Representante/s", 1);
                    String Informacion = "";
                    for (int i = 0; i < Atletas.size(); i++) {
                        if (Atletas.get(i).getNacionalidad().equals(NombrePais)) {

                            Informacion += " Nombre: " + Atletas.get(i).getNombre() + "\n"
                                    + " Nacionalidad: " + Atletas.get(i).getNacionalidad() + "\n"
                                    + " Tiempo: " + Atletas.get(i).getTiempo() + " Minutos \n\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, Informacion, "Representante/s", 1);

                    break;

                case 3:
                    if (Atletas.size() > 0) {

                        retornop = Atleta.PromedioTiempo(Atletas);
                        JOptionPane.showMessageDialog(null, retornop + " minutos", "Promedio", 1);

                    } else {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    }

                    break;

                case 4:
                    if (Atletas.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    } else {
                        Atleta campeon = Atletas.get(0);

                        // Iterar sobre los atletas para encontrar al campeón
                        for (int i = 1; i < Atletas.size(); i++) {
                            if (Atletas.get(i).getTiempo() < campeon.getTiempo()) {
                                campeon = Atletas.get(i); // Actualizar el campeón si se encuentra un tiempo más bajo
                            }
                        }

                        // Mostrar los datos del campeón
                        JOptionPane.showMessageDialog(null, "Campeon:\n"
                                + "Nombre: " + campeon.getNombre() + "\n"
                                + "Nacionalidad: " + campeon.getNacionalidad() + "\n"
                                + "Tiempo: " + campeon.getTiempo() + " Minutos", "Datos del campeon", 1);
                    }

                    break;

                case 5:
                    if (Atletas.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    } else {
                        String InfoTotal = "";
                        for (int i = 0; i < Atletas.size(); i++) {

                            InfoTotal += " Nombre: " + Atletas.get(i).getNombre() + "\n"
                                    + " Nacionalidad: " + Atletas.get(i).getNacionalidad() + "\n"
                                    + " Tiempo: " + Atletas.get(i).getTiempo() + " Minutos \n\n";

                        }
                        JOptionPane.showMessageDialog(null, InfoTotal, "Atletas", 1);
                    }

                    break;

                case 6:
                    //Salir
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida para el menu");

                    break;
            }
        } while (opc != 6);
    }

}
