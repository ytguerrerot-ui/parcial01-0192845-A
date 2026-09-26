# Primer Parcial Práctico – Programación I

## Versión A

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Consumo de agua por sectores

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa de servicios públicos registró el consumo diario de agua de **10 sectores** de la ciudad. La información se expresa en metros cúbicos enteros y debe almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite el consumo de cada sector y valide que no sea negativo. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El consumo total de los 10 sectores.
   - El promedio de consumo.
   - El número del sector con el mayor consumo.
   - Cuántos sectores tuvieron un consumo superior al promedio.
   - La racha más larga de sectores consecutivos cuyo consumo fue superior al promedio.
4. Muestre el listado final con el número de cada sector y su consumo registrado.

## Aclaraciones

- Los sectores se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si los sectores 3, 4 y 5 superan el promedio, existe una racha de longitud 3.
- Para determinar cuáles consumos superan el promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 consumos | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación del sector con mayor consumo | 10 |
| Conteo de sectores por encima del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Control de producción semanal

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una pequeña fábrica cuenta con **4 máquinas** y registra durante **5 días** la cantidad de piezas producidas por cada una. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una máquina.
- Cada columna representa un día de trabajo.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite la producción de cada máquina durante cada día y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total producido por cada máquina.
   - El total producido en cada día, sumando las cuatro máquinas.
   - La máquina con la mayor producción acumulada.
   - El día con la menor producción total.
   - Cuántos registros de la matriz fueron inferiores a 20 piezas.
4. Muestre la matriz completa, organizada por máquinas y días.

## Aclaraciones

- Las máquinas se numeran del 1 al 4 y los días del 1 al 5.
- Si dos máquinas tienen el mismo total máximo, se reporta la primera.
- Si dos días tienen el mismo total mínimo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada máquina | 10 |
| Cálculo del total de cada día | 10 |
| Identificación de la máquina mayor y el día menor | 10 |
| Conteo de registros inferiores a 20 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega

Entregue los dos archivos `.java`, debidamente nombrados y capaces de compilar y ejecutarse sin errores.

**Antes de escribir código, identifique las entradas, el proceso y las salidas. El compilador detecta errores de sintaxis; la lógica todavía corre por cuenta del programador.**

# Primer Parcial Práctico – Programación I (Versión A)

Este repositorio contiene la solución de los dos ejercicios prácticos del primer parcial de Programación I, desarrollados en Java, desde consola, usando únicamente `Scanner`, arreglos, ciclos y condicionales (sin `ArrayList`, sin colecciones, sin métodos de ordenamiento automático y sin métodos propios), tal como lo exigía el enunciado.

Cada ejercicio está resuelto en un archivo `.java` independiente y toda la lógica vive dentro del método `main`.




 ### ===================== requisitos pedidos e el README .md================================

## Ejercicio 1 – Consumo de agua por sectores
**Archivo:** `Ejercicio1A.java`

Este repo tiene los dos ejercicios del primer parcial de Programación I, hechos en Java desde consola. Como pedía el enunciado, todo está resuelto directamente en el `main`, sin `ArrayList`, sin colecciones ni métodos de ordenamiento automático, y cada ejercicio va en su propio archivo `.java`.


### ¿Qué hace el programa?
calcula y registra el consumo diario de agua de 10 sectores de una ciudad, usando un arreglo unidimensional de enteros

### Entradas
- 10 valores enteros (uno por sector), correspondientes al consumo en metros cúbicos.
- Cada valor se valida al momento de ingresarlo: si el usuario escribe un número negativo, el programa lo rechaza y vuelve a pedirlo hasta que se confirme que sea valido.

### Proceso
- Se recorre el arreglo para sumar el consumo total y calcular el promedio de todos los valores requeridos en el suistema.
- Se busca el sector con el mayor consumo, guardando la primera posición encontrada en caso de empate.
- Se recorre nuevamente el arreglo (ya con el promedio calculado) para contar cuántos sectores superan ese promedio.
- Se calcula la racha más larga de sectores consecutivos que están por encima del promedio, usando un contador que se reinicia cada vez que se rompe la secuencia.

### Salidas
- Consumo total de los 10 sectores.
- Promedio de consumo.
- Sector con mayor consumo.
- Cantidad de sectores por encima del promedio.
- Longitud de la racha más larga de sectores consecutivos sobre el promedio.
- Listado final con el número de cada sector y su consumo.

### ¿Qué se aprendió con este ejercicio?
Lo primero que noté es lo fácil que es confundirse entre la posición del arreglo y el número del sector. El arreglo arranca en 0 pero el sector 1 es el que el usuario entiende, así que hay que acordarse de sumarle 1 cada vez que se muestra algo en pantalla. Es un detalle chiquito pero es justo el tipo de error que uno comete sin darse cuenta al principio.

Otra cosa que entendí mejor fue por qué a veces hay que recorrer el mismo arreglo dos veces. No hay forma de saber cuántos sectores superan el promedio mientras se está calculando el promedio, porque ese dato todavía no existe. Primero hay que terminar de sumar y dividir, y solo después volver a mirar arreglo por arreglo comparando cada valor contra ese promedio ya calculado.

Lo de la racha fue lo que más trabajo me costó pensar. No es lo mismo que contar cuántos sectores superan el promedio (eso es solo un contador que sube), sino que hay que llevar un conteo que se resetea apenas se rompe la secuencia, y guardar aparte cuál fue el conteo más alto que se alcanzó. Al principio se me olvidaba reiniciar el contador cuando el consumo bajaba del promedio, y eso me dañaba el resultado.



## ==================== Ejercicio 2 – Control de producción semanal============================
**Archivo:** `Ejercicio2A.java`

### ¿Qué hace el programa?
Simula el registro de la producción semanal de 4 máquinas durante 5 días, usando una matriz (arreglo bidimensional) de 4 filas por 5 colummnas.

### Entradas
- 20 valores enteros en total (4 máquinas × 5 días), ingresados uno por uno.
- Cada valor se valida para que no sea negativo, igual que en el ejercicio anterior.

### Proceso
- Se recorre cada fila para sumar el total producido por cada máquina.
- Se recorre cada columna para sumar el total producido en cada día.
- Se identifica la máquina con mayor producción acumulada (primera en caso de empate).
- Se identifica el día con menor producción total (primero en caso de empate).
- Se recorre toda la matriz para contar cuántos registros individuales fueron inferiores a 20 piezas.

### Salidas
- Total producido por cada una de las 4 máquinas.
- Total producido en cada uno de los 5 días.
- Máquina con mayor producción acumulada.
- Día con menor producción total.
- Cantidad de registros (celdas) inferiores a 20 piezas.
- La matriz completa, organizada visualmente por máquinas (filas) y días (columnas).

### ¿Qué se aprendió con este ejercicio?
Este fue el que más me hizo pensar en "por dónde recorro la matriz". Sumar por máquina es recorrer una fila completa, y sumar por día es recorrer una columna completa, usando los mismos datos pero moviéndose en direcciones distintas. Al principio se me hacía raro tener que cambiar cuál índice se queda fijo y cuál se mueve, pero una vez que lo armé una vez, la lógica para lo demás (máximo, mínimo, conteo) fue prácticamente calcada de lo que ya había hecho en el ejercicio 1, solo que ahora con un ciclo dentro de otro.

También aprendí que mostrar una matriz "bonita" en consola no es tan trivial como parece. Usar `printf` para que las columnas queden alineadas me tomó más tiempo del que esperaba, pero al final se nota la diferencia entre una salida que solo muestra números sueltos y una que realmente se ve como una tabla.
---

## Aprendizaje general del parcial

Si algo me dejó claro este parcial es que antes de escribir una sola línea de código conviene sentarse a pensar qué entra, qué hay que calcular y qué se tiene que mostrar al final. Cuando uno tiene esas tres cosas claras, es mucho más fácil decidir cuántos ciclos se necesitan y qué variables hay que crear antes de siquiera pedir el primer dato.

También me quedó claro es que el compilador solo te avisa si escribiste mal el código, pero no si la lógica está mal. Un programa puede compilar perfecto y aun así darte el sector equivocado o la racha mal contada, así que hay que probar con varios casos, incluyendo empates y valores raros, para estar seguro de que realmente funciona como debería.

---

## Posibles mejoras futuras

Aunque ambos programas cumplen con lo pedido en el enunciado, hay varios puntos donde se podrían mejorar si se levantaran las restricciones del parcial o se quisiera llevar el ejercicio a un nivel más profesional:

1. **Modularizar el código con métodos propios.** Actualmente toda la lógica está en `main` porque así lo exigía el ejercicio. Separar la lectura, la validación, los cálculos y la impresión en métodos distintos haría el código más legible, más fácil de probar y más fácil de reutilizar.
2. **Manejo de excepciones en la entrada de datos.** Si el usuario ingresa una letra o un texto en lugar de un número, `Scanner.nextInt()` lanzaría una excepción y el programa se cerraría abruptamente. Agregar manejo de excepciones (`try-catch`) o validar el tipo de dato antes de convertirlo evitaría estos errores.
3. **Permitir tamaños dinámicos.** El número de sectores (10) y el tamaño de la matriz (4x5) están fijos. Se podría pedir estos valores al usuario o leerlos desde un archivo, haciendo el programa más flexible.
4. **Separar la lógica de negocio de la lógica de presentación.** En una versión más avanzada, los cálculos podrían devolver resultados que luego se muestren de distintas formas (consola, archivo de texto, tabla más elaborada), en lugar de mezclar cálculo e impresión.
5. **Agregar pruebas automatizadas.** Escribir pruebas unitarias (por ejemplo, con JUnit) que verifiquen el comportamiento con datos de prueba conocidos (incluyendo empates y rachas) ayudaría a confirmar que la lógica es correcta sin depender de la revisión manual.
6. **Mejorar la interfaz de consola.** Se podrían agregar menús, colores o mensajes más descriptivos para que la experiencia de uso sea más amigable, especialmente si el programa lo va a usar alguien que no participó en su desarrollo.
7. **Guardar los resultados.** Actualmente los resultados solo se muestran en consola y se pierden al cerrar el programa. Exportarlos a un archivo `.txt` o `.csv` permitiría conservarlos y analizarlos después.

---

## Estructura de entrega

```
 Ejercicio1A.java   = Consumo de agua por sectores (arreglo unidimensional)
 Ejercicio2A.java   = Control de producción semanal (matriz 4x5)
 README.md          = Este archivo
```
---
### lo que cambiaria si el parcial no tuviera restricciones.

 Sacar la lógica del `main` y meterla en métodos separados (uno para leer, otro para validar, otro para calcular). Ahora mismo todo está junto porque así lo pedía el ejercicio, pero se nota que el código sería más limpio si estuviera dividido.
- Manejar el caso en que el usuario escriba una letra en vez de un número. Ahora mismo, si eso pasa, el programa se cae porque `Scanner.nextInt()` no sabe qué hacer con eso.
- Que el tamaño del arreglo y de la matriz no estén fijos (10 sectores, 4x5), sino que se puedan pedir al usuario o leer desde un archivo.
- Guardar los resultados en un archivo de texto en vez de que se pierdan apenas se cierra la consola.
- Con más tiempo, hasta le pondría pruebas automatizadas para no tener que revisar a mano que la racha o los empates estén bien calculados cada vez que toque cambiar algo.






