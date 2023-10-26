package br.com.nicollas.calculate.model;

public class Resultado {
    private String name;
    private int mass;

    public Resultado() {
    }

    public Resultado(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
