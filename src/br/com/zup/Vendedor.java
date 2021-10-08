package br.com.zup;

public class Vendedor extends Pessoa{
    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\nDados do Vendedor:");
        retorno.append("\n----*");
        retorno.append(super.toString());
        retorno.append("\n----*");
        return retorno.toString();
    }
}
