package view;

import controller.metodos;

public class principal {

	public static void main(String[] args) {
		metodos m = new metodos();

        int vetor[] = {-1, 3, -5, 7, -2}; // alterar os valores para teste

        int total = m.contarNegativos(vetor, vetor.length);

        System.out.println("Total de negativos = " + total);
    
	}

}
