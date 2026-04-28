package com.krakedv.artesanal.test;

import com.Krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquina rubia = new Maquina("Pilsener","2508", "cervezza fria", 0.02, 8000);

		System.out.println("-------- ESTADO INICIAL--------------");
        rubia.imprimir();
        
        System.out.println("--------LLENANDO MAQUINA--------------");
        rubia.llenarMaquina();
        rubia.imprimir();
        
        System.out.println("--------SERVIR 1000 ML--------------");
        
        double valor;
        valor=rubia.servirCerveza(1000);
        System.out.println("Valor a Pagar"+valor);
        
        System.out.println("--------SERVIR 2000 ML--------------");
       
        valor=rubia.servirCerveza(2000);
        System.out.println("Valor a Pagar"+valor);
        
      System.out.println("--------SERVIR 6000 ML--------------");
       
        valor=rubia.servirCerveza(6000);
        System.out.println("Valor a Pagar"+valor);
        
        System.out.println("--------SERVIR 2000 ML--------------");
       
        valor=rubia.servirCerveza(2000);
        System.out.println("Valor a Pagar"+valor);
        
        rubia.imprimir();
	}
	}


