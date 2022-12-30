import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		int soma = 0, soma2 = 0, soma3 = 0, i=100, k=100;
		
		for(int j=100; j<=200; j++){
			if(j%5==0)
				soma += j;
		}
		
		while (i<=200) {
			if(i%5==0)
				soma2 += i;
				
				i++;
	}

	do{
		
			if(k%5==0)
			soma3 += k;
		
		k++;
	}while(k<=200);
	

   
	JOptionPane.showMessageDialog(null, "Soma igual usando o for " + soma +
										"\nSoma igual usando while " + soma2 +
										"\nSoma igual usando o do while " + soma3);
	}	
}