import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		float areaTotal, areaConstruida, naoConstruida, valor;
		
		areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área Total"));
		areaConstruida = Float.parseFloat(JOptionPane.showInputDialog("Digite a área construida"));
		
		naoConstruida = areaTotal - areaConstruida;
		
		valor = (areaConstruida * 5) + (naoConstruida * 3.8f);
		
		JOptionPane.showMessageDialog(null, "Area Total = " + areaTotal +
											"\nArea Construida = " + areaConstruida + 
											"\nNão construida = " + naoConstruida +
											"\nValor pago = " + valor
				);
		
		
		
		

	}

}
