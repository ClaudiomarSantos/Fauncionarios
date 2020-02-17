package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

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

		}

		System.out.println("digite o id do funcionario para aumentar o salario: ");
		int id2 = sc.nextInt();

		Funcionario result = list.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);

		if (result == null) {
			System.out.println("id Invalido: ");

		} else {
			System.out.println("digite o percentual de aumento: ");
			double percentual = sc.nextInt();
			result.AumSal(percentual);
			System.out.println("dados dos clientes: ");

			for (Funcionario x : list) {
				System.out.println(x);

			}

		}

		sc.close();
	}
}
