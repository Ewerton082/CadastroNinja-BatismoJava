package dev.Batismo.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Esse decorator diz que essa classe abaixo é um controlador de apirest
@RestController
// o Decorator que diz que essa classe é o que vai mapear as rotas
@RequestMapping
public class Controller {

    //o getMapping é oque vai nomear a rota ou seja o endereço
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é Minha primeira Mensagem do projeto";
    }


}
