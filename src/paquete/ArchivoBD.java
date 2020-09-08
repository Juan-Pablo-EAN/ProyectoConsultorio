package paquete;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class ArchivoBD {
    public static void main(String[] args)throws SQLException{
        String nuevoArchivo = "jdbc:h2:./paciente";
        
        ConnectionSource conexion = new JdbcConnectionSource(nuevoArchivo);
        
        TableUtils.createTableIfNotExists(conexion, Paciente.class);
    }
}
