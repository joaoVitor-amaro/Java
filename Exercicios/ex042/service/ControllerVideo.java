package Exercicios.ex042.service;

import java.util.ArrayList;

import Exercicios.ex042.model.Video;

//Class para salvar o todos os videos publicados 
//pelo User
public class ControllerVideo{
    private static ControllerVideo instance;
    private ArrayList<Video> videos;

    private ControllerVideo() {
        this.videos = new ArrayList<>();
    }

    public static ControllerVideo getInstance() {
        if (instance == null) {
            instance = new ControllerVideo();
        }
        return instance;
    }

    public void registerVideo(Video video) {
        this.videos.add(video);
    }

    public int len() {
        return this.videos.size();
    }

    public Video getVideoPlay(int pos) {
        if(pos < 0 || pos > this.videos.size()) {
            return null;
        }
        return this.videos.get(pos-1);
    }

    public ArrayList<Video> videoAll() {
        return this.videos;
    }
}
