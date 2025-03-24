package main;

import areaverde.AreaVerde;
import avaliacao.Avaliacao;

import java.security.Principal;
import java.time.LocalTime;
import java.util.Scanner;
import areaverde.AreaVerdeRepository;
import avaliacao.AvaliacaoRepository;
import localizacao.Localizacao;

import static areaverde.AreaVerdeRepository.areasverdes;


public class main {
    public static <Int> void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        AreaVerdeRepository areaRepo = new AreaVerdeRepository();
        AvaliacaoRepository avaliacaoRepo = new AvaliacaoRepository();
        int opcao;

        do {
            System.out.println("Digite a opção que deseja acessar:\n " +
                    " 1- Listar Áreas Verdes\n" +
                    " 2- Avaliar Área Verde\n" +
                    " 3- Ver detalhe de uma Área Verde\n" +
                    " 4- Cadastrar nova Área Verde\n" +
                    " 0- Sair");
             opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1->  areaRepo.lista();
                case 2 -> avaliacao(entrada, areaRepo, avaliacaoRepo);
                case 3-> detalhamento(entrada, areaRepo);
                case 4-> registroAreaVerde(entrada, areaRepo);
                default-> System.out.println("Fechando o menu...");
            }
        }while(opcao != 0);
}



    private static void avaliacao(Scanner entrada, AreaVerdeRepository areaRepo, AvaliacaoRepository avaliacaoRepo) {
        System.out.println("Digite o ID da Área Verde a ser avaliada:");
        int idAreaVerde = entrada.nextInt();
        entrada.nextLine();

        AreaVerde areaVerde = areaRepo.buscarAreaVerde(idAreaVerde);

        Avaliacao novaAvaliacao = new Avaliacao();
        novaAvaliacao.setAreaVerde(idAreaVerde);


        System.out.println("Digite sua avaliação de 1 a 5 para a quantidade de árvores");
        int qntdArvores = entrada.nextInt();
        entrada.nextLine();
        novaAvaliacao.setNotaQtdArvores(qntdArvores);

        System.out.println("Digite sua avaliação de 1 a 5 para a qualidade do ar");
        int qldAr = entrada.nextInt();
        entrada.nextLine();
        novaAvaliacao.setNotaQuaAr(qldAr);

        System.out.println("Digite sua avaliação de 1 a 5 para a ausência de poluição sonora");
        int ausPolSon = entrada.nextInt();
        entrada.nextLine();
        novaAvaliacao.setNotaAusPoluicaoSom(ausPolSon);

        System.out.println("Digite sua avaliação de 1 a 5 para a coleta de recicláveis");
        int coleta = entrada.nextInt();
        entrada.nextLine();
        novaAvaliacao.setNotaColeta(coleta);

        System.out.println("Digite sua avaliação de 1 a 5 para a facilidade de chegar por transporte público");
        int facChegar = entrada.nextInt();
        entrada.nextLine();
        novaAvaliacao.setNotaFacChegar(facChegar);

        areaVerde.adicionarAvaliacao(novaAvaliacao);
        avaliacaoRepo.adicionarAvaliacao(novaAvaliacao);

        System.out.println("avaliação registrada com sucesso!");
    }

    private static void detalhamento(Scanner entrada, AreaVerdeRepository areaRepo) {
        System.out.println("Digite o ID da Área Verde:");
        int idBusca = entrada.nextInt();
        entrada.nextLine();
        AreaVerde detalheArea = areaRepo.buscarAreaVerde(idBusca);

        if (detalheArea != null) {
            System.out.println(detalheArea.detalhe());
        } else {
            System.out.println("Área Verde não encontrada!");
        }
    }

    private static void registroAreaVerde(Scanner entrada, AreaVerdeRepository areaRepo) {
        System.out.println("Digite os dados para inserir uma nova área");

        AreaVerde novaArea = new AreaVerde(); //criou o objeto areaverde

        System.out.println("Digite o nome da área");

        String nomeArea = entrada.nextLine();
        novaArea.setNome(nomeArea);

        Localizacao localizacao = new Localizacao();
        System.out.println("Digite a as coordenadas da localização");
        System.out.println("Digite a latitude");
        double altitude = entrada.nextInt();
        entrada.nextLine();
        novaArea.setLatitude(altitude);
        localizacao.setLatitude(altitude);

        System.out.println("Digite a longitude");
        double longitude = entrada.nextInt();
        entrada.nextLine();
        novaArea.setLongitude(longitude);
        localizacao.setLongitude(longitude);

        System.out.println("Digite o tipo de vegetação.");
        String tipoVegetacao = entrada.nextLine();
        novaArea.setTipodeVegetacao(tipoVegetacao);

        System.out.println("Digite o horário de funcionamento");
        String horariodeFuncionamento = entrada.nextLine();
        novaArea.setHorariodeFuncionamento(horariodeFuncionamento);

        System.out.println("Digite as atividades disponíveis no local");
        String atividadesDisponiveis = entrada.nextLine();
        novaArea.setAtividadesDisponiveis(atividadesDisponiveis);

        areaRepo.novoRegistro(novaArea);

        System.out.println("área registrada com sucesso!");
    }
}


