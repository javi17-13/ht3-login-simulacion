/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cesarlopez.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {

    private static BienvenidaView instanciaBienvenidaView;
    private Label lblMensaje;
    private Button btnAceptar;
    private String nombreUsuarioInicial = "";

    public BienvenidaView(String nombreUsuario) {
        this.nombreUsuarioInicial = nombreUsuario;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);

        this.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #4a148c, #311b92, #1a237e); "
                + "-fx-background-radius: 15; "
                + "-fx-border-radius: 15; "
                + "-fx-border-color: #00b0ff; "
                + "-fx-border-width: 3; "
                + "-fx-padding: 25;"
        );

        lblMensaje = new Label("Bienvenido, " + nombreUsuarioInicial);
        lblMensaje.setStyle(
                "-fx-text-fill: #ecf0f1; "
                + "-fx-font-size: 16px; "
                + "-fx-font-weight: bold; "
                + "-fx-font-family: 'Segoe UI', Arial;"
        );

        btnAceptar = new Button("Aceptar");
        btnAceptar.setPrefWidth(120);

        btnAceptar.setStyle(
                "-fx-background-color: #1e7e34; "
                + "-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-cursor: hand;"
        );

        btnAceptar.setStyle(
                "-fx-background-color: #1b5e20; "
                + "-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-cursor: hand;"
        );

        btnAceptar.setOnMouseEntered(e -> btnAceptar.setStyle("-fx-background-color: #0d3c12; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5; -fx-cursor: hand;"));
        btnAceptar.setOnMouseExited(e -> btnAceptar.setStyle("-fx-background-color: #1b5e20; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5; -fx-cursor: hand;"));

        btnAceptar.setOnAction(evento -> {
            Stage stage = (Stage) this.getScene().getWindow();
            if (stage != null) {
                stage.close();
            }
        });

        this.getChildren().addAll(lblMensaje, btnAceptar);
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuarioInicial = nombre;
        if (lblMensaje != null) {
            lblMensaje.setText("Bienvenido, " + nombre);
        }
    }

    public static BienvenidaView getInstancaBienvenidaView(String nombreUsuario) {
        if (instanciaBienvenidaView == null) {
            instanciaBienvenidaView = new BienvenidaView(nombreUsuario);
        } else {

            instanciaBienvenidaView.setNombreUsuario(nombreUsuario);
        }
        return instanciaBienvenidaView;
    }

    public static void setInstanciBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
}
