package br.com.zup;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valorAPagar;
    private String dataDeRegistro;

    public Venda() {

    }

    public Venda(Cliente cliente, Vendedor vendedor, double valorAPagar, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorAPagar = valorAPagar;
        this.dataDeRegistro = dataDeRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n----------=>");
        retorno.append("\nData de Registro: " + dataDeRegistro);
        retorno.append(cliente.toString());
        retorno.append(vendedor.toString());
        retorno.append("\nValor a pagar: " + valorAPagar);
        retorno.append("\n----------=>");
        return retorno.toString();
    }
}
