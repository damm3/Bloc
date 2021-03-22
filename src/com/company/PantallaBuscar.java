package com.company;

public class PantallaBuscar {

    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("BUSQUEDA");

        System.out.println("Texto a buscar");

        String textoABuscar = Main.scanner.nextLine();


        for(Nota nota: Main.blocDeNotas.notas){
            if(nota.contenido.equals(textoABuscar)){
                System.out.println(nota.contenido);
            } else {
                System.out.println("no extise la nota");
            }
        }

    }
}


/*

JOSE

{  JUAN, JOSE, ENJUTO}



 */

