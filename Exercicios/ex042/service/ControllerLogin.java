package Exercicios.ex042.service;

import java.util.ArrayList;

import Exercicios.ex042.model.Usuario;

public class ControllerLogin {
    private ArrayList<Usuario> users;

    public ControllerLogin() {
        this.users = new ArrayList<>();
    } 

    public void registerUser(Usuario user) {
        this.users.add(user);
    }

    public Usuario autenticarUser(String email, String senha) {
        for(Usuario user : users) {
            if(email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                System.out.println("Login efetuado com sucesso");
                return user;
            }
        }
        return null;
    }
}
