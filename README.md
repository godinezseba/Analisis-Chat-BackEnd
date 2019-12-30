# Hola

## Uso:
### Autentificacion:
#### 1. Recibir token:
- **Definición:** `POST /autentificar`
- **Cuerpo:**
```JSON
{
	"username": "seba",
	"password": "holamundo"
}
```
- **Respuesta:** 
```JSON
{
    "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzZWJhIiwiZXhwIjoxNTc2NzY4MzIwLCJpYXQiOjE1NzY3MzIzMjB9.amR-byoeVUv65J7J6rsRQl9VH9aGVCRvQMdBbzzZhKQ"
}
```

#### 2. Crear usuario:
- **Definición:** `POST /crear`
- **Cuerpo:**
```JSON
{
	"username": "seba",
	"password": "holamundo"
}
```
- **Respuesta:** booleano

### Mensajes
#### 1. Añadir mensaje:
- **Definición:** `POST /v1/mensaje/mensaje`
- **Header:**
```
Authorization: Bearer <jwt>
```
- **Cuerpo:**
```JSON
{
    "consulta": 1,
    "mensaje":"hola mundo",
}
```
- **Respuesta:** booleano

#### 2. Listar mensajes:
- **Definición:** `GET /v1/mensaje/{consulta}/{id}`\
Donde _id_ representa el id del último mensaje leido en la _consulta_.
- **Header:**
```
Authorization: Bearer <jwt>
```
- **Respuesta:**
```JSON
[
    {
        "id": 1,
        "mensaje": "hola mundo",
        "consulta": 1,
        "emisor": 1
    },
    {
        "id": 2,
        "mensaje": "nose que poner",
        "consulta": 1,
        "emisor": 2
    }
]
```

### Consultas:
#### 1. Listar consultas:
A partir del JWT se listan las consultas asociadas a ese usuario.
- **Definición:** `GET /v1/consulta/consultas`
- **Header:**
```
Authorization: Bearer <jwt>
```
- **Respuesta:**
```JSON
[
    {
        "id": 1,
        "tecnico": 1,
        "cliente": 2
    }
]
```

#### 2. Crear consulta:
- **Definición:** `POST /v1/consulta/consulta`
- **Header:**
```
Authorization: Bearer <jwt>
```
- **Cuerpo:**
```JSON
{
    "tecnico": 1,
    "cliente": 2
}
```
- **Respuesta:** booleano

## Ejecución:
- Compilar: `mvn install`
- Ejecutar: `mvn spring-boot:run`

## Consideraciones:
- Se esta ejecutando en el puerto `8000`

## Requisitos Previos:
- Crear la Base de Datos con sus respectivas tablas, para el caso de esta Demo las tablas estan en el archivo `tablas.sql`.

## Contacto:
Por favor cualquier cosa que no se entienda o cualquier **falta de ortografía** haganmelo saber por correo.

Sebastian Godínez, sebastian.godinez@sansano.usm.cl