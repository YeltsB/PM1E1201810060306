package com.example.examen.transacciones;

public class Transacciones {


    //Tablas
    public static final String tablacontactos = "contactos";
    public static final String tablapaises = "paises";

    //Campos de Contactos
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String telefono = "telefono";
    public static final String nota = "nota";
    public static final String idSpinner = "idSpinner";

    //Campos de Paises
    public static final String idPais = "idPais";
    public static final String paisCatalogo = "paisCatalogo";
    public static final String codigoCatalogo = "codigoCatalogo";


    //tablas CREATE, DROP
    public static final String CreateTableContactos = "CREATE TABLE contactos ( id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,pais TEXT, nombre TEXT, telefono INTEGER,"+
            "nota TEXT,idSpinner INTEGER)";

    //tablas CREATE, DROP
    public static final String CreateTablePaises = "CREATE TABLE paises ( idPais INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,paisCatalogo TEXT, codigoCatalogo INTEGER)";

    public static final String DropTableContactos = "DROP TABLE IF EXISTS contactos";
    public static final String DropTablePaises = "DROP TABLE IF EXISTS paises";

    //Creacion del nombre de la base de datos
    public static final String NameDateBase = "DBExamen";
}
