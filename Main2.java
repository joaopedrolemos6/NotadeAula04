public class Main2 {
    public static void main(String[] args) {
        Professor pr = new Professor("joao", 30, 5000.0);
        Aluno a = new Aluno("carla", 20, 12345);

        System.out.println("Professor: ");
        System.out.println("Nome: " + pr.getNome());
        System.out.println("Idade: " + pr.getIdade());
        System.out.println("Salario: " + pr.getSalario());
        System.out.println("--------------------");
        System.out.println("Aluno: ");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Matricula: " + a.getMatricula());
    }
}