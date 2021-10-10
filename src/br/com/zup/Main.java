package br.com.zup;

import java.security.Provider;

public class Main {

    public static void main(String[] args) {
        try {
           Sistema.executar();
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }



    }
}