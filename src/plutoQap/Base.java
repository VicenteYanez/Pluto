/*
 * Clase Base
 * 
 * Versión 1.1
 * 
 * 8 de Marzo de 2013
 * 
 * Copyright Vicente Yáñez Cuadra
*/

package plutoQap;

public class Base {
    /*
     * Clase que administra las llamadas a bases de datos MySQL
     * AUN NO OPERATIVA!
     */
    private java.sql.Connection conexion;
    private java.sql.Statement sentenciaSQL;
    private java.sql.ResultSet cdr; //conjunto de resultados
    
    public Base() throws ClassNotFoundException, java.sql.SQLException, 
            InstantiationException, IllegalAccessException
    {
        //cargar controlador JDBC
        String controlador ="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar(); //conectar con la fuente de datos
        crearSentencia();
        cerrarConexion();
    }
    
    private void conectar() throws java.sql.SQLException
    {
        String URL_db = "jdbc:mysql://localhost:3306/pluto";
        String usuario = "root";
        String contraseña = "sacrilegio212";
        
        //conectar con la DB
        conexion = java.sql.DriverManager.getConnection(URL_db, usuario, 
                contraseña);
    }
    
    public void crearSentencia() throws java.sql.SQLException
    {
        //crear sentencia para enviar consulta a la base de datos
        sentenciaSQL = conexion.createStatement();
        
    }
    
    public void cerrarConexion() throws java.sql.SQLException
    {
        if (cdr != null){ cdr.close();}
        if (sentenciaSQL != null) {sentenciaSQL.close();}
        if (conexion !=null) {conexion.close();}
    }
    
    public java.sql.ResultSet buscarFilasEnQap(String subcad, int tipoBusqueda) 
            throws java.sql.SQLException
    {
        String[] cadena = {"'" + subcad + "%'", "'%" + subcad + "%'"};
        cdr = sentenciaSQL.executeQuery("SELECT * FROM " + "qap" +
                " WHERE muestra LIKE" + cadena[tipoBusqueda-1]);
        return cdr;
    }
}
