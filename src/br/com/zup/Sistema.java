package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner receverDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Cliente cadastrarCliente(){
        System.out.println("Cadastro Cliente");
        String nome = receverDados("Digite o nome do Cliente: ").nextLine();
        String cpf = receverDados("Digite o CPF do Cliente: ").nextLine();
        String email = receverDados("Digite o e-mail do Cliente: ").nextLine();
        return ServiceCliente.cadastrarCliente(nome,email,cpf);
    }
}