abstract class MetodoPagamento {

    private double importo;

    public MetodoPagamento(double importo) {
        this.importo = importo;

    }

    public abstract void paga();

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public void verificaImporto() {
        System.out.println("Importo da pagare: " + importo + " euro");
    }
}
