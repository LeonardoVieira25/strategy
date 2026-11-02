
public class PagamentoBoleto implements Pagamento {

    public String pagar(float valor) {
        return "Pagamento realizado com boleto no valor de: " + valor;
    }
}
