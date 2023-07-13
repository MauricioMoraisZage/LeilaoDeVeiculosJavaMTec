
package LeilaoVeiculosJavaMTec;

import java.sql.*;

//Class VeiculoFuncoes
public class VeiculoFuncoes {
    private Connection connection;

    public VeiculoFuncoes() {
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

    public void cadastrarVeiculo(Veiculo veiculo) {
        String query = "INSERT INTO Veiculo (marca, modelo) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, veiculo.getMarca());
            statement.setString(2, veiculo.getModelo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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






