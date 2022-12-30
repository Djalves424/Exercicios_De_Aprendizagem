import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		int n100=0, n50=0, n20=0, n10=0, n5 =0, n2=0, n1=0, resto, valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor"));
		
		resto = valor;
		
		if (resto >=n100){
			n100 = resto/100;
			resto = resto %100;		
		}
		if (resto >=n50){
			n50 = resto/50;
			resto = resto %50;		
		}
		if (resto >=n20){
			n20 = resto/20;
			resto = resto %20;		
		}
		if (resto >=n10){
			n10 = resto/10;
			resto = resto %10;		
		}
		if (resto >=n5){
			n5 = resto/5;
			resto = resto %5;
		}
		if (resto >=n2){
			n2 = resto/2;
			resto = resto %2;		
		}
		if (resto >=n1){
			n1 = resto/1;
			resto = resto %1;		
		}
		
		JOptionPane.showMessageDialog(null, "Valor digitado: " + valor +
											"\nNotas de 100: " + n100 +
											"\nNotas de 50: " + n50 +
											"\nNotas de 20: " + n20 +
											"\nNotas de 10: " + n10 +
											"\nNotas de 5: " + n5 +
											"\nNotas de 2: " + n2 +
											"\nNotas de 1: " + n1 
				);
		
		
		
		
	}

}
