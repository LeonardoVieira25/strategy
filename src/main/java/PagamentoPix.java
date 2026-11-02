
public class PagamentoPix implements Pagamento {

    public String pagar(float valor) {
        return "Pagamento realizado com Pix no valor de: " + valor;
    }
}
