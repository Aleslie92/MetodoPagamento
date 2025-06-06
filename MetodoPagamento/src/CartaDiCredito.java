public class CartaDiCredito {

    private double importo;

    public CartaDiCredito(double importo) {
        super(importo);
    }

    @Override
     public void verificaImporto() {
        System.out.println(super.verificaImporto());
        System.out.println("Controllo disponibilità sulla carta...");
     }

    @Override
    public void paga() {
        System.out.println("Pagamento con carta di credito effettuato: ");
    }
}