import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja bem vindo, por favor, preencha os dados solicitados abaixo:");
        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
                
        System.out.print("Número da Agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Nome e sobrenome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Valor que você quer depositar: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("\nOlá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta "+ numeroConta +" e seu saldo é de R$ " + saldo + " e já está disponível para saque");
        
        scanner.close();

    }
}
