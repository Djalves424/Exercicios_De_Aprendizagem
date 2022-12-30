import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {
		int idade, n20 =0, maisVelha = -1000, soma=0;
		float media;
		
		for(int i=1; i<=5; i++){
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade " + i));
			soma += idade;
			
			if(maisVelha < idade)
				maisVelha = idade;
			
			if(idade>20)
				n20++;
		}
		
		media = soma/5;
				
		JOptionPane.showMessageDialog(null, "Idade mais velha = " + maisVelha +
											"\nMedia = " + media +
											"\n Idade superior a 20 = " + n20);
	}

}
