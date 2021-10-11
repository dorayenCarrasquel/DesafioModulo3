package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {

    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String cpfVendedor, double valorAPagar, String dataRegistro) throws Exception {
        Cliente clientevalido = ServiceCliente.pegarClienteCadas(cpfCliente);
        Vendedor vendedorvalido = ServiceVendedor.pegarVendedorCadas(cpfVendedor);
        Venda vendaCadastrada = new Venda(clientevalido, vendedorvalido, valorAPagar, dataRegistro);
        vendas.add(vendaCadastrada);
        return vendaCadastrada;
    }

    public static void pesquisarComprasCliente(String cpf) throws Exception {
        List<Venda> comprasCliente = new ArrayList<>();
        for (Venda cpfReferencia : vendas) {
            if (cpfReferencia.getCliente().getCpf().equals(cpf)) {
                comprasCliente.add(cpfReferencia);
            }
            if (comprasCliente.isEmpty()) {
                throw new Exception("CPF Cliente não cadastrado");
            }
        }
        System.out.println(comprasCliente);
    }

    public static void pesquisarVendasVendedor(String email) throws Exception {
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda emailReferencia : vendas) {
            if (emailReferencia.getCliente().getEmail().equals(email)) {
                vendasVendedor.add(emailReferencia);
            }
            if (vendasVendedor.isEmpty()) {
                throw new Exception("E-mail Vendedor não cadastrado");
            }
        }
        System.out.println(vendasVendedor);
    }

}
