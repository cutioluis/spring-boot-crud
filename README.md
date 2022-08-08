# 🌳 Simple Crud build with Spring Boot


### Post
Crear nuevo auto 
**values body**
- id: Long
- modelo: String
- anno: int
- capacidad int
- precio: double

`http://localhost:8080/api/v1/autos/{id}`


### **GET**
Buscar por Id
`http://localhost:8080/api/v1/autos/{id}`

### **PUT**
Modificar precio de autos
`http://localhost:8080/api/v1/autos/{id}/nuevoprecio/{price}`

### **DELETE**
Eliminar por Id
`http://localhost:8080/api/v1/autos/{id}`