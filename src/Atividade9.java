import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		float areaTotal, areaConstruida, naoConstruida, valor;
		
		areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a �rea Total"));
		areaConstruida = Float.parseFloat(JOptionPane.showInputDialog("Digite a �rea construida"));
		
		naoConstruida = areaTotal - areaConstruida;
		
		valor = (areaConstruida * 5) + (naoConstruida * 3.8f);
		
		JOptionPane.showMessageDialog(null, "Area Total = " + areaTotal +
											"\nArea Construida = " + areaConstruida + 
											"\nN�o construida = " + naoConstruida +
											"\nValor pago = " + valor
				);
		
		
		
		

	}

}
