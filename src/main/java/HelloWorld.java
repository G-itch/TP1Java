import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
        // Exercício 4: Hello World básico
        System.out.println("Hello, World!");

        // Exercício 7: Mensagem personalizada com data específica
        System.out.println("Olá, meu nome é Enzo Furtini");
        System.out.println("Data atual: " + LocalDate.now());

        // Exercício 8: Variáveis e tipos de dados
        int idade = 25;
        double altura = 1.75;
        String nome = "João";
        boolean estudante = true;

        System.out.println("\nDados pessoais:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante? " + estudante);

        // Exercício 9: Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nPor favor, digite seu nome:");
        String nomeUsuario = scanner.nextLine();
        
        System.out.println("Por favor, digite sua idade:");
        int idadeUsuario = scanner.nextInt();
        
        System.out.println("Nome: " + nomeUsuario + ", Idade: " + idadeUsuario);
        
        scanner.close();
    }
} 