 package com.krakedv.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Cliente;
import com.Krakedev.artesanal.Negocio;

public class TestAsignarCodigoCliente {
	
	
	@Test
	public void asignarCodigo() {
		
		Negocio barDeMoe =new Negocio();
		
		Cliente mario =  new Cliente("Mario","175866369");
		
		Cliente andres =  new Cliente("Andres","124533369");
		
		barDeMoe.AsignarCodigoCliente(mario);
		barDeMoe.AsignarCodigoCliente(andres);
		
		assertEquals(100,mario.getCodigo());
		assertEquals(101,andres.getCodigo());
		
		
	}

}
