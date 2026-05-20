package com.krakedv.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Cliente;
import com.Krakedev.artesanal.Maquina;
import com.Krakedev.artesanal.Negocio;

public class TestConsumoCliente {
	
	@Test
	public void ProbarConsumo(){
		
		
		Maquina  maquinaA= new Maquina("Pilsener","8556","Rubia",0.02,8000);
		
		Negocio  barDeMoe = new Negocio("Bar De Moe",maquinaA);
		
		Cliente clienteA = new Cliente ("Mario","1522366");
		
		
		
		barDeMoe.cargarMaquinaA();
		barDeMoe.consumirCevervezaMaquinaA(clienteA, 100);
		
		assertEquals(7700.00,maquinaA.getCantidadActual(),0.0001);
		assertEquals(2.0,clienteA.getTotalConsumido(),0.0001 );
		
		barDeMoe.consumirCevervezaMaquinaA(clienteA, 200);
		
		assertEquals(7500,maquinaA.getCantidadActual(),0.0001 );
		assertEquals(6.0,clienteA.getTotalConsumido() ,0.0001);
		
	}

}
