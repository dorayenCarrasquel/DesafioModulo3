package br.com.zup;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valorAPagar;

    public Venda() {

    }

    public Venda(Cliente cliente, Vendedor vendedor, double valorAPagar) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorAPagar = valorAPagar;
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(cliente.toString());
        retorno.append(vendedor.toString());
        retorno.append("Valor a pagar: " + valorAPagar);
        return retorno.toString();
    }
}
