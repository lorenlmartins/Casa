public class Casa implements CasaInterface{

    private int quartos;
    private int portas;

    public Casa(int quartos, int portas) {
        this.quartos = quartos;
        this.portas = portas;
    }

    public Casa(){}

    public int getPortas() {
        return this.portas;
    }

    public int getQuartos() {
        return this.quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "quartos=" + quartos +
                ", portas=" + portas +
                '}';
    }

    @Override
    public String nomeDono() {
        return "Loren";
    }
}
