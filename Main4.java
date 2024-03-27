public class Main4 {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leão:");
        leao.exibirInformacoes();

        System.out.println("\nInformações da Arara:");
        System.out.println("Classe: " + arara.getClasse());
        System.out.println("Locomocao: " + arara.getLocomocao());
        System.out.println("Quantidade de ovos: " + arara.getQtdeOvos());
    }
}