
package LeilaoVeiculosJavaMTec;

// Classe Participante
public class Participante {
    private int id;
    private String nome;
    private String email;
    private String pass;
    private double ultimoLance;

    public Participante(String nome, String email, String pass) {
        this.nome = nome;
        this.email = email;
        this.pass = pass;
        this.ultimoLance = 0.0;
    }
    public Participante() {
    }

    Participante(int participanteId, String nome, String pass) {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    public double getUltimoLance() {
        return ultimoLance;
    }

    public void setUltimoLance(double ultimoLance) {
        this.ultimoLance = ultimoLance;
    }
}

