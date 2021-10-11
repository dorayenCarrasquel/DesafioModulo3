package br.com.zup;

public class Cliente extends Pessoa{
    public Cliente(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\nDados do Cliente:");
        retorno.append("\n------------------->");
        retorno.append(super.toString());
        retorno.append("\n------------------->");
        return retorno.toString();
    }
}
