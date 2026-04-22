package dev.Batismo.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Esse decorator diz que essa classe abaixo é um controlador de apirest
@RestController
// o Decorator que diz que essa classe é o que vai mapear as rotas
@RequestMapping(path = "ninja")
public class NinjaController { // mais uma Vez o Padrao SPRING sufixo Controller

    @Autowired
    private NinjaService ninjaService;

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
    @GetMapping("")
    public List<NinjaModel> todosninjas(){
        return ninjaService.todosNinjas();
    }

    // Mostrar Ninjas
    @GetMapping("{id}")
    public NinjaModel ninja(@PathVariable Long id){ // aqui usa o Path Variable para pegar um dado que ta na url entre chaves {}
        return ninjaService.ninja(id); // Retornando o Ninja selecionado
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
