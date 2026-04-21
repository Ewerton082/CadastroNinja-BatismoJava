package dev.Batismo.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "missoes")
public class MissoesController {

    //Criar Missoes
    @PostMapping("/criar")
    public String novaMissao(){
        return "Criar Missao nova";
    }

    //Ver Missoes
    @GetMapping("")
    public String listarMissoes(){
        return "Retornando todas Missoes";
    }

    //Ver missao especifica
    @GetMapping("/ID")
    public String missoesID(){
        return "Retornando a Missão";
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
