package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2Vo> rqm2 = new ArrayList<>();
        String sql = "SELECT c.ID_Proyecto, mc.Nombre_Material FROM Compra c INNER JOIN MaterialConstruccion mc ON (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) WHERE c.ID_Proyecto IN (12, 15, 18) ORDER BY c.ID_Proyecto DESC";
        try (Connection conn = JDBCUtilities.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rst = pstmt.executeQuery()) {
            while (rst.next()) {
                Requerimiento_2Vo rqm = new Requerimiento_2Vo(rst.getInt("ID_Proyecto"), rst.getString("Nombre_Material"));
                rqm2.add(rqm);
            }
        }
        return rqm2;
    }
}