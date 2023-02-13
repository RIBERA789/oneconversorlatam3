package ConversorMonedas;

import javax.swing.*;



public class Function {

	ConvertidorMonedas  monedas = new ConvertidorMonedas();
	public void ConvertirMonedas(double ValorRecibido) {
		
		
		String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que desea converti tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"De Pesos a Dolar", "De Pesos a Euro", "De Peso a Libra"}, "Seleccion" )).toString();
		
		 switch (opciones) {
		
		case "De Pesos a Dolar": {
			monedas. ConvertirPesosColombianoADolar(ValorRecibido);
		}
			break;
		case  "De Pesos a Euro": {
			monedas.ConvertirPesosColombianoAEuro(ValorRecibido);
			
		 }
		break;
		case "De Peso a Libra": {
			monedas.ConvertirPesosColombianoALibra(ValorRecibido);
		}
		
		}
	 }
	}
	

