package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Cliente clienteCadastro= Sistema.cadastrarCliente();
        Cliente clienteCadastrO= Sistema.cadastrarCliente();
        System.out.println(ServiceCliente.clientes);
    }
}