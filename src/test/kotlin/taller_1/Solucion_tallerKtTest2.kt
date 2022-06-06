package taller_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Solucion_tallerKtTest2 {

    @Test
    fun areaDelTriangulo() {
        assertEquals(2.0, taller_1.areaDelTriangulo(2.0,2.0))
    }

    @Test
    fun personasDesempleadas() {
        assertEquals(100, taller_1.personasDesempleadas(1000.0, 0.4))
    }

    @Test
    fun conversion() {
        assertEquals(3.0 , conversion(10500.0,3500.0))
    }

    @Test
    fun edad() {
        assertEquals(36,edad(1986))
    }

    @Test
    fun calculaPrecio() {
        assertEquals(10000.0, taller_1.calculaPrecio(40.0, 250))
    }

    @Test
    fun precioArticulo() {
        val datos = taller_1.precioArticulo(10000.0)
        val desc = datos.first
        val precioFinal = datos.second
        assertEquals(9500.0, desc)
        assertEquals(1805, precioFinal)
    }

    @Test
    fun menorEdad() {
        val datos = taller_1.menorEdad("german", 36, "lidis", 30, "thiago",15)
        val nombre = datos.first
        val edad = datos.second
        assertEquals("thiago", nombre)
        assertEquals(15, edad)
    }

    @Test
    fun volumenCono() {
       assertEquals(2094.3951023931954, taller_1.volumenCono(10.0,20.0))
    }

    @Test
    fun litroDeAguaContaminada() {
        assertEquals(560000.0, taller_1.litroDeAguaContaminada(800))

    }

    @Test
    fun valorPresente() {
        assertEquals(49257, taller_1.valorPresente(50000.0,0.5,3.0))
    }
}