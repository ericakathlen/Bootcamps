import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        // Solicita o numero da agencia
        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();
        // Solicita o numero da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        //Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        // Solicita e recebe o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        // Fecha o scanner
        scanner.close();

        // Exibir as msgs para o usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
