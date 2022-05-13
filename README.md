Requerimientos: 

Java 11
Maven

Descripción: 

El sistema permite creer nuevas cargas el cual consta de: 
Peso: medido en kilogramos no puede sobrepasar los 200kg
Tipo de carga: el tipo de la carga (Fragil = 1, Refrigerada = 2, viva = 3, paquete = 4)
Destino: Lugar de destino al que se llevará carga
Fecha: Fecha en la que se crea el registro 
Estado: Indica el estado en que se crea la carga(True, Falsa)

Para crear una nueva carga, en formato JSON debe enviarse los datos (peso(float), tipo de carga(byte), Destino(String))
si estos complen con las condiciones para su creación, se agrega automaticamente la fache y el estado. 

Es posible consultar toda la información de todas y cada una de las cargas que han sido creadas correctamente en la base datos

Es posible actualizar el peso, el tipo de carga o el destino, para esto, debe enviarse en formato JSON los datos
(id(int), peso(float), tipo de carga(byte), Destino(String))

por último, se puede consultar las cargas que han sido creadas en un intervalo de tiempo (dos fechas diferentes
en formato dd-MM-YYYY), para esto, debe enviarse las dos fechas(String)

Instalación: 
Debe clonar el repositorio, y abrirlo dentro de algún IDE, para probar los métodos, puede hacer uso de postman con las 
url: 
Crear Nueva Carga: 
http://localhost:8080/tacmoprueba/crear
Ver las cargas creadas:
http://localhost:8080/tacmoprueba/ver
Actualizar los datos de una carga: 
http://localhost:8080/tacmoprueba/actualizar
Conusltar por fechas: 
http://localhost:8080/tacmoprueba/buscar/fecha1/fecha2
donde para poder probar este servicio, deberá acceder a la base de datos H2Database y actualizar algunas fechas
update carga set fecha =PARSEDATETIME('26 Jul 2016, 05:15:58 AM','dd MMM yyyy, hh:mm:ss a','en')  where id = 5


