import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		
		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do triangulo"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do triangulo"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3 do triangulo"));
		
		if ((lado1<lado2+lado3)&&(lado2<lado1+lado3)&&(lado3<lado1+lado2)) {
			if ((lado1==lado2)&&(lado2==lado3))
				JOptionPane.showMessageDialog(null, "É um triângulo Equilátero");
			else if((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3))
				JOptionPane.showMessageDialog(null, "É um triângulo Escaleno");
			else
				JOptionPane.showMessageDialog(null, "É um triângulo Isósilis");
			
			
		}else
			JOptionPane.showMessageDialog(null, "Não é um triângulo");
	}

}
