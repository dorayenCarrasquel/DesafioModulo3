package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String email, String cpf) throws Exception{
        ServicePessoa.vamAPasarAProba(email, cpf);
        Vendedor vendedorCadastrado = new Vendedor(nome, email, cpf);
        vendedores.add(vendedorCadastrado);
        ServicePessoa.listavalidada();
        return vendedorCadastrado;
    }

    public static Vendedor pegarVendedorCadas(String cpf) throws Exception{
        for (Vendedor cpfReferencia : vendedores){
            if (cpf.equals(cpfReferencia.getCpf())){
                return cpfReferencia;
            }
        }throw new Exception ("Vendedor NÃO cadastrado");
    }
}
