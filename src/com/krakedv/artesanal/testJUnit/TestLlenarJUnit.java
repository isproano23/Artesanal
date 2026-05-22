package com.krakedv.artesanal.testJUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Maquina;

public class TestLlenarJUnit {

	@Test
	public void testLlenarMaquina() {

		Maquina rubia = new Maquina("Pilsener","9633", "Cerveza", 0.02, 8000);

		rubia.llenarMaquina();

		assertEquals(7800, rubia.getCantidadActual(), 0.0001);
	}

}
