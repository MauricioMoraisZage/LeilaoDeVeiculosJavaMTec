package LeilaoVeiculosJavaMTec;

import java.sql.*;

public class LeilaoFuncões {
    private Connection connection;
    private ParticipanteFunções participanteDAO;
    
    public LeilaoFuncões() {
        // Configure a conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/leilao_db";
        String username = "root";
        String password = "";
        
        try {
            connection = DriverManager.getConnection(url, username, password);
            participanteDAO = new ParticipanteFunções();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        try {
            String sql = "INSERT INTO Veiculo (marca, modelo) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, veiculo.getMarca());
            statement.setString(2, veiculo.getModelo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarParticipante(Participante participante) {
        try {
            String sql = "INSERT INTO Participante (nome, email, pass) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, participante.getNome());
            statement.setString(2, participante.getEmail());
            statement.setString(3, participante.getPass());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Participante fazerLogin(String email, String pass) {
        try {
            String sql = "SELECT nome, email, pass FROM Participante WHERE email=? AND pass=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(1, pass);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Participante participante = new Participante();
                participante.setNome(resultSet.getString("nome"));
                participante.setEmail(resultSet.getString("email"));
                participante.setPass(resultSet.getString("pass"));
                return participante;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void iniciarLeilao(Leilao leilao) {
        try {
            String sql = "INSERT INTO Leilao (veiculo_id, encerrado) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, leilao.getVeiculo().getId());
            statement.setBoolean(2, false);
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                leilao.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void encerrarLeilao(Leilao leilao) {
        try {
            String sql = "UPDATE leilao SET encerrado=?, vencedor_id=? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, true);
            statement.setInt(2, leilao.getVencedor().getId());
            statement.setInt(3, leilao.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Participante obterParticipanteComMaiorLance(Leilao leilao) {
        try {
            String sql = "SELECT participante_id FROM lance WHERE leilao_id = ? ORDER BY valor DESC LIMIT 1";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, leilao.getId());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int participanteId = resultSet.getInt("participante_id");
                return participanteDAO.obterParticipantePorId(participanteId); // Usar ParticipanteFunções para obter o participante
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public void fazerLance(Leilao leilao, Participante participante, double valorLance) throws SQLException {
        try {
            String query = "INSERT INTO lance (leilao_id, participante_id, valor) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, leilao.getId());
                statement.setInt(2, participante.getId());
                statement.setDouble(3, valorLance);
                statement.executeUpdate();
            } catch (SQLException e) {
            }          
        } catch (Exception e) {
        }
    }
    
    public Leilao obterLeilaoPorId(int leilaoId) {
        String query = "SELECT * FROM Leilao WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, leilaoId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    int veiculoId = resultSet.getInt("veiculo_id");
                    boolean encerrado = resultSet.getBoolean("encerrado");
                    int vencedorId = resultSet.getInt("vencedor_id");

                    Veiculo veiculo = obterVeiculoPorId(veiculoId);

                    Leilao leilao = new Leilao(veiculo);
                    leilao.setId(id);
                    leilao.setEncerrado(encerrado);
                    leilao.setVencedor(obterParticipantePorId(vencedorId));

                    return leilao;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
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
            e.printStackTrace();
        }

        return null;
    }

    public Veiculo obterVeiculoPorId(int veiculoId) {
        String query = "SELECT * FROM Veiculo WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, veiculoId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String marca = resultSet.getString("marca");
                    String modelo = resultSet.getString("modelo");

                    Veiculo veiculo = new Veiculo(marca, modelo);
                    veiculo.setId(id);

                    return veiculo;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
}









