/*
 Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
*/
import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
}
}