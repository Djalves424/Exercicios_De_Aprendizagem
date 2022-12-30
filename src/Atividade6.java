import javax.swing.JOptionPane;

public class Atividade6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int num = 10, maior = -1000, i=1, k=1;
		
		for(int j=1; j<=5; j++){
			Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: " + j));
			if( num > maior)
				maior = num;
		}
		
		while(i<=5){
			Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: " + i));
			if( num > maior)
				maior = num;
			i++;
		}
		/*do{
			Integer.parseInt(JOptionPane.showInputDialog("Digite o valor" + k));
			if( num > maior)
				maior = num;
			
		}while(k<=5);*/
		
		JOptionPane.showMessageDialog(null, "Maior igual " + maior);
		
	}

}
