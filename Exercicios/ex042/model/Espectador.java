package Exercicios.ex042.model;

public class Espectador {
    private Usuario user;

    public Espectador(Usuario user) {
        this.user = user;
    }

    public void assistirVideo(Video video) {
        user.addHistoricoVideo(video);
        video.play();
    }

    public void pausarVideo(Video video) {
        video.pausar();
    }

    public void seusVideosPublicados() {
        this.user.seuVideos();
    }

    public void seusHistoricos() {
        this.user.historico();
    } 

    public void curtirVideo(Video video) {
        video.like();
    }

    public void descurtirVideo(Video video) {
        video.deslike();
    }
}
