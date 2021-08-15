# Administrador

### PERSISTENCIA

He considerado para esta demo, crear una persistencia en memoria, esto evitará problemas de dependencias a la hora de ejecutarlo en otra máquina. Las entidades se guardarán en HashMap que perdurarán lo que dure la aplicación levantada. Una vez parado el servidor local, la información registrada se perderá. Por defecto se crea un Usuario "Alex" con Id = 1. Puede usarse para hacer pruebas o crear otro con el Endpoint "Crear usuario".

### LEVANTAR LA APLICACIÓN

Para levantar la aplicación por comandos habrá que ir al directorio donde esté la aplicación (donde se encuentre el archivo pom.xml) y ejecutar los siguientes comandos:

`mvn clean install`

`mvn spring-boot:run`

### CONSDERACIONES

En esta demo no se tienen en cuanta ningún factor de seguridad. Los Endpoint que contienen "userId" en parámetro no deberían llevarlo, la forma correcta sería obteniendo este valor de la sesión iniciada.

Los valores de parámetros y bodys escritos en este README son ejemplos.



### ENDPOINTS

##### Crear usuario

http://localhost:8080/user/save

body:

 {
 
      "email":"alex@gamil.com",
      
      "password":"1234",
      
      "nombre":"Alex"
      
   }

##### Cambiar contraseña

http://localhost:8080/user/changepass?userId=1&newPassword=1234

##### Dar de baja ususario

http://localhost:8080/user/delete?userId=1

##### Añadir un seguro

http://localhost:8080/insurance/add

body:

 {
 
      "nombreAseguradora":"Mutua",
      
      "categoriaSeguro":"MOTO",
      
      "cantidadSeguro":89.2,
      
      "userId": 1,
      
      "periodicidad":"anual",
      
      "idAseguradora":2,
      
      "telefonoAseguradora":916836496,
      
      "detalle":"Seat",
      
      "finCobertura":"2021-12-28"
      
   }
   
 ##### Borrar un seguro

 http://localhost:8080/insurance/delete?insuranceId=1

 ##### Mostrar los segurros de un usuario

 http://localhost:8080/insurance/show/all?userId=1
 
 ##### Mostrar seguro por Id
 
 http://localhost:8080/insurance/show?insuranceId=1
 
