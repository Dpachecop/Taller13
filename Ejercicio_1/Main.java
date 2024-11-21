package Taller13.Ejercicio1;
import Ejercicio1.Rectangulo;


public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

        Figura triangulo = new Triangulo(5.0, 8.0);
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}

