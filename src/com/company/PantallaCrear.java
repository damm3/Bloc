package com.company;


public class PantallaCrear {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR NOTA");     // titulo = "CREAR NOTA"

        Nota nota = new Nota();

        CampoDeTexto campoDeTexto = new CampoDeTexto();

        nota.titulo = campoDeTexto.pedir("Titulo de la nota", true);
        nota.contenido = campoDeTexto.pedir("Contenido del mensaje");
        nota.dia = campoDeTexto.pedirNumero("Dia de la nota");

        Main.blocDeNotas.notas.add(nota);
    }
}
