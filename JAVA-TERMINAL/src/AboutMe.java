
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {

        //Entrada de informações pelo terminal 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome:");
        String sobreNome = scanner.next();

        System.out.println("Digite a sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua Altura:");
        double altura = scanner.nextDouble();

        System.out.println("Ola meu nome seria " + nome + " " + sobreNome );
        System.out.println("tenho " + idade + " anos");
        System.out.println("tenho " + altura + " de altura");

    }
}
