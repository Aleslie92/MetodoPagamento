
public class PayPal extends MetodoPagamento {

    public PayPal(double importo) {
        super(importo);
        print();
    }

    public void print() {
        System.out.println("PayPal reggistrata con successo, importo attuale : " + getImporto() + " euro");
    };

    @Override
    public void paga() {
        System.out.println("Pagamento effettuato con PayPal, importo : " + getImporto() + " euro");
    }

    @Override
    public void verificaImporto() {
        System.out.println("Verifica importo PayPal : " + getImporto() + " euro");
    }

}
