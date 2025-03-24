package areaverde;

import java.util.ArrayList;
import java.util.List;


public  class AreaVerdeRepository {

    public static List<AreaVerde> areasverdes = new ArrayList<>();


    public void novoRegistro(AreaVerde novo){
        areasverdes.add(novo);
        novo.setId(areasverdes.size()+1); //cria um id aleatorio
        novo.calcularmediadeAvaliacoes();

    }

    public  void lista(){
        for (AreaVerde area : areasverdes) {
            int media = area.calcularmediadeAvaliacoes();
            area.setMediadeAvaliacoes(media);
        }
        System.out.print(areasverdes.toString());

        //por tostring para listagem
    }

    public AreaVerde buscarAreaVerde(int id) {
        for (AreaVerde area : areasverdes) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null;
    }
    }

