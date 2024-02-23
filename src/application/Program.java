package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaF;
import entities.PessoaJ;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("N de pessoas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Pessoa #" + i + " data: ");
			System.out.print("Fisica ou Juridico (F/J)? ");
			char FJ = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (FJ == 'F') {
				System.out.print("Gasto com saude: ");
				double saude = sc.nextDouble();
				list.add(new PessoaF(nome, renda, saude));
			}
			else{
				System.out.print("N de funcionarios: ");
				int nFuncionarios = sc.nextInt();
				list.add(new PessoaJ(nome, renda, nFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("Impostos Pagos: ");
		double impostosTotais = 0.0;
		for (Pessoa pessoa : list) {
			double impostos = pessoa.imposto();
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", impostos));
			impostosTotais += impostos;
		}
		
		System.out.println("Impostos Totais: $" + String.format("%.2f", impostosTotais));
	}

}
