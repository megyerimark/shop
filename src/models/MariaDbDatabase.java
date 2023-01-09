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
       this.username = username;
       this.password = password;
       this.database = database;
  }
    public Connection connect(){
        Connection con = null;
        try {
            con = tryConnect(con);
        } catch (SQLException e) {
            System.err.println("Hiba , nem látod?");
            
        }
        return con;
    }

    public void DatabaseImp(){
        

    }

    public Connection tryConnect(Connection con2) throws SQLException{
        String url = "jdbc:mariadb://localhost:3306/shop" + database;
       Connection con = DriverManager.getConnection(url, "shop", "titok");
       return con;

    }
    public void close(Connection con){
        try {
            tryClose(con);
            
        } catch (SQLException e) {
            System.err.println("Dataabse lezárása sikertelen");
        }
    }
    public void tryClose(Connection con) throws SQLException{
        con.close();
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDatabase() {
        return database;
    }
    public void setDatabase(String database) {
        this.database = database;
    }
    

   
    
}
