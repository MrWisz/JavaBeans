/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beans;

public class ControladorAlerta {

    private VistaAlerta vistaAlerta;
    private AlertaBean alertaBean;

    public ControladorAlerta(AlertaBean alertaBean) {
        this.vistaAlerta = new VistaAlerta();
        this.alertaBean = alertaBean;
    }

    public void mostrarAlerta(String mensaje) {
        this.alertaBean.mostrarAlerta(mensaje);
        this.vistaAlerta.mostrarAlerta(this.alertaBean.getMensaje());
    }

    public void ocultarAlerta() {
        this.alertaBean.ocultarAlerta();
        this.vistaAlerta.mostrarAlerta(""); // o cualquier otra acción que oculte la alerta en la vista
    }
}
