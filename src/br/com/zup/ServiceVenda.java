package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {

    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpf, Vendedor vendedor, double valorAPagar, String dataRegistro)throws Exception{
       Cliente clientevalido = ServiceCliente.pegarClienteCadas(cpf);
        Venda vendaCadastrada = new Venda(clientevalido, vendedor,valorAPagar,dataRegistro);
        vendas.add(vendaCadastrada);
        return vendaCadastrada;
    }

}
