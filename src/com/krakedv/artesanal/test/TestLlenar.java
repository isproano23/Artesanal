package com.krakedv.artesanal.test;

import com.Krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina rubia = new Maquina("Pilsener","1570", "cervezza fria", 0.02, 8000);

		rubia.imprimir();

		rubia.llenarMaquina();

		rubia.imprimir();

		Maquina negra = new Maquina("Club","2584", "cervezza buena", 0.03);

		negra.imprimir();
		negra.llenarMaquina();
		negra.imprimir();

	}

}
