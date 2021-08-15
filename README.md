# Administrador
Prueba de nivel

##### Crear usuario

http://localhost:8080/user/save

body:

 {
 
      "email":"alex@gamil.com",
      
      "password":1234,
      
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
 
