package localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {

     public static List<Localizacao> localizacoes = new ArrayList<>();

     public void adicionarLocal(Localizacao local){
         localizacoes.add(local);
         local.setId(localizacoes.size()+1);
     }

     public void listar(){
         System.out.print(localizacoes.toString());
     }

     public Localizacao BuscarItem(int id) {

         for (Localizacao localizacao: localizacoes ){
             if (id == localizacao.getId()){
                 return localizacao;

             }
         }
         return null;
     }


}


