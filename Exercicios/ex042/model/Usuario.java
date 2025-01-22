package Exercicios.ex042.model;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Video> videosPublicados;
    private ArrayList<String> historicoVideo;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.videosPublicados = new ArrayList<>();
        this.historicoVideo = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void addHistoricoVideo(Video video) {
        if(!this.historicoVideo.contains(video.getTitulo())) {
            this.historicoVideo.add(video.getTitulo());
            video.visualizacao();
        }
    }

    public void publicVideos(Video video) {
        this.videosPublicados.add(video);
    }

    public void seuVideos() {
        if (this.videosPublicados == null) {
            System.out.println("Sem videos publicados");
            return;
        }
        for(Video videos : videosPublicados) {
            System.out.println(videos.toString());
        }
    }

    public void historico() {
        System.out.println("Historico");
        for(String video : this.historicoVideo) {
            System.out.println(video);
        }
    }
}
