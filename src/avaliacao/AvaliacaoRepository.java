package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {

    public static List<Avaliacao> avaliacoes = new ArrayList<>();;

    public void adicionarAvaliacao(Avaliacao a){
        avaliacoes.add(a);
        a.setId(avaliacoes.size()+1);


    }

    public void listarAvaliacao(){
        System.out.print(avaliacoes.toString());

    }

    public Avaliacao buscarAvaliacao(int id){
        //buscar area especifica
        for (Avaliacao avaliacao: avaliacoes ){
            if (id == avaliacao.getId()){
                return avaliacao;

            }
        }
        return null;
    }

    }





