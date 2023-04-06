package com.example.quiztransito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

public class partidas implements Serializable {

    private String nomeJogador;
    private int pontuacao;

    public partidas(String nomeJogador, int pontuacao) {
        this.nomeJogador = nomeJogador;
        this.pontuacao = pontuacao;
    }

    ArrayList<Integer> idPlacas;
    EnumSet[] paises;

    public ArrayList<Integer> gerarOrdemPerguntas() {
        Random random = new Random();
        this.idPlacas = new ArrayList<>();
        for(int i = 0; i < 14; i++) {
            int num = 1 + random.nextInt(14);
            if(this.idPlacas.contains(num)) {
                i--;
            } else {
                this.idPlacas.add(num);
            }
        }
        return this.idPlacas;
    }

    public eNumPlacas retornarPlacas(int idPlacas) {
        switch(idPlacas){
            case 1:
                return eNumPlacas.ACLIVE_ACENTUADO;
            case 2:
                return eNumPlacas.ADVERTENCIA_LOMBADA;
            case 4:
                return eNumPlacas.AREA_ESCOLAR;
            case 5:
                return eNumPlacas.AREAS_DE_RECREACAO_PARQUE_DE_DIVERSOES;
            case 6:
                return eNumPlacas.CONSERVE_SE_A_DIREITA;
            case 7:
                return eNumPlacas.USO_OBRIGATORIO_DE_CORRENTE;
            case 8:
                return eNumPlacas.VELOCIDADE_MAXIMA_PERMITIDO;
            case 9:
                return eNumPlacas.VENTO_LATERAL;
            case 10:
                return eNumPlacas.VIRE_A_DIREITA;
            case 11:
                return eNumPlacas.VIRE_A_ESQUERDA;
            case 12:
                return eNumPlacas.ALFANDEGA;
            case 13:
                return eNumPlacas.ANIMAIS_SELVAGENS;
            case 14:
                return eNumPlacas.COMPRIMENTO_MAXIMO;
        }
        return null;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}