package com.Krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
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
	 
	 

}
