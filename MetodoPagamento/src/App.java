public class App {

    // Crea un pagamento con CartaDiCredito da 100 euro
    // Crea un pagamento con PayPal da 50 euro
    // Per entrambi, chiama verificaImporto() e paga()

    public static void main(String[] args) throws Exception {

        MetodoPagamento cartaDiCredito = new CartaDiCredito(100);
        MetodoPagamento payPal = new PayPal(100);

        // Verifica importo e paga con Carta di Credito
        //

        cartaDiCredito.verificaImporto();
        cartaDiCredito.paga(30); // Paga 30 euro

        cartaDiCredito.verificaImporto(); // Verifica il nuovo importo dopo il pagamento

        payPal.verificaImporto();
        payPal.paga(50); // Paga 50 euro
        payPal.verificaImporto(); // Verifica il nuovo importo dopo il pagamento

    }
}
