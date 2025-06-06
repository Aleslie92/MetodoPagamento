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
    public void paga(double importo) {
        if(getImporto() >= importo) {
            setImporto(getImporto()-importo);
            System.out.println("Pagamento con carta di credito effettuato: ");
        } else {
            System.out.println("Soldi insufficenti!");
        }
    }
}
