import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figura figura = null;

        System.out.println("=== Calculadora de Áreas ===");
        System.out.println("Escolha uma figura geométrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Triângulo");
        System.out.print("Digite a opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = entrada.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Digite a base do retângulo: ");
                double baseR = entrada.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaR = entrada.nextDouble();
                figura = new Retangulo(baseR, alturaR);
                break;
            case 3:
                System.out.print("Digite o raio do círculo: ");
                double raio = entrada.nextDouble();
                figura = new Circulo(raio);
                break;
            case 4:
                System.out.print("Digite a base do triângulo: ");
                double baseT = entrada.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaT = entrada.nextDouble();
                figura = new Triangulo(baseT, alturaT);
                break;
            default:
                System.out.println("Opção inválida.");
                entrada.close();
                return;
        }

        System.out.printf("\nFigura: %s\n", figura.getNome());
        System.out.printf("Área calculada: %.2f\n", figura.calcularArea());
        entrada.close();
    }
}