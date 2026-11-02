import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    void testNovoCliente() {
        Cliente cliente = new Cliente();
        String status = cliente.getStatusCompras();
        assert status.equals("Nenhuma compra realizada.");
    }

    @Test
    void testComprarNoBoleto() {
        Cliente cliente = new Cliente();
        cliente.comprarNoBoleto(50.0f);
        String status = cliente.getStatusCompras();
        assert status.equals("Pagamento realizado com boleto no valor de: 50.0");
    }

    @Test
    void testComprarNoCredito() {
        Cliente cliente = new Cliente();
        cliente.comprarNoCredito(75.0f);
        String status = cliente.getStatusCompras();
        assert status.equals("Pagamento realizado com cartão de crédito no valor de: 75.0");
    }

    @Test
    void testComprarNoDinheiro() {
        Cliente cliente = new Cliente();
        cliente.comprarNoDinheiro(30.0f);
        String status = cliente.getStatusCompras();
        assert status.equals("Pagamento realizado em dinheiro no valor de: 30.0");
    }

    @Test
    void testComprarNoPix() {
        Cliente cliente = new Cliente();
        cliente.comprarNoPix(100.0f);
        String status = cliente.getStatusCompras();
        assert status.equals("Pagamento realizado com Pix no valor de: 100.0");
    }

    @Test
    void testGetStatusCompras() {
        Cliente cliente = new Cliente();
        String status = cliente.getStatusCompras();
        assert status.equals("Nenhuma compra realizada.");
    }
}
