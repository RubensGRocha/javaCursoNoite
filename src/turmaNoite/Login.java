package turmaNoite;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		// variaveis fixas de nome de usuario e senha:

		String usuarioCorreto = "admin";
		String senhaCorreta = "123";

		// numero maximo de tentativas:
		int tentativaMximas = 3;
		int tentativas = 0; // contador de tentativas

		// entrada do usuario:
		Scanner scanner = new Scanner(System.in);

		// tentativa de login 01:
		System.out.println("Digite o nome do usuario");
		String usuario = scanner.nextLine();

		System.out.println("Digite a senha;");
		String senha = scanner.nextLine();

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Login realizado com sucesso");
		} else {
			tentativas++;
			System.out.println("Usuario ou senha incorretos, tente novamente!");

			// tentativa de login 02:
			System.out.println("Digite o nome de usuario:");
			usuario = scanner.nextLine();

			System.out.println("Digite a senha;");
			senha = scanner.nextLine();

			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				System.out.println("Login realizado com sucesso");
			} else {
				tentativas++;
				System.out.println("Usuario ou senha incorretos, tente novamente!");

				// tentativa de login final
				System.out.println("Tentativa final, seu login sera bloqueado!");
				usuario = scanner.nextLine();

				System.out.println("Digite a senha;");
				senha = scanner.nextLine();
				if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
					System.out.println("Login realizado com sucesso");
				} else {
					tentativas++;
					System.out.println("Usuario ou senha incorretos, acesso bloqueado!");

				}

			}

		}
		// fechar o scanner
		scanner.close();

	}
}