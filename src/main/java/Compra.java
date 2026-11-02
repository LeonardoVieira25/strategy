
public class Compra {

    private float valor;

    public Compra(float valor) {
        this.valor = valor;
    }

    public String pagar(Pagamento operacao) {
        return operacao.pagar(valor);
    }
}
