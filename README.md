Parcial 01 - Grupo A (0192700-B)
Descripción general
Este repositorio contiene la solución de los dos ejercicios del parcial 01, grupo A. El primero trabaja con un arreglo unidimensional para analizar la producción de un centro de distribución, y el segundo trabaja con una matriz bidimensional para analizar las ventas de varias sucursales.
Ambos programas están hechos en Java y se ejecutan desde consola, pidiéndole al usuario los datos uno por uno.

Ejercicio 1A - Paquetes procesados
Entradas
10 valores enteros, uno por cada hora (de la hora 1 a la hora 10), correspondientes a la cantidad de paquetes procesados.
Cada valor se valida: si el usuario ingresa un número negativo, el programa lo rechaza y vuelve a pedirlo.

Salidas
Total de paquetes procesados en las 10 horas.
Promedio de paquetes procesados por hora.
La hora con la menor cantidad de paquetes procesados.
Cuántas horas quedaron por debajo del promedio.
La racha más larga de horas consecutivas por debajo del promedio.
Un listado final con el número de cada hora y la cantidad registrada en ella.

Ejercicio 2A - Ventas de sucursales

Entradas
20 valores enteros (4 sucursales x 5 productos), correspondientes a las unidades vendidas de cada producto en cada sucursal.
Igual que en el ejercicio anterior, se valida que ningún valor sea negativo.

Salidas
Total de unidades vendidas por cada sucursal.
Total vendido de cada producto, sumando las cuatro sucursales.
La sucursal con la menor cantidad total de ventas.
El producto con la mayor cantidad total de unidades vendidas.
Cuántos registros de la matriz superaron las 30 unidades.
La matriz completa, organizada por sucursal y producto.

Qué aprendimos
Haciendo estos dos ejercicios repasamos varias cosas que son la base de casi cualquier programa 
que maneje datos:
Manejo de arreglos y matrices: cómo declarar un arreglo de una dimensión y una matriz de dos dimensiones, y cómo recorrerlos con ciclos for anidados cuando se necesita.

Validación de datos de entrada: usar un ciclo do-while para no dejar avanzar el programa hasta que el usuario ingrese un valor válido, en este caso que no sea negativo.

Recorridos múltiples sobre la misma estructura: para poder calcular el promedio primero hay que tener todos los datos, y solo después se puede volver a recorrer el arreglo para comparar cada valor contra ese promedio. Esto deja claro que a veces no se puede calcular todo en una sola pasada.

Lógica de rachas (secuencias consecutivas): aprendimos a usar un contador que se reinicia cada vez que se rompe la condición, y a ir guardando el valor máximo que alcanza ese contador. Esta misma lógica sirve para muchos otros problemas parecidos, no solo para este ejercicio.

Trabajo con matrices bidimensionales: sumar por filas y por columnas al mismo tiempo, dentro del mismo recorrido, sin necesitar arreglos extra.

Comparaciones para encontrar mínimos y máximos: la técnica de ir guardando un índice "candidato" (el menor o el mayor hasta el momento) y solo cambiarlo cuando aparece un valor que lo supera.

Organización y claridad del código: separar bien las secciones (lectura, cálculos, resultados) para que el programa sea fácil de leer y de revisar, tanto para nosotros como para quien lo califica.

Cómo se puede mejorar
Estas son ideas para llevar el ejercicio un poco más allá de lo que pide la guía:
Separar la lógica en métodos: en vez de tener todo el código dentro de main, se podrían crear métodos como leerDatos(), calcularPromedio(), encontrarMenor(), etc. Esto hace el código más ordenado y más fácil de probar por partes.

Manejo de errores más robusto: actualmente si el usuario escribe una letra en vez de un número, el programa se rompe. Se podría usar try-catch para atrapar esa excepción y pedir el dato de nuevo sin que el programa se caiga.

Guardar los resultados en un archivo: en vez de solo mostrar los resultados en consola, se podrían escribir en un archivo .txt o .csv para tener un historial de las corridas anteriores.
Generar datos de prueba automáticamente: para no tener que escribir 10 o 20 números cada vez que se prueba el programa, se podría agregar una opción que genere valores aleatorios y así probar más rápido.

Interfaz gráfica simple: como práctica extra, estos mismos ejercicios se podrían pasar a una ventana con Swing o JavaFX, donde los datos se ingresen en campos de texto en vez de la consola.
Pruebas unitarias: separar la lógica en métodos también permitiría escribir pruebas con JUnit para verificar que el cálculo del promedio, la racha, y los mínimos/máximos siempre funcionen bien, incluso con casos raros (por ejemplo, todos los valores iguales).

Archivos del proyecto
Ejercicio1A.java - Solución del ejercicio 1 (arreglo unidimensional).
Ejercicio2A.java - Solución del ejercicio 2 (matriz de 4x5).