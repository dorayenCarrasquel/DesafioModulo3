package br.com.zup;

import javax.naming.directory.InvalidSearchControlsException;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    public static List <Pessoa> pessoasNoSistema = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*public static void listaPessoasValidar(){
        pessoasNoSistema.addAll(ServiceCliente.clientes);
        pessoasNoSistema.addAll(ServiceVendedor.vendedores);
    }
    public static void validaEmailRepetido(String email)throws Exception{
        for (Pessoa emailReferencia: pessoasNoSistema){
            if (email.equalsIgnoreCase(emailReferencia.getEmail()) ){
                throw new Exception("Email Ja cadastrado.");
            }
        }
    } public static void validarCPFRepetido(String cpf)throws Exception {
        for (Pessoa cpfReferencia : pessoasNoSistema) {
            if (cpf.equalsIgnoreCase(cpfReferencia.getEmail())) {
                throw new Exception("CPF Ja cadastrado.");
            }
        }
    }*/

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: \t\t" + nome);
        retorno.append("\nCPF: \t\t" + cpf);
        retorno.append("\nE-mail: \t" + email);
        return retorno.toString();
    }
}
