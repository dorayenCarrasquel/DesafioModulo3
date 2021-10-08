package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner receverDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Cliente cadastrarCliente(){
        System.out.println("Cadastro Cliente");
        String nomeCliente = receverDados("Digite o nome do Cliente: ").nextLine();
        String cpfCliente = receverDados("Digite o CPF do Cliente: ").nextLine();
        String emailCliente = receverDados("Digite o e-mail do Cliente: ").nextLine();
        return ServiceCliente.cadastrarCliente(nomeCliente,emailCliente,cpfCliente);
    }

    public static Vendedor cadastrarVendedor(){
        System.out.println("Cadastro Cliente");
        String nomeVendedor =  receverDados("Digite o nome do Vendedor: ").nextLine();
        String cpfVendedor = receverDados("Digite o CPF do Vendedor: ").nextLine();
        String emailVendedor = receverDados("Digite o e-mail do Vendedor: ").nextLine();
        return ServiceVendedor.cadastrarVendedor(nomeVendedor,emailVendedor,cpfVendedor);
    }


}
