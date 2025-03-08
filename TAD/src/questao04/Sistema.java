package questao04;

public class Sistema {

	public static void main(String[] args) {
		
		Racional rc = new Racional(3,4);
		Racional rc2 = new Racional(3,4);
		
		System.out.println("A) CRIAR RACIONAL: ");
		rc.criar();
		System.out.println("Número racional 2 criado: " + rc2);
		
		//recebe o segundo racional para somar e multiplicar
		rc.setOutro(rc2);
		
		System.out.println("\nB) SOMAR RACIONAIS: ");
        rc.somar(); 
        
        System.out.println("\nC) MULTIPLICAR RACIONAIS: ");
        rc.multiplicar();
        
        System.out.println("\nD) TESTAR RACIONAIS: ");
        rc.teste();
	}

}
