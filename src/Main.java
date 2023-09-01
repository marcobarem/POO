import java.lang.Math;

// Classe para representar um Círculo
class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

// Classe para representar um Quadrado
class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Classe para representar um Retângulo
class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}

// Classe para representar um Triângulo
class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        // Não é possível calcular o perímetro de um triângulo apenas com base e altura
        return Double.NaN; // NaN representa "não é um número" (indeterminado)
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(6, 8);
        Triangulo triangulo = new Triangulo(3, 4);

        System.out.println("Área e Perímetro do Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Quadrado:");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Retângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Triângulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: Indeterminado (não é possível calcular apenas com base e altura)");
    }
}
