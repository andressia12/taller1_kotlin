package taller_1

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class Solucion_tallerKtTest {

    @org.junit.jupiter.api.Test
    @Test
    fun area_del_triangulo() {
        assertEquals(2.0, taller_1.area_del_triangulo(2.0,2.0))
    }

    @Test
    fun alquiler_bicicleta() {
        var datos = taller_1.alquiler_bicicleta(40, 100.0)
        var bicicletas = datos.first
        var alquilerBicicleta = datos.second
        assertEquals(20, bicicletas)
        assertEquals(2000.0,alquilerBicicleta)
    }

    @Test
    fun conversion() {
        assertEquals(3.0, taller_1.conversion(10500.0,3500.0))
    }

    @Test
    fun cobro_parqueadero() {
        assertEquals(300.0,taller_1.cobro_parqueadero(1.0, 10, 150.0))
    }

    @Test
    fun tiempo() {
        assertEquals(250.0,taller_1.tiempo(5000.0,20.0))
    }

    @Test
    fun nota_final() {
        assertEquals(100.0,taller_1.nota_final(100.0,100.0,100.0))
    }

    @Test
    fun valor_beca() {
        var datos = taller_1.valor_beca(19, 95.0)
        var valorBeca = datos.first
        var cartaInvitacion = datos.second
        assertEquals(2000.0,valorBeca)
        assertEquals("",cartaInvitacion)
    }

    @Test
    fun numero_cables() {
        assertEquals(2.0,taller_1.numero_cables(4.0))
    }

    @Test
    fun tiempo_descarga() {
        var datos = taller_1.tiempo_descarga(4.0, 3.0)
        var segundos = datos.first
        var minutos = datos.second
        assertEquals(6.0,segundos)
        assertEquals(0.1,minutos)
    }
}