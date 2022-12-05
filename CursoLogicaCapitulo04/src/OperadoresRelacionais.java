
public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		Boolean tresMaiorQuerDois = 3 > 2;
		System.err.println("3 > 2? " + tresMaiorQuerDois);
		
		Boolean tresMenorQuerDois = 3 < 2;
		System.err.println("3 < 2? " + tresMenorQuerDois);
		
		Boolean tresMaiorQuerTres = 3 > 3;
		System.err.println("3 > 3? " + tresMaiorQuerTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.err.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.err.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro =  quatro > quatro;
		System.out.println("Quatro > Quatro? " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro =  quatro >= quatro;
		System.out.println("Quatro >= Quatro? " + quatroMaiorOuIgualAQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equais(cinco)" + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equais(seis)" + cincoIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);
		
		Boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito == centoVinteOito0? " + centoVinteOitoIgualCentoVinteOito02);
		
	}
}
