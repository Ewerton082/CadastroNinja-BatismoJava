package dev.Batismo.CadastroDeNinjas.Missoes;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;

    public List<MissoesModel> listarmissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel missao(Long id){
        return missoesRepository.findById(id).orElse(null); // Recebi ajuda do Chat gpt na parte do or else que até faz sentido
    }

}
