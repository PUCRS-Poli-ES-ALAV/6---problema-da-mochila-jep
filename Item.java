public class Item {
    public int peso;
    public int valor;
    public int coefValor;

    public Item(int peso, int valor) {
        this.peso = peso;
        this.valor = valor;
        this.coefValor = valor/peso;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
