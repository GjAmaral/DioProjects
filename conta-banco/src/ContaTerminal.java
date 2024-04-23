import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sq = new Scanner(System.in);


       System.out.println("informe o número da conta");
        int numeroDaConta = sq.nextInt();

       System.out.println("informe sua agencia");
       String agencia = sq.next();

       System.out.println("Informe seu nome completo");
       String nomeDoCliente = sq.next();

       System.out.println("Informe o salda da conta");
       float saldo = sq.nextInt();
       
       
        System.out.printf("Olá " + nomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
