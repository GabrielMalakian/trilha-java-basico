import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Digite a sua agência: ");
        String agencia = sc.nextLine();
        
        sc.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.next();
        
        sc.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();
    

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + "R$ " + saldo + " já está disponível para saque.  ");



        sc.close();
    }
}
