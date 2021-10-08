package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String email, String cpf) {
        Vendedor vendedorCadastrado = new Vendedor(nome, email, cpf);
        vendedores.add(vendedorCadastrado);
        return vendedorCadastrado;
    }



}
