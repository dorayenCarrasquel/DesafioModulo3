package br.com.zup;

public class Main {

    public static void main(String[] args) {
        System.out.println(ServiceCliente.clientes);
        Cliente clienteCadastro = Sistema.cadastrarCliente();
        Cliente clienteCadastrO = Sistema.cadastrarCliente();
        System.out.println(ServiceCliente.clientes);

        Vendedor vendedorCada = Sistema.cadastrarVendedor();
        Vendedor vendedorCada1 = Sistema.cadastrarVendedor();
        System.out.println(ServiceVendedor.vendedores);

    }
}