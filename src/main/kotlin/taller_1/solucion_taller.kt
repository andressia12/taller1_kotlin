package taller_1
fun main(){
    //print("Hola Mundo")
}
/*
     print("Ingrese la base: ")
    val b = readLine()!!.toDouble()
    print("Ingrese altura: ")
    val a = readLine()!!.toDouble()
    println("El area es: ${area_del_triangulo(b,a)}")
 */




// -------------------------Actividad 1. Traducción de ecuaciones----------------------------------------
/*
a.
var s = Math.sqrt(Math.pow(X-m,2.0)/(n-1))
b.
var p = -(Math.pow(y,3.0)-1)/((y+1)-(Math.sqrt(y+1))

d. var t = 1 - (Math.pow(X-2,(1/n)))/(Math.pow(X,3))

f. s = ((a >= b * c) || (b <= c) )
 */




//--------------------------- Actividad 2: Paso a paso de expresiones aritméticas-----------------------


/*
a. 30 + 24/6 -4 % 6
   30+4-4%6
   30+4-4
   34-4
   30

b.  1.5 - 2.5 * 3.0
    1.5 - 7.5
    -6

 */


//---------------------------------------- Actividad 3: Funciones -------------------------------------


/*
Enunciado a: Realice una función que halle el área de un triángulo.
Entradas
base-->double-->b
altura-->double-->a
Salidas
area-->double-->area
 */

fun area_del_triangulo(b:Double, a:Double):Double{
    val area = (b*a)/2
    return area
  }

/*
Enunciado b: Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas
bicicletas necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de
la universidad.
Entradas
estudiantes-->int-->est
CostoBicicleta --> Double -->cos
Salidas
bicicletas-->int-->bic
alquilerBicicleta-->double-->alq
 */

fun alquiler_bicicleta (est:Int, cos:Double):Pair<Int, Double>{

    var bic =  est / 2
    var  alq =  bic * cos

    return Pair (bic,alq)

}

/*
Enunciado d: Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.
Entradas
Peso_colombiano --> pc
dolar_actual-->Double-->da
Salidas
Dolar-->d
 */

fun conversion(pc:Double, da: Double):Double{
    val d = pc/da
    return d
}
/*
Enunciado f: Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan.
Considere que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como
completas y realice una función que permita determinar el cobro.

Entradas
Horas-->Double--> h
minutos--> Double -->m
costoHora --> Double --> ch
Salidas
cobroParqueadero-->Double-->cp
 */

fun cobro_parqueadero(h:Double, m:Int, ch:Double):Double{
    if (m == 0) {
         var cp = ch * h
        return cp
    } else {
        var cp = (ch * h) + ch
        return cp
    }
}

/*

Enunciado h:  Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en
bicicleta, considerando que lleva una velocidad constante. Realice una función para tal fin.

Entradas
distanciaRecorrida --> Double --> dr
velocidadConstante -- Dpuble -- > vc
Salidas
Tiempo --> Double --> t d/v

 */

fun tiempo (dr:Double, vc: Double): Double{

  val t = dr / vc
    return t

}

/*
Enunciado j : Realice una función para determinar la nota final que obtendrá un alumno considerando que
realiza tres exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que
el tercero de 50%.

Entradas
examenUno--> Double -->eu
examenDos-->Double --> ed
examenTres--> Double --> et
Salidas
notaFinal --> Double --> nf
 */
fun nota_final(eu:Double, ed: Double, et: Double):Double{
    val nf = ((eu * 0.25) + (ed * 0.25) + (et * 0.5))
    return nf
}
/*
Enunciado l : El presidente de la república ha decidido estimular a todos los estudiantes de una universidad
mediante la asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios:
Para alumnos mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor
o igual a 75, de$1000.00; para los promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás
se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000; con
promedios menores a 90 pero mayores o iguales a 80, $2000; para los alumnos con promedios menores a 80
pero mayores o iguales a 60, se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará
carta de invitación. Realice la función correspondiente.

Entradas

edadAlumno --> Int --> ea
promedioAlumno -->Double --> pa

Salidas
valorBeca--> Double --> vb
cartaInvitacion --> String --> ci
 */

fun valor_beca(ea:Int, pa: Double):Pair<Double, String> {

    if (ea <= 18) {
        if (pa >= 90) {
            var vb = 3000.0
            var ci = ""
            return Pair(vb,ci)
        } else if (pa >= 80 && pa < 90) {
            var vb = 2000.0
            var ci = ""
            return Pair(vb,ci)
        } else if (pa >= 60 && pa < 80) {
            var vb = 100.0
            var ci = ""
            return Pair(vb,ci)
        } else {
            var vb = 0.0
            val ci = "Se invita al estudiante a mejorar el promedio en el próximo ciclo escolar para aspirar " +
                    "a una beca"

            return Pair(vb,ci)
        }
    } else {
        if (pa >= 90) {
            var vb = 2000.0
            var ci = ""
            return Pair(vb,ci)
        } else if (pa >= 75 && pa < 90) {
            var vb = 1000.0
            var ci = ""
            return Pair(vb,ci)
        } else if (pa >= 60 && pa < 75) {
            var vb = 500.0
            var ci = ""
            return Pair(vb,ci)
        } else {
            var vb = 0.0
            val ci = "Se invita al estudiante a mejorar el promedio en el próximo ciclo escolar para aspirar " +
                    "a una beca"
            return Pair(vb,ci)
        }
    }
}

/*
Enunciado n:En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con
cables. Se necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
Escriba una función que determine el número de cables a comprar a partir del número de computadores que hay en
la sala.

Entradas
Computadores --> Double --> c
Salidas
Cables --> Double--> cables
 */

fun numero_cables(c:Double): Double{
    if (c%2 == 0.0){
        var cables = c/2
        return cables
    }else{
        var cables = c/2 + 1
        return cables
    }

}
/*
Enunciado p : Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una
función que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de
La Mujer Maravilla.

Entradas
conexion-->Double--> c = 4.0
pesoPelicula --> Double--> p

Salidas
minutos--> Double--> m
segundos--> Double --> s
 */

fun tiempo_descarga(c:Double,p:Double ):Pair<Double, Double>{
     val velDescarga = (c * 1024)/8
     val s = (1024 * p) / velDescarga
     var m =  s / 60
     return Pair(s,m)
}

/*Enuncido i: Realice un algo ritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y
el precio final).

Entradas:
precio_neto_articulo-->Double-->pna
Salidas
descuento-->d-->Double
PrecioFinal-->pf-->Double*/

fun precio_articulo(pna:Double):Pair<Double, Double>{
    var des = pna * 0.05
    var d = pna-des
    val pf = d * 0.19
    //return d to pf  otra forma de retornar
    return Pair(d,pf)
}


