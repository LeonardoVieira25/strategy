
public class PagamentoDinheiro implements Pagamento {

    public String pagar(float valor) {
        return "Pagamento realizado em dinheiro no valor de: " + valor;
    }
}
