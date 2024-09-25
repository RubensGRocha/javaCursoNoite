package turmaNoite;

public class ManipulandoStrings {

	public static void main(String[] args) {
		// Criando Strings

		String texto = ("Bem vindo ao curso intermediário de java");
		String texto2 = ("Vamos aprender sobre Strings!");

		// comprimento da String:

		System.out.println("Comprimento da string: " + texto.length());

		// concatenar String
		// String textocompleto = texto +"\n"+ texto2;
		String textocompleto = texto + texto2;
		System.out.println(textocompleto);

		// converter Maiuscula e Minusculas:
		System.out.println("Maiusculas: " + texto.toUpperCase());

		System.out.println("Minuscula: " + texto2.toLowerCase());

		// substutiur uma parte da String:

		String novoTexto = texto.replace("java", "PHP");
		System.out.println(novoTexto);

		// buscar por uma subtring

		int posicao = texto.indexOf("curso");

		System.out.println(posicao);

		// verificar se uma string começa ou termina com uma substring
		System.out.println("Começa com 'Bem' : " + texto.startsWith("Bem"));

		// dividir uma string:
		String nomeCompleto = "Rubens Gonçalo da Rocha";
		String[] parteDoNomeCompleto = nomeCompleto.split(" ");

		System.out.println("Palavras no texto completo");
		for (String parteDoNome : parteDoNomeCompleto) {
			System.out.println(parteDoNome);
		}
		// Remover espaços
		String textoComEspacos = "    Texto     com   espaços     ";
		System.out.println("Texto sem espaços: '" + textoComEspacos.trim().replaceAll("\\s+", " ") + "'");

		/*
		 * O comando: " \\s+ " => captura todos os espaços da string O comando " " =>
		 * substitui todos os espaços por apenas 1.
		 */

	}

}
