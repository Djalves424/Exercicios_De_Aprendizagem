import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		
		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do triangulo"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do triangulo"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3 do triangulo"));
		
		if ((lado1<lado2+lado3)&&(lado2<lado1+lado3)&&(lado3<lado1+lado2)) {
			if ((lado1==lado2)&&(lado2==lado3))
				JOptionPane.showMessageDialog(null, "� um tri�ngulo Equil�tero");
			else if((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3))
				JOptionPane.showMessageDialog(null, "� um tri�ngulo Escaleno");
			else
				JOptionPane.showMessageDialog(null, "� um tri�ngulo Is�silis");
			
			
		}else
			JOptionPane.showMessageDialog(null, "N�o � um tri�ngulo");
	}

}
