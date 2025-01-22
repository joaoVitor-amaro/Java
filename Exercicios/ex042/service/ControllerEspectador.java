package Exercicios.ex042.service;

import java.util.ArrayList;
import java.util.Scanner;

import Exercicios.ex042.model.*;

public class ControllerEspectador {
    private static final ControllerVideo controllerVideo = ControllerVideo.getInstance();
    private static final Scanner scanner = new Scanner(System.in);

    public void listarVideosDisponiveis() {
        ArrayList<Video> videos = controllerVideo.videoAll();
        for(int i = 0; i < videos.size(); i++) {
            System.out.printf("[%d]", i+1);
            System.out.println(" - " + videos.get(i).getTitulo());
        }
    }

    public void acaoVideo() {
        System.out.println("[1] - Play");
        System.out.println("[2] - Pausar");
        System.out.println("[3] - Like");
        System.out.println("[4] - Deslike");
        System.out.println("[5] - Sair do video");
    }

    public static void assistirVideo(Usuario Userlogado) {
        if(controllerVideo.len() > 0) {
            int opcao;
            ControllerEspectador controllerEspectador = new ControllerEspectador();
            controllerEspectador.listarVideosDisponiveis();
            System.out.print("Qual video quer assistir? ");
            opcao = scanner.nextInt();
            Video videoPlay = controllerVideo.getVideoPlay(opcao);
            if (videoPlay == null) {
                System.out.println("Vídeo inválido.");
                return;
            }
            Espectador espectador = new Espectador(Userlogado);
            espectador.assistirVideo(videoPlay);
            while(true) {   
                controllerEspectador.acaoVideo();
                System.out.print("Sua opcao: ");
                opcao = scanner.nextInt();
                switch(opcao) {
                    case 1:
                        espectador.assistirVideo(videoPlay);
                        break;
                    case 2:
                        espectador.pausarVideo(videoPlay);
                        break;
                    case 3:
                        espectador.curtirVideo(videoPlay);
                        break;
                    case 4:
                        espectador.descurtirVideo(videoPlay);
                        break;
                    case 5:
                        System.out.println("Saindo do video...");
                        return;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        } else {
            System.out.println("Sem videos");
        }
    }
}
