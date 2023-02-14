import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Rm do aluno: ");
        a1.rm = input.nextInt();

        input.nextLine(); //limpa o buffer

        System.out.println("Nome do aluno: ");
        a1.name = input.nextLine();


        System.out.println("Digite sua primeira nota: ");
        a1.nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        a1.nota2 = input.nextDouble();

        System.out.println("Rm" + a1.rm);
        System.out.println("Aluno" + a1.name);
        System.out.println("Media final: " + a1.calcMedia());
        System.out.println("Status: " + a1.status());


        System.out.println("-----------------------");
        //aluno 2

        Aluno a2 = new Aluno();
        System.out.println("Rm do aluno: ");
        a2.rm = input.nextInt();

        input.nextLine(); //limpa o buffer

        System.out.println("Nome do aluno: ");
        a2.name = input.nextLine();


        System.out.println("Digite sua primeira nota: ");
        a2.nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        a2.nota2 = input.nextDouble();

        System.out.println("Rm: " + a2.rm);
        System.out.println("Aluno: " + a2.name);
        System.out.println("Media: " + a2.calcMedia());
        System.out.println("Status: " + a2.status());

        input.close();
    }
}
