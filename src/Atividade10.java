import java.util.Random;

import javax.swing.JOptionPane;

public class Atividade10 {

	public static void main(String[] args) {
		Random rand = new Random();
		int valor = 0, tentativa = 0;
		int x = rand.nextInt(99);
		
		while(valor !=x+1){
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " ));
		

		if(valor < x + 1){
			JOptionPane.showMessageDialog(null,("O valor é maior, tente novamente " ));
			tentativa++;
		}
		
		else if(valor > x + 1){
			JOptionPane.showMessageDialog(null,("O valor é menor, tente novamente " ));
			tentativa++;
		}else 
			JOptionPane.showMessageDialog(null, "Parabéns, você acertou " + tentativa + " tentativas ");
	}
 }
}
