# Prueba especifica unidad 3, 5 y 6

> Se evaluará el RA2, RA4 y RA7

## 1. Descripción de la prueba

Tenemos un conjunto de clases que nos permiten simular la realización de un concierto. Las clases que actualmente tienes en el repositorio son las siguientes:
- `Log` contiene lo necesario para enviar mensajes de log. No cambiará.
- `Nota` es una clase enumerada para trabajar con las notas musicales. No cambiará.
- `Concierto` tiene el método `main` que ejecuta una prueba de nuestro programa concierto. Pero si te fijas bien, este solo se puede dar con un solo intérprete y el intérprete solo saben tocar un único instrumento.
- `Piano` representa un instrumento, `melodía` es una lista de notas y el método `play` "las reproduce según el instrumento", en el caso de la clase que describimos, según el piano.
- `Pianista` representa un intérprete, `partitura` es una lista de notas y el método `interpretar`, interpreta la partitura tocando (`play`) el instrumento para reproducir las notas.

Como habrás observado en el archivo `Concierto.kt`, actualmente solo se puede dar el concierto con un único interprete, el cuál solo puede tocar un instrumento. En concreto, el pianista tocando el piano.


## 2. ¿Qué se pide?

Se quiere mejorar el diseño del programa para que se pueda dar un concierto de varios Músicos (Pianistas, Violinistas, etc) y otro Interpretes como por ejemplo ejemplo estudiantes de música. Además, los intérpretes deben poder tocar cualquier tipo de instrumento (Piano, Violin, Guitarra). A continuación se entra en más detalle:

1. Hasta ahora se daba el concierto monoInterprete, ahora se quiere poder dar conciertos por cualquier persona que sepa interpretar una obra. `Interprete`. Para ello, se ejecutará un concierto según el epigrafe Ejecución.
2. Un `Pianista`, o cualquier otro interprete, podrá interpretar (método `interpretar`) cualquier instrumento (`Instrumento`, método `play`)
3. Por lo pronto, tendremos 2 instrumentos: `Piano`y `Violin`, cada uno con un `play` especializado. Por tanto el método `play` es **único** para cada instrumento.
4. Hay que evitar la dependencia que existe entre `Pianista` y `Piano`. Es decir, la dependencia entre Interprete y Instrumento ¿Cómo lo harías?.
5. Hay que tener en cuenta que todos los músicos, tendrán un comportamiento común, aunque cada músico interpretará (método `interpretar`, `Musico`) a su manera,
6. Se quiere poder realizar conciertos por cualquier persona que sepa interpretar una obra. `Interprete`, aunque no sea músico.
7. Por lo pronto, tendremos 2 músicos: `Pianista`y `Violinista`, cada uno con un `Interpretar` especializado.
8. Con respecto al instrumento, añadir método `reset` al `Instrumento` para poder limpiar la melodía asociada y añadir método `incorporaMelodia(Array<Nota?>)` para añadir una melodía nueva directamente.
9. Añade al codigo que ejecuta el concierto (El mostrado en el epígrafe Ejecución), un nuevo Interprete EstudianteMusica que no sea Musico, que toque un instrumento Guitarra.
10. Hay que documentar la clase `Instrumento`, según las indicaciones de KDoc.
11. Generar la documentación haciendo uso de Dokka.

## 3. Ejecución y test
La práctica se ejecutará con este código:
```kotlin
fun main() {
    val obra = arrayOf<Nota?>(Nota.MI, Nota.MI, Nota.DO, Nota.FA)
    val interpretes = mutableMapOf<String, Interprete>(
        "Pianista" to Pianista( Piano(), obra),
        "Violinista" to Violinista( Violin(), obra)
    )

    repeat(2)
    {
        interpretes.keys.random().run {
            interpretes[this]?.interpretar()
            interpretes.remove(this)
        }
    }
}
```
Y la salida debería ser similar a lo siguiente:

```
####### - SOY PIANISTA
===> Tocando piano
miiii miiii dooo faaa 

####### - SOY VIOLINISTA
===> Tocando violin
miggg miggg doggg faggg 

####### - SOY AlUMNO DE MUSICA
===> Tocando guitarra
miiii miiii dooo faaa 


Process finished with exit code 0

```
### Estructura de clases final esperado

La estructura de clase que se espera es la siguiente:

![](./../resources/un5y6/uml.png)

## 4. Evaluación

Se tendrá en cuenta el uso de superclases, interfaces, clases y métodos abstractas, el uso de jerarquía de clases ya conocidas y que nos las proporcionan kotlin, como por ejemplo List, Map, Set. etc. La creación de constructores, uso de get/set.

###### Se han creado clases heredadas que sobrescriban la implementación de métodos de la superclase.
0. No lo hace; 5. Crea clases heredadas que sobreescriben pero no adecuadamente o no completo; 10. Correcto.
###### Se han diseñado y aplicado jerarquías de clases.
0. No lo hace; 5. Se diseña y aplica jerarquía pero no adecuadamente o no completa; 10. Correcto.
###### Se han probado y depurado las jerarquías de clases.
0. No lo hace; 5. No funciona adecuadamente; 10. Correcto.
###### Se han realizado programas que implementen y utilicen jerarquías de clases.
0. No lo hace; 5. Implementa y utiliza jerarquías de clases vistas pero no correctamente; 10. Correcto.


Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

## 5. Condiciones de entrega

Se entrega la URL al repositorio en la actividad.

## 6. Bibliografía

- [Principio de inversión de dependencias](https://github.com/revilofe/IESRA-DAM-Prog/blob/master/ejercicios/src/main/kotlin/un6/dip/dip.md)