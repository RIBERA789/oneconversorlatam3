package ConversorMonedas;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Function monedas = new Function();
		
		 String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de Temperatura"}, "Seleccion" )).toString();
	
		 switch (opciones) {
		case "Conversor de monedas": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double valorRecibido = Double.parseDouble(input);
			monedas.ConvertirMonedas(valorRecibido);
			
			double Seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
	        if (JOptionPane.OK_OPTION == Seleccion) {
	        
	        	System.out.println("Selecciona opcion afirmativa");
	        }else {
	        
	        	JOptionPane.showMessageDialog(null, "Programa terminado");
	        }
		 }
		}
	
	}
	
}
