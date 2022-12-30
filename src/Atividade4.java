import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		int soma =0, valor;
		String res ="";
		for(int i=1; i<=5;i++){
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i));
			soma += valor;
			res += valor + " + ";
			
			
		}
		JOptionPane.showMessageDialog(null, "A soma de " + res +soma);
	}

}
