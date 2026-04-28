package com.krakedv.artesanal.test;

import com.Krakedev.artesanal.Maquina;

public class TestAtributos {
	
	public static void main(String[] args) {
		
		Maquina  rubia=new Maquina("Pilsener","8545","cerveza rubia",0.02,1000);
		
		
		
		rubia.setNombreCerveza("Golden Ale");
		rubia.imprimir();
	
		
	}

}
