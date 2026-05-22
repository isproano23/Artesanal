package com.krakedv.artesanal.testJUnit;


	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Cliente;

	public class ClienteTest {

	    @Test
	    public void testRegistrarCliente() {
	        NegocioMejoradoTest negocio = new NegocioMejoradoTest();

	        negocio.registrarCliente("Juan", "1111111111");

	        assertEquals(1, negocio.getClientes().size());
	    }

	    @Test
	    public void testBuscarClientePorCedulaExistente() {
	        NegocioMejoradoTest negocio = new NegocioMejoradoTest();

	        negocio.registrarCliente("Ana", "2222222222");
	        Cliente encontrado = negocio.buscarClientePorCedula("2222222222");

	        assertNotNull(encontrado);
	        assertEquals("Ana", encontrado.getNombre());
	    }

	    @Test
	    public void testBuscarClientePorCedulaNoExistente() {
	        NegocioMejoradoTest negocio = new NegocioMejoradoTest();

	        Cliente encontrado = negocio.buscarClientePorCedula("9999999999");

	        assertNull(encontrado);
	    }

	    @Test
	    public void testBuscarClientePorCodigoExistente() {
	        NegocioMejoradoTest negocio = new NegocioMejoradoTest();

	        negocio.registrarCliente("Luis", "3333333333");
	        // El código se genera automáticamente como C-1, C-2, etc.
	        Cliente encontrado = negocio.buscarClientePorCodigo(1);

	        assertNotNull(encontrado);
	        assertEquals("Luis", encontrado.getNombre());
	    }

	    @Test
	    public void testBuscarClientePorCodigoNoExistente() {
	        NegocioMejoradoTest negocio = new NegocioMejoradoTest();

	        Cliente encontrado = negocio.buscarClientePorCodigo(999);

	        assertNull(encontrado);
	    }
	}


	