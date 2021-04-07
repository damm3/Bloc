package com.company;

public class CampoDeTexto {


    String pedir(String prompt) {
        return pedir(prompt, false);
    }

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

    int pedirNumero(String prompt){
        while(true) {
            System.out.println("\033[31m" + prompt + ":\033[0m");
            try {
                return Integer.parseInt(Main.scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Introduce un numero");
            }
        }
    }
}
