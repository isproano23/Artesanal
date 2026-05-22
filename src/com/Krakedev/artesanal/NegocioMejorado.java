package com.Krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
<<<<<<< HEAD
    private ArrayList<Maquina> maquinas;
    private ArrayList<Cliente> clientes;

    private int ultimoCodigoCliente = 0;
    public NegocioMejorado() {
        maquinas = new ArrayList<>();
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public String generarCodigo() {
        int numero = (int) (Math.random() * 100) + 1;
        return "M-" + numero;
    }

    public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorML) {
        String codigo = generarCodigo();

        // Validar duplicados
        if (recuperarMaquina(codigo) != null) {
            return false; // código ya existe
        }

        Maquina maquina = new Maquina(codigo, nombreCerveza, descripcion, precioPorML);
        maquinas.add(maquina);
        return true;
    }

    public void cargarMaquinas() {
        for (Maquina m : maquinas) {
            m.llenarMaquina();
        }
    }

    public Maquina recuperarMaquina(String codigo) {
        for (Maquina m : maquinas) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }
    
 // --- Métodos de Clientes ---
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
            if (c.getCodigo() == codigo) { // ✔ correcto para int
                return c;
            }
        }
        return null;
    }
=======
	
	private ArrayList<Maquina> maquinas;
	

	public NegocioMejorado(ArrayList<Maquina> maquinas) {
		this.maquinas = new  ArrayList<Maquina>();
	}
	

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
	public String generarCodigo() {
        int numero = (int) (Math.random() * 100); 
        return "M-" + numero;
    }

	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorML) {
        String codigo = generarCodigo();

        // Validar duplicado
        if (recuperarMaquina(codigo) != null) {
            return false; // ya existe una máquina con ese código
        }

        Maquina nueva = new Maquina(codigo, nombreCerveza, descripcion, precioPorML);
        maquinas.add(nueva);
        return true; // agregado correctamente
    }
	
	 public void cargarMaquinas() {
	        for (Maquina m : maquinas) {
	            m.llenarMaquina(); // invoca llenarMaquina de cada objeto
	        }
	    }
	 
	 
	 public Maquina recuperarMaquina(String codigo) {
	        for (Maquina m : maquinas) {
	            if (m.getCodigo().equals(codigo)) {
	                return m; // retorna la máquina encontrada
	            }
	        }
	        return null; // si no existe
	    }
	 
	 
>>>>>>> b404326511c30bf49a0b8d16d576e6b35d000f58

}
