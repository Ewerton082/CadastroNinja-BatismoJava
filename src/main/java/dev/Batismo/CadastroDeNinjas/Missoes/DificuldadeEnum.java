package dev.Batismo.CadastroDeNinjas.Missoes;

public enum DificuldadeEnum {
    RANK_C("Rank C"), RANK_B("Rank B"), RANK_A("Rank A"), RANK_S("Rank S");

    private String nivel;

    DificuldadeEnum(String nivel) {
        this.nivel = nivel;
    }
}
