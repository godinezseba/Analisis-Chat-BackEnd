# Te dije que no lo hicieras >:c

## Uso:
En este proyecto se definen 2 verbos:
### 1. Añadir mensaje:
- **Definición:** `POST /v1/mensaje/mensaje`
- **Cuerpo:**
```JSON
{
    "mensaje":"hola mundo",
    "user": 123
}
```
- **Respuesta:** booleano
### 2. Listar mensajes:
- **Definición:** `GET /v1/mensaje/{id}?user=<number>`\
Donde _user_ representa el usuario al que se le quiere extraer mensajes y _id_ representa el id del último mensaje leido.
- **Respuesta:**
```JSON
[
    {
        "id": 1,
        "mensaje": "hola mundo",
        "user": 123
    },
    {
        "id": 4,
        "mensaje": "report",
        "user": 123
    },
    {
        "id": 5,
        "mensaje": ">:c",
        "user": 123
    }
]
```

## Ejecución:
- Compilar: `mvn install`
- Ejecutar: `mvn spring-boot:run`

## Consideraciones:
- Se esta ejecutando en el puerto `8000`.

## Requisitos Previos:
- Esta hecho para conectarce a MySQL.
- Crear la Base de Datos "chat".
- Las tablas se hacen de forma automatica.
- **OJO CON EL USUARIO Y LA PASSWORD** para modificarlo ir al archivo [application.properties](https://github.com/godinezseba/Analisis-Chat-BackEnd/blob/no-me-abras/src/main/resources/application.properties).

## Contacto:
Por favor cualquier cosa que no se entienda o cualquier **falta de ortografía** haganmelo saber por correo.

Sebastian Godínez, sebastian.godinez@sansano.usm.cl