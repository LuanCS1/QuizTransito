package com.example.quiztransito;

public enum eNumPlacas {

    ACLIVE_ACENTUADO(R.drawable.aclive_acentuado, "B", new String[]{"Advertência Lombada", "Aclive Acentuado", "Animais", "Área Escolar"}),
    ADVERTENCIA_LOMBADA(R.drawable.advertencia_lombada, "D", new String[]{"Áreas de Recreacao Parque de Diversões", "Animais", "Parada Obrigatoria", "Advertência de Lombada"}),
    ALFANDEGA(R.drawable.alfandega, "A", new String[]{"Alfandega", "Proibido Ultrapassar", "Vire a Esquerda", "Cruzamento de Vias"}),
    ANIMAIS(R.drawable.animais, "A", new String[]{"Animais", "Advertência de Lombada", "Áreas de Recreacao Parque de Diversões", "Área Escolar"}),
    ANIMAIS_SELVAGENS(R.drawable.animais_selvagens, "B", new String[]{"Animais na Pista", "Animais Selvagens", "Animais Saltitantes", "Cruzamento de Vias"}),
    AREAS_DE_RECREACAO_PARQUE_DE_DIVERSOES(R.drawable.areas_de_recreacao_parque_de_diversoes, "C", new String[]{"Conserve-se a Direita", "Advertência Lombada", "Áreas de Recreacao Parque de Diversões", "Proibido Acionar Buzina ou Sinal Sonoro"}),
    AREA_ESCOLAR(R.drawable.area_escolar, "C", new String[]{"Proibido Acionar Buzina ou Sinal Sonoro", "Animais", "Área Escolar", "Animais"}),
    COMPRIMENTO_MAXIMO(R.drawable.comprimento_maximo, "B", new String[]{"Cumprimento Mínimo", "Cumprimento Máximo", "Vire a Esquerda", "Cruzamento de Vias"}),
    CONSERVE_SE_A_DIREITA(R.drawable.conserve_se_a_direita, "B", new String[]{"Advertência de Lombada", "Conserve-se a Direita", "Proibido Acionar Buzina ou Sinal Sonoro", "Animais"}),
    USO_OBRIGATORIO_DE_CORRENTE(R.drawable.uso_obrigatorio_de_corrente, "D", new String[]{"Permitido Usar Pneu", "Proibido o Transito de Pedestres", "Sentido Circular na Rota", "Uso Obrigatorio de Corrente"}),
    VELOCIDADE_MAXIMA_PERMITIDO(R.drawable.velocidade_maxima_permitido, "A", new String[]{"Velocidade Máxima Permitido", "Proibido o Transito de Pedestres", "Proibido Ultrapassar", "Cruzamento de Vias"}),
    VENTO_LATERAL(R.drawable.vento_lateral, "B", new String[]{"Velocidade Máxima Permitido", "Vento Lateral", "Aclive Acentuado", "Proibido o Transito de Pedestres"}),
    VIRE_A_DIREITA(R.drawable.vire_a_direita, "C", new String[]{"Proibido Virar a Esquerda", "Velocidade Máxima Permitido", "Vire a Direita", "Proibido o Transito de Pedestres"}),
    VIRE_A_ESQUERDA(R.drawable.vire_a_esquerda, "C", new String[]{"Proibido Virar a Direita", "Proibido Ultrapassar", "Vire a Esquerda", "Cruzamento de Vias"});

    private int CodImgPais;
    private String respostaCorreta;
    private String alternativas[];

    eNumPlacas(int CodImgPais, String respostaCorreta, String alternativas[]) {
        this.CodImgPais = CodImgPais;
        this.respostaCorreta = respostaCorreta;
        this.alternativas = alternativas.clone();
    }

    public int getCodImgPais() {
        return CodImgPais;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }
}