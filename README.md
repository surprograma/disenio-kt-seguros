# Compañía de seguros

![Saul](assets/saul.jpg)

## Antes de empezar: algunos consejos

El enunciado tiene **mucha** información, van a necesitar leerlo varias veces. La sugerencia es que lo lean entero una vez (para tener una idea general) y luego vuelvan a consultarlo las veces que hagan falta.

Concentrensé en los requerimientos y, excepto que se traben mucho, respeten el orden sugerido. No es necesario que hagan TDD, pero sí sería interesante que vayan creando las distintas clases y métodos a medida que resuelven cada requerimiento y no antes. 

En otras palabras: trabajen completando cada requerimiento antes de pasar al siguiente, con los tests que aseguran que funciona incluidos. Si al avanzar en los requerimientos les parece necesario refactorizar, adelante, van a tener los tests que garantizan que no rompieron nada. :smirk: 

## Descripción del dominio

Una aseguradora trabaja con **autos**, **camiones** y **taxis** y ofrece varios tipos de seguros.

Para cada vehículo se puede contratar la combinatoria de seguros que se desee (todos o alguno de ellos), siempre y cuando cumpla los criterios que establece la compañía. Por el momento no nos interesa registrar a los clientes, por lo que asociaremos los seguros directamente a cada vehículo.

Cada seguro tiene un **costo** distinto según el tipo de vehículo, y además tiene condiciones que deben cumplirse para poder hacer efectiva su contratación. Se cuenta con los siguientes tipos de seguro:

### Contra terceros

Su costo se calcula de la siguiente manera:
* para camión: un 1,5% del valor del camión (o 2% si el camión tiene más de 10 años),
* para auto: un 1% del valor del auto,
* para taxi: 2% del valor del taxi + $1000 de recargo si el taxi tuvo infracciones de tránsito.

Cualquier vehículo puede contratar este seguro.

### Robo y hurto

Su costo se calcula de la siguiente manera:
* para un taxi o un camión: 5% del valor del vehículo,
* para auto: 3% siempre y cuando el auto haya sido fabricado en 1995 ó después. En caso contrario, se toma un 5% del valor del vehículo.

Los camiones mayores a 10 años no se pueden asegurar contra robo. Lo mismo sucede con los taxis con más de 12 años de antigüedad.

### Todo riesgo

Este seguro únicamente pueden contratarlo los autos, y el costo se calcula como el 7% del valor del auto.

## Requerimientos

Se pide resolver los siguientes requerimientos **sin** utilizar casteos ni chequeos de tipo (o sea, no vale usar `as` ni `is`). Debe respetarse la estructura incluida en este repositorio, pudiendo agregarse otros métodos y atributos que consideren necesarios. Los métodos que están hay que implementarlos, no se pueden borrar.

1. Determinar si un vehículo puede contratar un determinado seguro.
1. Saber cuánto costaría un seguro para un vehículo determinado. Si se consulta para un vehículo que no puede contratar el seguro, arrojar un error.
1. Contratar un seguro: lo cual implica que el vehículo pasa a efectivamente contar con ese seguro. Si se intenta asegurar un vehículo que no cumple los requisitos, arrojar un error.
1. Conocer el costo total que un vehículo abona en concepto de seguros, el cual se determina simplemente sumando los costos de los seguros contratados.

## Créditos

[Enunciado original](https://sites.google.com/site/utndesign/material/guia-de-ejercicios/guia-objetos-patrones/seguros) creado por Fernando Dodino y el equipo de Diseño de Sistemas de Información para UTN - FRBA. Transformado a Markdown, reformateado y reorganizado por Federico Aloi para UNaHur.
