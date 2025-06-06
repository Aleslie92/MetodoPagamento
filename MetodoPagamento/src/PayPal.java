
public class PayPal extends MetodoPagamento {

    public PayPal(double importo) {
        super(importo);
        print();
    }

    public void print() {
        System.out.println("PayPal reggistrata con successo, importo : " + this.importo);
    };

    @Override
    public void paga() {
        System.out.println("Pagamento effettuato con PayPal, importo : " + this.importo);
    }

    @Override
    public void verificaImporto() {
        System.out.println("Verifica importo PayPal : " + this.importo);
    }

}
