/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author jsml
 */
public class Atleta {

    //Declaracion de atributos
    public String Nombre;
    public String Nacionalidad;
    public Double Tiempo;

    //Constructor no parametrizado
    public Atleta() {
    }

    //Constructor parametrizado
    public Atleta(String Nombre, String Nacionalidad, Double Tiempo) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Tiempo = Tiempo;
    }

    //Setters y getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

    public static double PromedioTiempo(ArrayList<Atleta> Atletas) {
        double suma = 0;
        double resta = 0;
        double promedio = 0;

        for (int i = 0; i < Atletas.size(); i++) {

            suma += Atletas.get(i).getTiempo();

        }

        promedio = suma / Atletas.size();

        return promedio;
    }

}
