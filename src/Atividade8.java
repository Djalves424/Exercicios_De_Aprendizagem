import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		int cont =1, num, quant=0, a=1;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Deseja iniciar o progrma (0) para sair"));
		
		while(a!=0){
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		
		while(cont<=num){
			if(num%cont==0)
				quant++;
			cont++;
		}
		
		if(quant <=2)
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " � primo");
		else
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " n�o � primo");
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Deseja iniciar o progrma (0) para sair"));

	}
		JOptionPane.showMessageDialog(null, "Programa finalizado");
		
	}
}
