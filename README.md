# BackEnd

# Configuración de la Base de Datos para el Proyecto
En el archivo application.properties, debes modificar los siguientes parámetros para que coincidan con las credenciales de tu base de datos MySQL:
 
 `spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña`

También, debes cambiar la URL de la base de datos para que coincida con tu configuración. Reemplaza localhost y el esquema tienda con los nombres que tienes en tu base de datos:

 `spring.datasource.url=jdbc:mysql://tu_host:tu_puerto/tu_esquema?useSSL=false&serverTimeZone=UTC`

# Query SQL
 `SELECT
  h.ID,
  i.DESCRIPCION AS Indicador,
  h.FECHA_REGISTRO,
  h.VALOR_MEDIDO,
  i.VALOR_MAXIMO,
  i.VALOR_MINIMO,
  i.VALOR_ESPERADO,
  CASE
    WHEN h.VALOR_MEDIDO < i.VALOR_MINIMO THEN 'ROJO'
    WHEN h.VALOR_MEDIDO >= i.VALOR_MINIMO AND h.VALOR_MEDIDO < i.VALOR_ESPERADO THEN 'AMARILLO'
    WHEN h.VALOR_MEDIDO >= i.VALOR_ESPERADO AND h.VALOR_MEDIDO <= i.VALOR_MAXIMO THEN 'VERDE'
    WHEN h.VALOR_MEDIDO > i.VALOR_MAXIMO THEN 'AZUL'
  END AS Estado
FROM
  historial_equipo h
  JOIN equipo i ON h.EQUIPO = i.ID_EQUIPO
ORDER BY
  h.FECHA_REGISTRO DESC;`

