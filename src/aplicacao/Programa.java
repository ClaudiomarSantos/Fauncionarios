package aplicacao;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		Funcionario func;

		System.out.println("deseja cadastrar quantos funcionários? ");
		Integer n = sc.nextInt();

		System.out.println("entre com os dados dos funcionario: ");

		for (int i = 0; i < n; i++) {

			System.out.println("id: ");
			int id = sc.nextInt();
			System.out.println("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("salaraio: ");
			double salario = sc.nextDouble();
			func = new Funcionario(id, nome, salario);
			list.add(func);

			for (int y = 0; y < n; y++) {
				if (list.get(y).getId() == id) {
					System.out.println("id igual não é permitido"); break;
				} else {
				}
				
				
				
				
				
				
				
			}
		}

	}
}
