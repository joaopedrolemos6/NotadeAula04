public class Arara extends Animal {
    private int qtdeOvos;

    public Arara() {
        super("Ave", "Voa");
        this.qtdeOvos = 2; // Exemplo de quantidade de ovos padrão
    }

    public int getQtdeOvos() {
        return qtdeOvos;
    }
}