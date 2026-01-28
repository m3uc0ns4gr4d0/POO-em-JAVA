public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area + " Metros");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = altura + largura;
        System.out.println("O perímetro da sala retangular é: " + perimetro + " Metros");
    }
}
