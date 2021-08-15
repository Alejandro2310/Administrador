# Administrador

Se presenta mi solución de la demo de un aministrador de seguros propuesta como prueba de nivel. La API está programada con Java, usando el framework Spring y construido sobre Maven.

### PERSISTENCIA

He considerado para esta demo, crear una persistencia en memoria, esto evitará problemas de dependencias a la hora de ejecutarlo en otra máquina. Las entidades se guardarán en HashMap que perdurarán lo que dure la aplicación levantada. Una vez parado el servidor local, la información registrada se perderá. Por defecto se crea un Usuario "Alex" con Id = 1. Puede usarse para hacer pruebas o crear otro con el Endpoint "Crear usuario".

### LEVANTAR LA APLICACIÓN

Para levantar la aplicación por comandos habrá que ir al directorio donde esté la aplicación (donde se encuentre el archivo pom.xml) y ejecutar los siguientes comandos:

`mvn clean install`

`mvn spring-boot:run`

### CONSDERACIONES

En esta demo no se tienen en cuanta ningún factor de seguridad. Los Endpoint que contienen "userId" en parámetro no deberían llevarlo, la forma correcta sería obteniendo este valor de la sesión iniciada.

Los valores de parámetros y bodys escritos en este README son ejemplos que se pueden modificar.

Lo ideal hubiera sido hacer tests unitarios pero no se han llevado a cabo por falta de tiempo.

Entiendo que la idea era crear una Entidad a partir de



### ENDPOINTS

##### Crear usuario

Si el usuario no ingresa una contraseña numérica de 4 dígitos dará error. El usuario "Alex" ya creado tiene el id = 1, el siguiente usuario tendrá id = 2 y asi, se le irán asignando id de forma progresiva a los siguientes usuarios.

http://localhost:8080/user/save

body:

 {
 
      "email":"pedro@gamil.com",
      
      "password":"1234",
      
      "nombre":"Pedro"
      
   }
   
##### Mostrar usuarios

Se pueden mostrar los usuarios creados para comprobar que se guardan correctamente, sus respectivos id's y sus contraseñas.

http://localhost:8080/user/show

##### Cambiar contraseña

Si el usuario no ingresa una contraseña numérica de 4 dígitos dará error.

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

 ##### Mostrar los seguros de un usuario

 http://localhost:8080/insurance/show/all?userId=1
 
 ##### Mostrar seguro por Id
 
 http://localhost:8080/insurance/show?insuranceId=1
 
