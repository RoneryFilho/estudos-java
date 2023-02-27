package perguntas;
/*
 Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

	SP – R$67.836,43
	RJ – R$36.678,66
	MG – R$29.229,88
	ES – R$27.165,48
	Outros – R$19.849,53 
*/
public class Faturamento {
	double SP = 67836.43;
	double RJ = 36678.66;
	double MG = 29229.88;
	double ES = 27165.48;
	double outros = 19849.53;

	double valorTotal = SP + RJ + MG + ES + outros;
	
	double porCentSP = (100 * SP) / valorTotal;
	
	double porCentRJ = (100 * RJ) / valorTotal;
	
	double porCentMG = (100 * MG) / valorTotal;
	
	double porCentES = (100 * ES) / valorTotal;
	
	double porCentOutros = (100 * outros) / valorTotal;
	
	/*System.out.printf("SP: %.2f porcento\n",porCentSP);
	System.out.printf("RJ: %.2f porcento\n",porCentRJ);
	System.out.printf("MG: %.2f porcento\n",porCentMG);
	System.out.printf("ES: %.2f porcento\n",porCentES);
	System.out.printf("Outros: %.2f porcento\n",porCentOutros);
	System.out.printf("Total: %.2f: ", porCentSP + porCentRJ + porCentMG + porCentES + porCentOutros);
	
*/}
