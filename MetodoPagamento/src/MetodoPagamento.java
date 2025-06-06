abstract class MetodoPagamento {

    private double importo;

    public MetodoPagamento(double importo) {
        this.importo = importo;

    }

    public abstract void paga(double sommaDaSpendere);

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public void verificaImporto() {
        System.out.println("Nel Portfolio hai: " + getImporto() + " euro");
    }
}
