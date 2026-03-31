package dev.Batismo.CadastroDeNinjas.Ninjas;

import dev.Batismo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

// usando o Frame SPRING é uma convençao/ padrao usar o prefixo do objeto nesse caso Model
@Entity // Isso aqui transforma tudo em entidade
@Table(name = "tb_cadastro") // Declara que será uma tabela
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
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

}
