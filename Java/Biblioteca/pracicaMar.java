import java.sql.*;
public class llibre {
    int id;
    String titol;
    String autor;
    String datapublicacio;  
        public llibre(int id, String titol, String autor, String datapublicacio)
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.datapublicacio = datapublicacio; 
}
public int getId(){
    return id;
}
public String getTitol(){
    return titol;
}
public String getAutor(){
    return autor;
}
public String getDatapublicacio(){
    return datapublicacio;
}
class  DatabaseManager{
    Connection connection;
}
public DatabaseManager(String url, String nomusuari, contrasenya) throws
SQLException{ // Exception proporciona informacio adicional relacionada amb les nomalies que produeixe les base de dades
    //Metodo que nos permite establecer una conexion con la base de datos
    connection = DriverManager.getConnection(url, nomusuari,contrasenya)
}
public void addllibre(Llibre llibre) throws SQLException{
   // interacción con una base de datos
    String query = "INSERT INTO llibres(titol, autor, datapublicacio) VALUES(?,?,?)"; // no he encontrado el significado exacto de porque se pone el "?,?,?" per se que es necesario para los valores
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, llibre.getTitol());
    statement.setString(2, llibre.getAutor());
    statement.setString(3, llibre.datapublicacio());
    statement.executeUpdate();
    }
    public void updatellibre(Llibre llibre) throws SQLException{
        String query = "UPDATE llibres SET llibre titol=?, autor=?, datapublicacio=?) VALUES(?,?,?)";
        PreparedStatement statement = connection.PreparedStatement(query);
        statement.setString(1, llibre.getTitol());
        statement.setString(2,llibre.getAutor());
        statement.setString(3, llibre.getDatapublicacio());
        statement.executeUpdate();
    }
       public void updatellibre(Llibre llibre) throws SQLException{
        String query = "UPDATE INTO llibres(titol, autor, datapublicacio) VALUES(?,?,?)";
        PreparedStatement statement = connection.PreparedStatement(query);
        statement.setString(1, llibre.getTitol());
        statement.setString(2,llibre.getAutor());
        statement.setString(3, llibre.getDatapublicacio());
        statement.executeUpdate();
    }