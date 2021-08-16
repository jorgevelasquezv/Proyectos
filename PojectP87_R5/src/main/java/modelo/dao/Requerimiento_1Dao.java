package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1Vo> rqm1 = new ArrayList<>();
        String sql = "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Salario FROM Lider l WHERE l.Salario > (SELECT AVG(l.salario) FROM Lider l) ORDER BY l.Salario DESC";
        try (Connection conn = JDBCUtilities.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rst = pstmt.executeQuery()) {
            while (rst.next()) {
                Requerimiento_1Vo rqm = new Requerimiento_1Vo(rst.getInt("ID_Lider"), rst.getString("Nombre"), rst.getString("Primer_Apellido"), rst.getInt("Salario"));
                rqm1.add(rqm);
            }
        }
        return rqm1;
    }
}