package dev.Batismo.CadastroDeNinjas.Missoes;

import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    //Criar Missoes
    @PostMapping("/criar")
    public String novaMissao(){
        return "Criar Missao nova";
    }

    //Ver Missoes
    @GetMapping("")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarmissoes();
    }

    //Ver missao especifica
    @GetMapping("{id}")
    public MissoesModel missoesID(@PathVariable Long id){
        return missoesService.missao(id);
    }

    // Atribuir/Editar missão
    @PutMapping("/edit/ID")
    public String editarId(){
        return "Editart Missão";
    }

    // deletar Missao
    @DeleteMapping("/delete/ID")
    public String deleteMissao(){
        return "Missao Deletada";
    }
}
