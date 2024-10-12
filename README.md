# BackEnd

#Configuración de la Base de Datos para el Proyecto
En el archivo application.properties, debes modificar los siguientes parámetros para que coincidan con las credenciales de tu base de datos MySQL:
 `spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña`

También, debes cambiar la URL de la base de datos para que coincida con tu configuración. Reemplaza localhost y el esquema tienda con los nombres que tienes en tu base de datos:
 `spring.datasource.url=jdbc:mysql://tu_host:3306/tu_esquema?useSSL=false&serverTimeZone=UTC`
