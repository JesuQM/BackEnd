# BackEnd

# Configuración de la Base de Datos para el Proyecto
En el archivo application.properties, debes modificar los siguientes parámetros para que coincidan con las credenciales de tu base de datos MySQL:
 
 `spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña`

También, debes cambiar la URL de la base de datos para que coincida con tu configuración. Reemplaza el puerto del localhost y el esquema "tienda" con los nombres que tienes en tu base de datos:

 `spring.datasource.url=jdbc:mysql://localhost:tu_puerto/tu_esquema?useSSL=false&serverTimeZone=UTC`

# Query SQL

 `SELECT h.ID, i.DESCRIPCION AS Indicador, h.FECHA_REGISTRO,  h.VALOR_MEDIDO, i.VALOR_MAXIMO, i.VALOR_MINIMO, i.VALOR_ESPERADO,
  CASE
    WHEN h.VALOR_MEDIDO < i.VALOR_MINIMO THEN 'ROJO' WHEN h.VALOR_MEDIDO >= i.VALOR_MINIMO AND h.VALOR_MEDIDO < i.VALOR_ESPERADO THEN 'AMARILLO' WHEN h.VALOR_MEDIDO >= i.VALOR_ESPERADO AND h.VALOR_MEDIDO <=i.VALOR_MAXIMO THEN 'VERDE' WHEN h.VALOR_MEDIDO > i.VALOR_MAXIMO THEN 'AZUL'
  END AS Estado FROM  historial_equipo h  JOIN equipo i ON h.EQUIPO = i.ID_EQUIPO ORDER BY h.FECHA_REGISTRO DESC;`


  # Query para la creacion de las tablas de la base de datos vacias 
 
 `create table tipo_equipo
(
    TIPO        int          not null
        primary key,
    DESCRIPCION varchar(255) not null
);
create table equipo(
    ID_EQUIPO      int          not null
        primary key,
    DESCRIPCION    varchar(255) null,
    VALOR_ESPERADO int          null,
    VALOR_MAXIMO   int          null,
    VALOR_MINIMO   int          null,
    TIPO_EQUIPO    int          not null,
    constraint FKlhuom8xm8i2frfupob91h2pct
        foreign key (tipo_equipo) references tipo_equipo (tipo)
);
create table historial_equipo
(
    ID             int auto_increment
        primary key,
    EQUIPO         int          null,
    FECHA_REGISTRO datetime(6)  null,
    TIPO_EQUIPO    int          null,
    VALOR_MEDIDO   int          null comment 'Valor medido en dias',
    descripcion    varchar(255) null,
    constraint histori_tipo_equipo_TIPO_fk
        foreign key (TIPO_EQUIPO) references tipo_equipo (tipo),
    constraint historial_ID_EQUIPO_fk
        foreign key (EQUIPO) references equipo (id_equipo)
);
`

