/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.LoginHelper;
import model.Usuario;
import view.Login;

/**
 *
 * @author leona
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        // Pegar um usuário da view
        Usuario usuario = helper.obterModelo();
        // Pesquisar o usuário no banco
        // Se o usuário da view existir no banco, entrar no menu
        // Senão, mostrar uma mensagem ao usuário "Usuário ou senha inválidos"
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados!");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
