import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        //Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o usuario

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo bancário: ");
        double saldo = scanner.nextDouble();


        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
