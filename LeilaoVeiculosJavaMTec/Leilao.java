package LeilaoVeiculosJavaMTec;
import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private int id;
    private Veiculo veiculo;
    private List<Participante> participantes;
    private Participante vencedor;
    private boolean encerrado;

    public Leilao(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.participantes = new ArrayList<>();
        this.encerrado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public Participante getVencedor() {
        return vencedor;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void iniciarLeilao() {
        this.encerrado = false;
        // Implemente a lógica para iniciar o leilão
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public void setVencedor(Participante vencedor) {
        this.vencedor = vencedor;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }
    
    public void encerrarLeilao() {
        this.encerrado = true;
        this.vencedor = obterParticipanteComMaiorLance();
        System.out.println("O vencedor do leilão é: " + this.vencedor.getNome());
        // Implemente a lógica para encerrar o leilão
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

   private Participante obterParticipanteComMaiorLance() {
        Participante participanteComMaiorLance = null;
        double maiorLance = 0.0;

        for (Participante participante : participantes) {
            double lance = participante.getUltimoLance();
            if (lance > maiorLance) {
                maiorLance = lance;
                participanteComMaiorLance = participante;
            }
        }
        return participanteComMaiorLance;
    }
}


