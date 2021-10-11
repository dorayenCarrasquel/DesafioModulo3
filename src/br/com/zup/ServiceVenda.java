package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {

    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String cpfVendedor, double valorAPagar, String dataRegistro)throws Exception{
       Cliente clientevalido = ServiceCliente.pegarClienteCadas(cpfCliente);
        Vendedor vendedorvalido = ServiceVendedor.pegarVendedorCadas(cpfVendedor);
        Venda vendaCadastrada = new Venda(clientevalido, vendedorvalido,valorAPagar,dataRegistro);
        vendas.add(vendaCadastrada);
        return vendaCadastrada;
    }
    public static void pesquizarComprasCliente(String cpf)throws Exception{
        for (Venda cpfReferencia : vendas){
            if (cpfReferencia.getCliente().getCpf().equals(cpf)){
                System.out.println(cpfReferencia);
            }
        }throw new Exception("E-mail Cliente não cadastrado");
    }

}
