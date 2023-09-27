package ArrayList;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Exercício 3: Contagem de Palavras Crie um programa que declare um array de
		 * strings contendo várias palavras. Em seguida, conte e exiba quantas palavras
		 * no array têm mais de cinco letras.
		 */
		String[] palavras = new String[20];

		int contagem = 0;

		String frase;

		do {

			try {

				frase = JOptionPane.showInputDialog(null, "Digite uma frase");

				frase = frase.toUpperCase();

				palavras = frase.split(" ");

			} catch (NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente");

				break;
			}

			for (int i = 0; i < palavras.length; i++) {

				if (palavras[i].length() > 5) {

					contagem++;
				}

			}

			if (contagem > 0) {
				JOptionPane.showMessageDialog(null,
						"Nas frases fornecidas = " + contagem + " palavra(s) tem mais de cinco letras");

			}

			else {

				JOptionPane.showMessageDialog(null, "Nenhuma palavra tem mais de 5 letras");

				break;
			}

		} while (frase != null);

	}

}
