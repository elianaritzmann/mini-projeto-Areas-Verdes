package areaverde;

import avaliacao.Avaliacao;
import localizacao.Localizacao;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private double latitude;
    private double longitude;
    private String tipodeVegetacao;
    private String horariodeFuncionamento;
    private String atividadesDisponiveis;
    private int mediadeAvaliacoes;
    private List<Avaliacao> avaliacoesareaverde = new ArrayList<>();

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoesareaverde.add(avaliacao); // Adiciona a avaliação à área específica
    }


    //metodos


    public int calcularmediadeAvaliacoes() {
        if (avaliacoesareaverde.isEmpty()) {
            return 0; // Retorna 0 se não houver avaliações
        }

        int soma = 0;
        for (Avaliacao avaliacao : avaliacoesareaverde) {
            soma += avaliacao.media();
        }
        return soma / avaliacoesareaverde.size();

    }


    @Override
    public String toString() { //toString para listagem
        return "AreaVerde{" +
                "nome='" + nome + '\'' +
                ", tipodeVegetacao='" + tipodeVegetacao + '\'' +
                "media de avaliações="+ calcularmediadeAvaliacoes() +'\''+ //coloquei o metodo calcularmedia pra atualizar sempre que adicionar uma nova avaliação e mostrar
                ", id=" + id +
                '}';
    }

    public String detalhe() { //String para detalhe
        return "AreaVerde{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", altitude=" + latitude +
                ", longitude="+ longitude +
                ", tipodeVegetacao='" + tipodeVegetacao + '\'' +
                ", horariodeFuncionamento=" + horariodeFuncionamento +
                ", atividadesDisponiveis='" + atividadesDisponiveis + '\'' +
                "  media de avaliações="+ calcularmediadeAvaliacoes() +'\''+
                '}';
    }


    //getters e setters


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double altitude) {
        this.latitude = altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome(String nomeArea) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTipodeVegetacao() {
        return tipodeVegetacao;
    }

    public void setTipodeVegetacao(String tipodeVegetacao) {
        this.tipodeVegetacao = tipodeVegetacao;
    }

    public String getHorariodeFuncionamento() {
        return horariodeFuncionamento;
    }

    public void setHorariodeFuncionamento(String horariodeFuncionamento) {
        this.horariodeFuncionamento = horariodeFuncionamento;
    }

    public String getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }

    public void setAtividadesDisponiveis(String atividadesDisponiveis) {
        this.atividadesDisponiveis = atividadesDisponiveis;
    }


    public void setMediadeAvaliacoes(int mediadeAvaliacoes) {
        this.mediadeAvaliacoes = mediadeAvaliacoes;


    }


}

