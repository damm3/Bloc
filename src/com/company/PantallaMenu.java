package com.company;

import java.io.File;
import java.util.Scanner;

public class PantallaMenu {

    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("BLOC DE NOTAS");    // // titulo = "BLOC DE NOTAS"

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String[] opciones = {"Crear", "Listar"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        }
    }
}
