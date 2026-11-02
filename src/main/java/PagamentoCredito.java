
public class PagamentoCredito implements Pagamento {

    public String pagar(float valor) {
        return "Pagamento realizado com cartão de crédito no valor de: " + valor;
    }
}
