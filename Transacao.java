public class Transacao {
    public double valor;
    public String cnpj;
    public String dadosCliente;
    public String formaPgto;

    public Transacao(double valor, String cnpj, String dadosCliente, String formaPgto) {
        this.valor = valor;
        this.cnpj = cnpj;
        this.dadosCliente = dadosCliente;
        this.formaPgto = formaPgto;
    }
}
