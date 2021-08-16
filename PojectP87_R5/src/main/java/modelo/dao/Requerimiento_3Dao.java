package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public Integer requerimiento3(Object [] datos) throws SQLException {
        // Su código
        String sql = "INSERT INTO Lider (Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento) VALUES (?,?,?,?,?,?,?,?,?)";
        Integer rows = null;
        try (Connection conn = JDBCUtilities.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1,datos[0]+"");
            pstmt.setString(2,datos[1]+"");
            pstmt.setString(3,datos[2]+"");
            pstmt.setInt(4,(int)datos[3]);
            pstmt.setString(5,datos[4]+"");
            pstmt.setString(6,datos[5]+"");
            pstmt.setInt(7,(int)datos[6]);
            pstmt.setString(8,datos[7]+"");
            pstmt.setString(9,datos[8]+"");
            
            rows = pstmt.executeUpdate();             
        }
        return rows;
    }
}