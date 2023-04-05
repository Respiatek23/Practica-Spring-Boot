
## Proyecto ejemplo Spring Boot

Este es un proyecto que será la base para construir un microservicio basado en **Spring Boot**.

La estructura del proyecto es:

 - **/controller:** Paquete donde se almacenarán las clases que representan la API-REST del microservicio
 - **/service:** Declaración de la capa de Servicio que será invocada desde la capa API (Controller)
 - **/service/impl:**  Implementación de la capa de servicios. En estas clases se deberá implementar la capa de negocio de nuestros microservicios
 - **/resources/static:** Contenido del HTML, JS y CSS de nuestro portal Web

## Instrucciones de uso

Limpiar dependencias
> mvn clean

Empaquetar microservicio (Jar file)

> mvn package

Ejecutar microservicio en una terminal

> mvn spring-boot-run


## Operaciones disponibles

El servicio actualmente implementa un servicio que admite como parámetro en la URL (Query-param) el nombre *"name"*. Este campo no es obligatorio.

Mostrar pagina de Gatos 

> http://localhost:8888/HtmlPage5.html



 

## Nuevas funcionalidades

He usado spring Boot para que en vez de llamar a la api desde Javascript pase por el servidor, y le he añadido un filtro despues de recibir la informacion de la api la cual me dice si ha recibido un objeto de manera correcta, tambien he añadido un error handleling para redireccionar cuando a la pagina 
