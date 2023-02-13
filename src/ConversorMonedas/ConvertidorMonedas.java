package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertidorMonedas {
	
	public void ConvertirPesosColombianoADolar(double ValorRecibido) {
		
		double monedaDolar = ValorRecibido / 4081.53;
		monedaDolar = (double)Math.round(monedaDolar *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosColombianoAEuro(double ValorRecibido) {
		
		double monedaEuro = ValorRecibido / 5068.89;
		monedaEuro = (double)Math.round(monedaEuro *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaEuro + " Euro");
	}
	
	public void ConvertirPesosColombianoALibra(double ValorRecibido) {
		
		double monedaLibra = ValorRecibido / 5730.03;
		monedaLibra = (double)Math.round(monedaLibra *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaLibra + " Libras");
	}
	
}
