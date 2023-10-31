package br.com.nicollas.calculate.model;

public class ErrorCalc {
    private final Usuario usuario;
    private String message;

    public ErrorCalc(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
