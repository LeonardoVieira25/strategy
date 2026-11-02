public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.comprarNoPix(100.0f);
        System.out.println(cliente.getStatusCompras());
    }
}
