package Exercicios.ex042.service;

import java.util.Scanner;

import Exercicios.ex042.model.*;

//import java.util.ArrayList;

public class YoutubeController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ControllerLogin controllerLogin = new ControllerLogin(); 
    private static final ControllerVideo controllerVideo = ControllerVideo.getInstance();

    public void menuAutenticarUsuario() {
        System.out.println("[1] - Login");
        System.out.println("[2] - Registrar");
        System.out.println("[3] - Sair");
    }

    public void registerUser() {
        String nome, email, senha;
        scanner.nextLine(); //Limpar o buffer
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Senha: ");
        senha = scanner.nextLine();
        Usuario newUser = new Usuario(nome, email, senha);
        controllerLogin.registerUser(newUser);
    }

    public String[] coletarDados() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        return new String[]{email, senha};
    }

    public Usuario login(String email, String senha) {
        return controllerLogin.autenticarUser(email, senha);
    }

    public void menuAcoesUsuario(){
        System.out.println("[1] - Publicar Video");
        System.out.println("[2] - Assistir Video");
        System.out.println("[3] - Seus Video Publicados");
        System.out.println("[5] - Historico");
        System.out.println("[5] - Deslogar");
    }

    public void publicVideoUser(Usuario userLogado) {
        System.out.println("=====Publicar Video=====");
        scanner.nextLine();
        System.out.println("Titulo do Video: ");
        String tituloVideo = scanner.nextLine();
        Video newVideo = new Video(tituloVideo, userLogado);
        userLogado.publicVideos(newVideo);
        controllerVideo.registerVideo(newVideo);
    }

    public void opcaoAcaoUsuario(Usuario userLogado) {
        int opcao;
        while(true) { 
            menuAcoesUsuario();
            System.out.print("Sua opcao: ");
            opcao = scanner.nextInt();       
            switch (opcao) {
                case 1:
                    publicVideoUser(userLogado);
                    break;
                case 2:
                    //System.out.println(controllerVideo.len());
                    ControllerEspectador.assistirVideo(userLogado);
                    break;
                case 3:
                    userLogado.seuVideos();
                    break;
                case 4:
                    userLogado.historico();
                    break;
                case 5:
                    System.out.println("Deslogar");
                    return;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }

    public static void run() {
        YoutubeController youtubeController = new YoutubeController();
        int opcao;
        while(true) {
            youtubeController.menuAutenticarUsuario();
            System.out.print("Sua opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("=== Login ===");
                    scanner.nextLine(); 
                    String[] dadosLogin = youtubeController.coletarDados();
                    Usuario userLogado = youtubeController.login(dadosLogin[0], dadosLogin[1]);
                    if(userLogado != null) {
                        youtubeController.opcaoAcaoUsuario(userLogado);
                    } else {
                        System.out.println("Login invalido");
                    }
                    break;
                case 2:
                    System.out.println("=== Cadastro ===");
                    youtubeController.registerUser();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
