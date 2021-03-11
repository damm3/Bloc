package com.company;

public class PantallaCrear {
    void mostrar(){
        Titulo titulo = new Titulo();

        titulo.mostrar("CREAR NOTA");     // titulo = "CREAR NOTA"

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("No existe la BD");
    }
}
