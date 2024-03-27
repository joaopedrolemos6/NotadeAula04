public class Carro {
    public String marca;
    public String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}