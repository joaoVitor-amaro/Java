package Exercicios.ex042.model;

public class Video implements AcoesVideos {
    private String titulo;
    private int views;
    private int curtidas;
    private int deslike;
    private boolean reproduzindo;
    private Usuario criador;

    public Video(String titulo, Usuario criador) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.deslike = 0;
        this.reproduzindo = false;
        this.criador = criador;
    }

    @Override 
    public void play() {
        if(this.reproduzindo == true) {
            this.reproduzindo = false;
            System.out.println("Opa! O vídeo foi pausado. Aperte play para retomar!");
        } else {
            System.out.println("play no video de " + this.titulo);
            this.reproduzindo = true;
        }
    }

    @Override
    public void pausar() {
        if(this.reproduzindo == false) {
            this.reproduzindo = true;
            System.out.println("Reprodução iniciada. Divirta-se assistindo!");
        } else {
            this.reproduzindo = false;
            System.out.println("Video de " + this.titulo + " pausado");
        }
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public void deslike() {
        this.deslike++;
    }

    public void visualizacao() {
        this.views++;
    }

    public Usuario getCriador() {
        return this.criador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String toString() {
        return "{Titulo: " + this.titulo + " Views: " + this.views
                + " Curtidas: " + this.curtidas + " Deslike: " + this.deslike +  
                " Criador: " + this.criador.getNome();
    }

}
 