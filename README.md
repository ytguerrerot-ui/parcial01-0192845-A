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

---

## Ejercicio 1 – Consumo de agua por sectores
**Archivo:** `Ejercicio1A.java`

### ¿Qué hace el programa?
Simula el registro del consumo diario de agua de 10 sectores de una ciudad, usando un arreglo unidimensional de enteros.

### Entradas
- 10 valores enteros (uno por sector), correspondientes al consumo en metros cúbicos.
- Cada valor se valida al momento de ingresarlo: si el usuario escribe un número negativo, el programa lo rechaza y vuelve a pedirlo hasta que sea válido.

### Proceso
- Se recorre el arreglo para sumar el consumo total y calcular el promedio.
- Se busca el sector con el mayor consumo, guardando la primera posición encontrada en caso de empate.
- Se recorre nuevamente el arreglo (ya con el promedio calculado) para contar cuántos sectores superan ese promedio.
- Se calcula la racha más larga de sectores consecutivos que están por encima del promedio, usando un contador que se reinicia cada vez que se rompe la secuencia.

### Salidas
- Consumo total de los 10 sectores.
- Promedio de consumo (con dos decimales).
- Sector con mayor consumo.
- Cantidad de sectores por encima del promedio.
- Longitud de la racha más larga de sectores consecutivos sobre el promedio.
- Listado final con el número de cada sector y su consumo.

### ¿Qué se aprendió con este ejercicio?
Este ejercicio deja varias ideas clave muy propias de los arreglos unidimensionales:

- **La diferencia entre índice y "nombre" del dato.** El arreglo empieza en la posición 0, pero el sector se numera desde el 1. Ese pequeño desfase (`indice + 1`) es un error común al iniciar en programación, y resolverlo obliga a pensar con más cuidado en qué representa cada variable.
- **Que a veces hay que recorrer el mismo arreglo más de una vez.** No se puede saber cuántos sectores superan el promedio *mientras* se calcula el promedio, porque el promedio aún no existe. Esto enseña que un mismo conjunto de datos puede necesitar varias pasadas según lo que se quiera calcular.
- **La lógica de una racha (secuencia consecutiva).** Es un patrón distinto a simplemente contar o sumar: se necesita una variable que "recuerde" cuántos elementos van seguidos cumpliendo la condición y otra que guarde el máximo alcanzado hasta el momento. Es la base de problemas más complejos de secuencias.
- **Validación de entradas con ciclos `do-while`.** Pedir un dato "hasta que sea válido" es un patrón que se repite constantemente en programas reales, y aquí se practica de forma directa.

---

## Ejercicio 2 – Control de producción semanal
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
Este segundo ejercicio da un paso más allá del arreglo simple y trabaja con dos dimensiones:

- **Cómo pensar en filas y columnas por separado.** Sumar "por máquina" es recorrer una fila completa; sumar "por día" es recorrer una columna completa. Entender que ambos recorridos usan los mismos datos, pero en direcciones distintas, es la parte más importante de trabajar con matrices.
- **Que una matriz no es más que un arreglo de arreglos.** Una vez se entiende que `produccion[fila][columna]` representa una sola celda, el resto es aplicar la misma lógica de máximos, mínimos y conteos que ya se usó en el ejercicio 1, pero con un ciclo anidado.
- **Formatear una salida en forma de tabla.** Mostrar la matriz "organizada" no es trivial: hay que alinear columnas con `printf` y pensar en cómo se vería la información desde el punto de vista de quien la lee, no solo de quien la calculó.
- **Reutilización de patrones de validación y comparación.** Los mismos patrones de "validar que no sea negativo" y "guardar el índice del mayor/menor" del ejercicio 1 se repiten aquí, lo que refuerza que estas estructuras son herramientas generales, no soluciones únicas de un problema puntual.

---

## Aprendizaje general del parcial

Más allá de cada ejercicio por separado, el parcial en conjunto refuerza una idea central de la programación estructurada: **antes de escribir código hay que separar claramente las entradas, el proceso y las salidas**, como bien lo menciona el enunciado. Cuando se identifican esas tres partes desde el principio, resulta mucho más fácil decidir qué ciclos se necesitan, cuántas veces hay que recorrer los datos y qué variables auxiliares (sumas, contadores, banderas de racha, índices de máximo o mínimo) se deben crear antes de empezar a leer datos del usuario.

También queda claro que el compilador solo garantiza que el código sea sintácticamente correcto, pero no que la lógica sea la correcta; por eso es tan importante probar los programas con distintos escenarios, incluyendo casos de empate, valores negativos y datos en el límite (como consumos exactamente iguales al promedio).

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

Ambos archivos compilan y se ejecutan de forma independiente desde consola con:

```bash
javac Ejercicio1A.java && java Ejercicio1A
javac Ejercicio2A.java && java Ejercicio2A
```