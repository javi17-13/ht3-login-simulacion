/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cesarlopez.system;

import static javafx.application.Application.launch;
import com.cesarlopez.controller.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class ClasePrincipal extends Application{
 
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage escenarioRaiz) {
        SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRaiz);
        SceneManager.getInstanciaSceneManager().ventanaLogin();
    }
}
