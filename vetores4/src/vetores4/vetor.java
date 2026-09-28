package vetores4;
import javax.swing.JOptionPane;

public class vetor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String impressão = "";
		int numeros[] = new int[99];
		
		for (int c=0; c<=99; c++) {
			
			numeros[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número: "));
			
			impressão = impressão + " " + numeros[c]; 
			
	
		 if(numeros[c]==99) {
			 JOptionPane.showMessageDialog(null, "você achou o número");	
			 System.exit(0);
		 }
		
			
		}	
			
			
			
			
			
	
		}}
		
	

