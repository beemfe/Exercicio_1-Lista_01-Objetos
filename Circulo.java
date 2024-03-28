public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getArea() {
        return Math.PI * raio * raio;
    }
}
