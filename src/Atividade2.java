import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		String nome;
		int numDependentes;
		float salarioBruto, salarioLiquido, ir=0;
		
		nome = JOptionPane.showInputDialog("Digite o nome");
		numDependentes = Integer.parseInt(JOptionPane.showInputDialog("N�mro de Dependentes"));
		salarioBruto = Integer.parseInt(JOptionPane.showInputDialog(null, "N�mero do Salario Bruto"));
		
		salarioLiquido = salarioBruto - (600*numDependentes);
		
			if(salarioLiquido <=10000)
				ir=0;
			else if((salarioLiquido > 10000) &&(salarioLiquido <=30000))
				ir= salarioLiquido * 0.05f;
			else if((salarioLiquido > 30000) &&(salarioLiquido <=60000))
				ir= salarioLiquido * 0.1f;
			else if(salarioLiquido > 60000)
				ir= salarioLiquido * 0.15f;
			JOptionPane.showMessageDialog(null, "Nome: " + nome +
												"\nDependentes: " + numDependentes +
												"\nSal�rio Bruto: " + salarioBruto +
												"\nImposto de renda: " + ir +
												"\nSal�rio Liquido: " + salarioLiquido				
					);

	}

}
