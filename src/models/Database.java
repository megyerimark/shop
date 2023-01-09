package models;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    public void connect() throws SQLException;
    public void close(Connection con);
    
}
