public class CartaDiCredito extends MetodoPagamento {

    private double importo;

    public CartaDiCredito(double importo) {
        super(importo);
    }

    @Override
    public void verificaImporto() {
        super.verificaImporto();
        System.out.println("Controllo disponibilità sulla carta...");
    }

    @Override
    public void paga(double sommaDaSpendere) {
        if (getImporto() >= sommaDaSpendere) {
            System.out.println("Pagamento effettuato con Carta di Credito, importo: " + sommaDaSpendere + " euro");
            setImporto(getImporto() - sommaDaSpendere);
        } else {
            System.out.println("Saldo insufficiente sulla Carta di Credito per pagare " + sommaDaSpendere + " euro");
        }
    }
}