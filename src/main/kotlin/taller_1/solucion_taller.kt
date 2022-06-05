package taller_1

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

fun valorPresente(c:Double, t:Double, n:Double):Double{
    return (c/ (1 + t).pow(n))
}
fun main(){



}