package com.krakedv.artesanal.testNegocio;


import com.Krakedev.artesanal.Maquina;
import com.Krakedev.artesanal.Negocio;

public class TestNegocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Maquina  nueva=new Maquina("Cerveza club","1234", "Cerveza fria",0.02,80000);
		
		Negocio negocio1 =new Negocio("Mi negocio",nueva);
		
		
		System.out.println("Nombre: " +negocio1.getNombre());
		System.out.println("Maquina : " +negocio1.getMaquinaA());
		
		
		Maquina  maquina1=negocio1.getMaquinaA() ;
		double capacidad=maquina1.getCapacidadMaxima();
		
	

	}

}
