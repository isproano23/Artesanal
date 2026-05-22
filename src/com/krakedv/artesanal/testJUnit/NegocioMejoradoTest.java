package com.krakedv.artesanal.testJUnit;

import java.util.ArrayList;

import com.Krakedev.artesanal.Cliente;
import com.Krakedev.artesanal.Maquina;

public class NegocioMejoradoTest {
	
	    private ArrayList<Cliente> clientes = new ArrayList<>();
	    private int ultimoCodigoCliente = 0;

	    // Getter necesario para que compile el test
	    public ArrayList<Cliente> getClientes() {
	        return clientes;
	    }

	    public void registrarCliente(String nombre, String cedula) {
	        ultimoCodigoCliente++;
	        String codigo = "C-" + ultimoCodigoCliente;
	        Cliente cliente = new Cliente(nombre, cedula);
	        clientes.add(cliente);
	    }

	    public Cliente buscarClientePorCedula(String cedula) {
	        for (Cliente c : clientes) {
	            if (c.getCedula().equals(cedula)) {
	                return c;
	            }
	        }
	        return null;
	    }

	    public Cliente buscarClientePorCodigo(int codigo) {
	        for (Cliente c : clientes) {
	            if (c.getCodigo() == codigo) {  // ✔ correcto para int
	                return c;
	            }
	        }
	        return null;
	    }
	    
	    private ArrayList<Maquina> maquinas = new ArrayList<>();

	    public ArrayList<Maquina> getMaquinas() {
	        return maquinas;
	    }

	    public void agregarMaquina(Maquina maquina) {
	        maquinas.add(maquina);
	    }
	    
	    public double consultarValorVendido() {
	        double total = 0;
	        for (Cliente c : clientes) {
	            total += c.getTotalConsumido();
	        }
	        return total;
	    }
	    
	    

	}

	
	





