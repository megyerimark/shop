package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbDatabase implements Database {
    private String username;
    private String password;
    private String database;

  public MariaDbDatabase(){
    
  }
  public MariaDbDatabase(String username, String password,String database){
    
    
  }
  
    
    public void connect(){
        Connection con = null;
        try {
            tryconnect();
            
        } catch (SQLException e) {
            System.err.println("Adatbázissal nem sikerült kapcsolódni!");
        }
    }
    public void DatabaseImp(){

    }
    public Connection tryconnect(Connection con2) throws SQLException{
        String url = "jdbc:mariadb://localhost:3306/shop" + database;
       Connection con = DriverManager.getConnection(url, "shop", "titok");
       return con;

    }
    public void close(Connection con){
        try {
            tryconnect(con);
            
        } catch (SQLException e) {
            System.err.println("Dataabse lezárása sikertelen");
        }
    }
    public void tryclose() throws SQLException{
        con.close();
    }

   
    
}
