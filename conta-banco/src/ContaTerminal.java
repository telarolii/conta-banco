import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Olá, sou Sora a sua assistente virtual no DIObank!");

        // Conhecer e importar a classe Scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagens para o usuário:
        System.out.println("Para começar, digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da sua agência:");
        int numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Preciso que também informe o seu nome completo abaixo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Estamos quase lá para recuperar sua conta! Informe o último saldo de sua conta:");
        double saldoConta = scanner.nextDouble();

        // Exibir as mensagens de retorno
        System.out.println("Olá " + nomeCliente + " ,encontramos sua conta! Sua agência é " + numeroAgencia + " ,conta"
                + numeroConta + " e seu saldo de: " + saldoConta + " e já está disponível para saque!");

        System.out.println("Precisa de mais alguma coisa?");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Certo! Um de nossos atendentes irá entrar em contato para solucionar o seu problema");

        } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {

            System.out.println("Entendido! Caso mude de ideia, estamos à disposição.");

        } else {
            System.out.println("Sua resposta foi inválida");
        }
    }
}
