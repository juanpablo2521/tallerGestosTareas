##  Aplicación de los pilares de la Programación Orientada a Objetos (POO)

### 1. Encapsulamiento
El encapsulamiento se aplica en las clases **`Task`** y **`Student`** mediante el uso de **atributos privados (`private`)**.  
De esa forma, se protege el acceso directo a los datos internos de cada objeto.  
Para interactuar con estos atributos, se utilizan **métodos públicos `get` y `set`**, que controlan la lectura y modificación de 
la información.

### 2. Astraccion
La abstracción se implementa principalmente en las clases de servicio (TaskService, StudentService y sus implementaciones). 
Estas clases ocultan los detalles internos de la lógica de negocio (como la gestión de listas en memoria) y exponen 
solo los métodos necesarios para los controladores.

### 3. Herencia
En el ejercico no se aplica herencia de forma explícita, 
pero podría implementarse fácilmente si se deseara extender el comportamiento de las clases.

### 4. Polimorfismo
El polimorfismo podría aplicarse si se agregaran diferentes tipos de tareas o estudiantes con comportamientos distintos.
