package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Corrida;

/**
 *
 * @author Tatiana
 */
public class CorridaDAO {

    private Connection conn;

    public CorridaDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public void inserir(Corrida corrida) {
        try {
            String sql = "insert into corrida(user_id,motorista_id,origem,destino) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, corrida.getUser().getId());
            stmt.setInt(2, corrida.getMotorista().getId());
            stmt.setString(3, corrida.getOrigem());
            stmt.setString(4, corrida.getDestino());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CorridaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
