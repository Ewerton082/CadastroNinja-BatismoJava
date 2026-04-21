package dev.Batismo.CadastroDeNinjas.Missoes;

import dev.Batismo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // cria o construtor vazio
@AllArgsConstructor // cria o contrutor completo
@Data  // Criar geter e setters juntos
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    @Enumerated(EnumType.STRING)
    private DificuldadeEnum dificuldade;

    @OneToMany(mappedBy = "missoes") // Aqui diz que diversos Ninjas podem ter essa missao e tbm n entendi bem como conecta uma na outra
    private List<NinjaModel> ninjas;

}
