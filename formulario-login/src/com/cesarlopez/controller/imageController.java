/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cesarlopez.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class imageController {
    private final String RUTA_IMAGENES = "/com/cesarlopez/resources/";
    
    public Image getImageLogin(String nombreImagen){
        Image crearImagen;
        
        switch (nombreImagen) {
            case "logo":
                crearImagen = new Image(RUTA_IMAGENES + "images.jpg");
                break;
            default:
                crearImagen = new Image(RUTA_IMAGENES + "images.jpg");
                
        }
        return crearImagen;
    }
}
