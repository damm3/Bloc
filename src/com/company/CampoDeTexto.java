package com.company;

public class CampoDeTexto {

    String pedir(String prompt, boolean obligatiorio){
        System.out.println("\033[31m" + prompt + ":\033[0m");

        if(!obligatiorio){
            return Main.scanner.nextLine();
        } else {

            while(true){
                String texto = Main.scanner.nextLine();

                if(!texto.isEmpty()){
                    return texto;
                } else {
                    Mensaje mensaje =new Mensaje();
                    mensaje.mostrarError("Introduzca el campo!");
                }
            }
        }
    }
}
