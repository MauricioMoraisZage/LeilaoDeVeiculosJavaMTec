package LeilaoVeiculosJavaMTec;
import java.sql.*;

//Class ParticipanteFunções
public class ParticipanteFunções {
    private Connection connection;

    public ParticipanteFunções() {
        // Configurar a conexão com o banco de dados (exemplo)
        String url = "jdbc:mysql://localhost:3306/leilao_db";
        String username = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarParticipante(Participante participante) {
        String query = "INSERT INTO participante (nome, email, pass) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, participante.getNome());
            statement.setString(2, participante.getEmail());
            statement.setString(3, participante.getPass());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Participante obterParticipantePorId(int participanteId) {
        String query = "SELECT * FROM Participante WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, participanteId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String pass = resultSet.getString("pass");
                    Participante participante = new Participante(nome, email, pass);
                    participante.setId(id);
                    return participante;
                }
            }
        } catch (SQLException e) {
       } return null;
    }
    
    /*public Participante obterParticipantePorId(int id) {
        try {
            String sql = "SELECT * FROM participante WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int participanteId = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String pass = resultSet.getString("pass");
                return new Participante(participanteId, nome, pass); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }*/

}