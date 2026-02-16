package controller;

public class metodos {
	
	public metodos() {
		super();
	}
	
	public int contarNegativos(int v[], int n) {
		 // CONDIÇÃO DE PARADA:
       // Quando n for 0, não há mais elementos.
       if (n == 0) {
           return 0;
       }

       // RELAÇÃO RECURSIVA:
       // Se o elemento atual for negativo:
       // T(n) = 1 + T(n - 1)
       // Caso contrário:
       // T(n) = T(n - 1)

       if (v[n - 1] < 0) {

           // MOSTRA o número negativo
           System.out.println("Negativo encontrado: " + v[n - 1]);

           return 1 + contarNegativos(v, n - 1);

       } else {

           return contarNegativos(v, n - 1);
       }
   }
	}
