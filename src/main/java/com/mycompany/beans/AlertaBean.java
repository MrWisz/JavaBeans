/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beans;

import java.io.Serializable;

public class AlertaBean implements Serializable {

    private boolean visible;
    private String mensaje;

    public AlertaBean() {
        this.visible = false;
        this.mensaje = "";
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void mostrarAlerta(String mensaje) {
        this.mensaje = mensaje;
        this.visible = true;
    }

    public void ocultarAlerta() {
        this.visible = false;
    }
}
