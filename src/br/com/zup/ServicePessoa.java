package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicePessoa {
    public static List<Pessoa>pessoasValidar = new ArrayList<>();

    public static void listavalidada(){
        pessoasValidar.addAll(ServiceVendedor.vendedores);
        pessoasValidar.addAll(ServiceCliente.clientes);
    }
    public static void validarEmailEscrita(String email)throws Exception{
        if (!email.contains("@")) {
            throw new Exception("O e-mail digitado não é valido");
        }
    }
    public static void validaEmailRepetido(String email)throws Exception{
        for (Pessoa emailReferencia: pessoasValidar){
            if (email.equalsIgnoreCase(emailReferencia.getEmail()) ){
                throw new Exception("Email Ja cadastrado.");
            }
        }
    }
    public static void validarCPFRepetido(String cpf)throws Exception{
        for (Pessoa cpfReferencia: pessoasValidar){
            if (cpf.equalsIgnoreCase(cpfReferencia.getCpf()) ){
                throw new Exception("CPF Ja cadastrado.");
            }
        }
    }

    public static void vamAPasarAProba(String email, String cpf)throws Exception{
        validarEmailEscrita(email);
        validaEmailRepetido(email);
        validarCPFRepetido(cpf);
    }

}
