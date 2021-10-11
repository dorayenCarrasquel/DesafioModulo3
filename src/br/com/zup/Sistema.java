package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner receverDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Cliente cadastrarCliente() throws Exception{
        System.out.println("Cadastro Cliente");
        String nomeCliente = receverDados("Digite o nome do Cliente: ").nextLine();
        String cpfCliente = receverDados("Digite o CPF do Cliente: ").nextLine();
        String emailCliente = receverDados("Digite o e-mail do Cliente: ").nextLine();
        return ServiceCliente.cadastrarCliente(nomeCliente, emailCliente, cpfCliente);
    }

    public static Vendedor cadastrarVendedor() throws Exception{
        System.out.println("Cadastro Vendedor");
        String nomeVendedor = receverDados("Digite o nome do Vendedor: ").nextLine();
        String cpfVendedor = receverDados("Digite o CPF do Vendedor: ").nextLine();
        String emailVendedor = receverDados("Digite o e-mail do Vendedor: ").nextLine();
        return ServiceVendedor.cadastrarVendedor(nomeVendedor, emailVendedor, cpfVendedor);
    }

    public static Venda cadastrarVenda() throws Exception {
        System.out.println("Cadastro da Fatura");
        String cpfVendedor = receverDados("Digite o cpf do Vendedor: ").nextLine();
        String cpfCliente = receverDados("Digite o cpf do Cliente: ").nextLine();
        String dataRegistro = receverDados("Digite a data de registro: ").nextLine();
        double valorAPagar = receverDados("Digite o valor a pagar: ").nextDouble();
        return ServiceVenda.cadastrarVenda(cpfCliente, cpfVendedor, valorAPagar, dataRegistro);
    }

    public static void menuPrincipal() {
        System.out.println("\n * * * Menu Principal * * *");
        System.out.println(" [1] Cadastrar Cliente");
        System.out.println(" [2] Cadastrar Vendedor");
        System.out.println(" [3] Cadastrar Venda");
        System.out.println(" [4] Listar Vendas");
        System.out.println(" [5] Listar vendedores");
        System.out.println(" [6] Listar Clientes");
        System.out.println(" [7] Sair");
    }

    public static void executar() throws Exception {
        boolean menuprincipalloop = true;
        while (menuprincipalloop) {
            menuPrincipal();
            int opcaomenu = receverDados("Digite uma opção: ").nextInt();
            if (opcaomenu == 1) {
                cadastrarCliente();
            } else if (opcaomenu == 2) {
                cadastrarVendedor();
            } else if (opcaomenu == 3) {
                cadastrarVenda();
            } else if (opcaomenu == 4) {
                System.out.println(ServiceVenda.vendas);
            } else if (opcaomenu == 5) {
                System.out.println(ServiceVendedor.vendedores);
            } else if (opcaomenu == 6) {
                System.out.println(ServiceCliente.clientes);
            } else if (opcaomenu == 7) {
                System.out.println("¡Adiós! Vuelva Siempre");
                menuprincipalloop = false;
            }else{
                System.out.println("Digite uma opção valida!");
            }
        }


    }

}
