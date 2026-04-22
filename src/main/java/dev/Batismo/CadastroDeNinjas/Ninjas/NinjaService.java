package dev.Batismo.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    @Autowired // essa Annotation em resumo cria um construtor
    private NinjaRepository ninjaRepository;

    // Get todos ninjas
    public List<NinjaModel> todosNinjas(){
        return ninjaRepository.findAll();
    }

    // Get Ninja por Id
    public  NinjaModel ninja(Long id){ // Passar o parametro id aqui para usar no controller
        return ninjaRepository.findById(id).orElse(null); // lembrando sempre do orelse(nullç) pq senão nao funciona
    }


}
