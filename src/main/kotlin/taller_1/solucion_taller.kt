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


import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.math.PI
import kotlin.math.pow

/*
Taller No 1
Diplomado de Desarrollo Móvil

 */

/*
Actividad 1.  Traducción de ecuaciones

a) var s= Math.sqrt(Math.pow(x-m , 2.0)/n-1)

b) var p= -(Math.pow(y,3.0)-1)/(y+1)-Math.sqrt(y+1)

c) var z= x*(Math.pow((Math.pow(x , 2.0)+1) ,3.0))

d)

e) var s = ((x != y) && (x <= y))

f)

------------------------------------------------------------
Actividad 2.  Evaluar paso a paso

a) 30+8*3/6-4%6
 var c = 8*3
    c /= 6
    c %= 6
    c = 30 + 4 -c

b)

c) 8/4/2*6

var cp = 8 / 4
    cp /= 2
    cp *= 6
*/
//---------------Actividad 3 Modelaje de Funciones---------
/*
a) Enunciado:  Hallar el area de un triangulo
Entradas:
base -->double-->b
altura -->double-->a
Salidas:
area-->double-->area
*/

fun areaDelTriangulo(b: Double, a: Double): Double {
    return (b * a) / 2
}

/*
b) Enunciado:
Entradas:

Salidas:

*/


/*
c) Enunciado: Determinar cuantas personas desempleadas hay en colombia
Entradas:
Población activa -->Double-->pa
Porcentaje de poblacion inactiva --> Double --> pi

Salidas:
Número de personas desempleadas --> Int -->pd
*/
fun personasDesempleadas(pa:Double, pi:Double):Int{
    return (pa * pi).toInt()
}


/*
d) Enunciado: Determinar cuántos dólares se pueden adquirir con cierta cantidad de pesos colombianos
Entradas:
peso_colombiano-->Double-->pc
dolar_atual-->Double-->da
Salidas:
Dolar-->Double
*/
fun conversion(pc:Double, da:Double):Double{
        return (pc/da)
}



/*
e) Enunciado: Se requiere obtener la edad de la persona, con el año de nacimiento
Entradas:
año_de_nacimiento -->Int-->year

Salidas:
edad-->Int

*/
fun edad(year:Int):Int{
    val fAct = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy")
    val yearAct = fAct.format(formatter).toInt()
    return (yearAct - year)
}


/*

f) Enunciado:
Entradas:

Salidas:

*/






/*
g) Enunciado: Determinar cuánto cobrar por trabajos de pintura. Considere que se cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.
Entradas:
metros_cuadrados-->Double-->mtc
precio-->Int-->p

Salidas:
precio-->Double
*/

fun calculaPrecio(mtc:Double, p:Int):Double{
    return (mtc*p)
}

/*

h) Enunciado:
Entradas:

Salidas:

*/



/*

i) Enunciado: Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
considerando que tiene un descuento de 5%, y debe pagar 19% de IVA
 (debe retornar el precio con descuento y el precio final).
Entradas:
precio_neto_articulo-->Double-->pna

Salidas:
precio_final-->Double-->pf
precio_descuento-->Double-->d

*/
fun precioArticulo(pna:Double):Pair<Double, Double>{
    val des =pna*0.05
    val d= pna-des
    val pf=d*0.19
    return Pair(d,pf)
}

/*

j) Enunciado:
Entradas:

Salidas:

*/

/*

k) Enunciado: Se tiene el nombre y la edad de tres personas.
 Se desea saber el nombre y la edad de la persona de menor edad.
Entradas:
nombre_Persona_Uno -->String-->n1
nombre_Persona_Dos-->String-->n2
nombre_Persona_Tres-->String-->n3
edad_Persona_Uno -->Int-->e1
edad_Persona_Dos -->Int-->e2
edad_Persona_Tres -->Int-->e3
Salidas:


*/
fun menorEdad(n1:String, e1:Int, n2:String, e2:Int, n3:String, e3:Int):Pair<String,Int>{

    if (e1 <e2 && e1 < e3)
        return Pair(n1, e1)
    else if
            (e2 < e3)
        return Pair(n2, e2)
    else
        return  Pair(n3, e3)

}


/*

l) Enunciado:
Entradas:

Salidas:

*/


/*

m) Enunciado: Escriba una función que halle el volumen de un cono
Entradas:
radio -->Double-->rd
altura -->Double-->al

Salidas:

volumen_del_cono -->Double

*/
fun volumenCono(rd:Double, al:Double):Double {

    val areBase = PI * Math.pow(rd, 2.0)
    return (areBase * al / 3)
}
/*

n) Enunciado:
Entradas:

Salidas:

*/





/*

o) Enunciado: Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán
contaminados por la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?
Entradas:
población_de_la_ciudad -->Int --> pc
Salidas:
litros_agua_contaminada -->Double

*/

fun litroDeAguaContaminada(pc:Int):Double{
    val ba = pc*4
    return (ba*175.0)
}

/*

p) Enunciado: El valor presente de un cierto capital de dinero a una tasa de interés de t durante n años se encuentra a
partir de la fórmula: VP= C / (1+t)n

Entrada:
capital_de_dinero -->Double -->c
tasa_de_interes-->Double-->t
años_de_duracion-->Double-->n

Salidas:
valor_Presente -->Double --> Valor Presenbte

*/

fun valorPresente(c:Double, t:Double, n:Double):Long{
    var vp =c/ Math.pow(1.0+(t/100), n)
    return (Math.round(vp))
}
fun main(){


}