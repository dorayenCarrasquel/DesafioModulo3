package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {

    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedor, double valorAPagar, String dataRegistro){
        Venda vendaCadastrada = new Venda(cliente, vendedor,valorAPagar,dataRegistro);
        vendas.add(vendaCadastrada);
        return vendaCadastrada;
    }

}
