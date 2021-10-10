package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {

    public static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception{
        validarEmailEscrita(email);
        Cliente clientecadastrado = new Cliente(nome, email, cpf);

        clientes.add(clientecadastrado);
        return clientecadastrado;
    }

    public static Cliente pegarClienteCadas(String cpf) throws Exception{
        for (Cliente cpfreferencia : clientes) {
            if (cpf.equals(cpfreferencia.getCpf())){
                return cpfreferencia;
            }
        }throw new Exception("Cliente NÃO cadastrado. ");
    }

    public static void validarEmailEscrita(String email)throws Exception{
        if (!email.contains("@")) {
                throw new Exception("O e-mail digitado não é valido");
        }
    }

}
