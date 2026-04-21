package dev.Batismo.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class MissoesController {

    //Criar Missoes
    @PostMapping("/criarMissao")
    public String novaMissao(){
        return "Criar Missao nova";
    }

    //Ver Missoes
    @GetMapping("/missoes")
    public String listarMissoes(){
        return "Retornando todas Missoes";
    }

    //Ver missao especifica
    @GetMapping("/missoesID")
    public String missoesID(){
        return "Retornando a Missão";
    }

    // Atribuir/Editar missão
    @PutMapping("/editarMissaoID")
    public String editarId(){
        return "Editart Missão";
    }

    // deletar Missao
    @DeleteMapping("/deletarMissaoID")
    public String deleteMissao(){
        return "Missao Deletada";
    }
}
