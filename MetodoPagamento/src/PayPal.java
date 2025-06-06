
public class PayPal extends MetodoPagamento {

    public PayPal(double importo) {
        super(importo);

    }

    @Override
    public void paga(double sommaDaSpendere) {
        if (getImporto() >= sommaDaSpendere) {
            System.out.println("Pagamento effettuato con PayPal, importo: " + sommaDaSpendere + " euro");
            setImporto(getImporto() - sommaDaSpendere);
        } else {
            System.out.println("Saldo insufficiente su PayPal per pagare " + sommaDaSpendere + " euro");
        }
    }

    @Override
    public void verificaImporto() {
        System.out.println("Verifica importo PayPal : " + getImporto() + " euro");
    }

}