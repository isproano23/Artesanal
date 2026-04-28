package com.krakedv.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Maquina;

public class TestRecargarJunit {
	
	@Test
	public void testRecargaExitosa() {
		
		Maquina rubia = new Maquina("Pilsener","963","Cerveza", 0.02, 8000);
		boolean resultado=rubia.recargarCerveza(3000);
		assertTrue(resultado);
		assertEquals(3000, rubia.getCantidadActual(),0.0001);
	}
	
	
	@Test
	public void testRecargaFallidaPorDesbordi() {
		
		Maquina negra = new Maquina("Club","8855", "Cerveza Fria", 0.03, 8000);
		negra.recargarCerveza(7000);
		boolean resultado=negra.recargarCerveza(1000);
		assertTrue(resultado);
		assertEquals(3000, negra.getCantidadActual(),0.0001);
	}

}
