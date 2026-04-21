package dev.Batismo.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

// Esse decorator diz que essa classe abaixo é um controlador de apirest
@RestController
// o Decorator que diz que essa classe é o que vai mapear as rotas
@RequestMapping(path = "ninja")
public class NinjaController { // mais uma Vez o Padrao SPRING sufixo Controller

    //o getMapping é oque vai nomear a rota ou seja o endereço
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é Minha primeira Mensagem do projeto";
    }

    // Adicionar Ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    //Procurar Ninja por ID
    @GetMapping("/ID")
    public String Ninja(){
        return "Ninja Escolhido";
    }

    // Mostrar Ninjas
    @GetMapping("")
    public String todsNinjas(){
        return "Todos Ninjas";
    }

    //Editar dados dos ninjas
    @PutMapping("/edit/ID")
    public String atualizarDados(){
        return "Editando Ninja selecionado";
    }

    //Deletar Ninja
    @DeleteMapping("/delete/ID")
    public String deletarNinja(){
        return "Apagando Ninja da existencia";
    }

}
