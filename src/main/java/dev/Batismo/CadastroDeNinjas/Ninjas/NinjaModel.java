package dev.Batismo.CadastroDeNinjas.Ninjas;

import dev.Batismo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// usando o Frame SPRING é uma convençao/ padrao usar o prefixo do objeto nesse caso Model
@Entity // Isso aqui transforma tudo em entidade
@Table(name = "tb_cadastro") // Declara que será uma tabela
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Aqui dizemos que vai ser generado nessa estrategia
    private long id;

    private String nome;

    private int idade;

    private String email;

    @ManyToOne// Essa Anottation diz que esse atributo da classe pode conter somente uma missao
    @JoinColumn(name = "missoes_id") // ForeingKey (PS: N entendi muito bem isso)
    private MissoesModel missoes;

    public NinjaModel(long id, String nome, int idade, String email, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.missoes = missoes;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public NinjaModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
