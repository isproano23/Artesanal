package com.krakedv.artesanal.testJUnit;


import  org.junit.jupiter.api.Test;

import com.Krakedev.artesanal.Maquina;

import static org.junit.jupiter.api.Assertions.*;

public class TestServirCervezaAI {

    private static final double DELTA = 0.0001;

    /**
     * Caso 1:
     * Cuando hay suficiente cerveza disponible,
     * la máquina debe servir la cantidad solicitada,
     * descontarla del total y retornar el valor correcto.
     */
    @Test
    public void testServirConStockSuficiente() {
        Maquina maquina = new Maquina("Pilsener","966", "Rubia", 0.05, 1000);

        maquina.recargarCerveza(500); // dejamos 500 ml disponibles

        double valor = maquina.servirCerveza(200);

        // Verifica el valor a pagar: 200 * 0.05 = 10
        assertEquals(10.0, valor, DELTA);

        // Verifica que la cantidad actual disminuyó correctamente: 500 - 200 = 300
        assertEquals(300.0, maquina.getCantidadActual(), DELTA);
    }

    /**
     * Caso 2:
     * Cuando la cantidad solicitada es exactamente igual a la disponible,
     * debe servir todo, dejar en 0 la máquina y calcular correctamente el valor.
     */
    @Test
    public void testServirCantidadExacta() {
        Maquina maquina = new Maquina("Pilsener","2805", "Rubia", 0.05, 1000);

        maquina.recargarCerveza(300);

        double valor = maquina.servirCerveza(300);

        // Verifica valor: 300 * 0.05 = 15
        assertEquals(15.0, valor, DELTA);

        // Verifica que la máquina queda vacía
        assertEquals(0.0, maquina.getCantidadActual(), DELTA);
    }

    /**
     * Caso 3:
     * Cuando NO hay suficiente cerveza,
     * no debe servir nada, no debe modificar la cantidad
     * y debe retornar 0.
     */
    @Test
    public void testServirSinStockSuficiente() {
        Maquina maquina = new Maquina("Pilsener", "1347","Rubia", 0.05, 1000);

        maquina.recargarCerveza(100);

        double valor = maquina.servirCerveza(200);

        // No debe cobrar nada
        assertEquals(0.0, valor, DELTA);

        // No debe cambiar la cantidad disponible
        assertEquals(100.0, maquina.getCantidadActual(), DELTA);
    }

    /**
     * Caso 4:
     * Cuando la máquina está vacía,
     * no debe servir nada y debe retornar 0.
     */
    @Test
    public void testServirConMaquinaVacia() {
        Maquina maquina = new Maquina("Pilsener","8523", "Rubia", 0.05, 1000);

        double valor = maquina.servirCerveza(100);

        // No debe cobrar
        assertEquals(0.0, valor, DELTA);

        // La cantidad sigue en 0
        assertEquals(0.0, maquina.getCantidadActual(), DELTA);
    }

    /**
     * Caso 5:
     * Validar que el cálculo del precio depende correctamente
     * del precio por mililitro configurado.
     */
    @Test
    public void testCalculoConDiferentePrecio() {
        Maquina maquina = new Maquina("IPA","7452" ,"Amarga", 0.10, 1000);

        maquina.recargarCerveza(500);

        double valor = maquina.servirCerveza(100);

        // 100 * 0.10 = 10
        assertEquals(10.0, valor, DELTA);

        // Verifica descuento correcto
        assertEquals(400.0, maquina.getCantidadActual(), DELTA);
    }
}
