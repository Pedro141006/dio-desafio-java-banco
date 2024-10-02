import java.util.Scanner;
// Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque
public class ContaTerminal{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    Scanner scanner = new Scanner(System.in);

   System.out.println("Qual o numero de sua agencia?");
    numero = scanner.nextInt();

    System.out.println("Sua agencia?");
    agencia = scanner.nextLine();

    System.out.println("Qual seu nome?");
    nomeCliente = scanner.nextLine();

    System.out.println("Qual seu saldo?");
    saldo = scanner.nextDouble();
  
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numero + " e seu saldo " + saldo + " já está disponível para saque");

  }
}
