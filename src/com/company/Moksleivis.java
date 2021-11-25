package com.company;

public class Moksleivis {
    //1. Argumentai(kintamieji, pozymiai)
    private int id;
    private String vardas;
    private String pavarde;
    private String grupe;

    //2. Konstruktorius(konstruktoriai)

    public Moksleivis(int id, String vardas, String pavarde, String grupe) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.grupe = grupe;
    }
    // Konstruktorius pagal nutylejima(jo galima ir nedeklaruoti)
    public Moksleivis() {}

//3. Geteriai, seteriai

    public int getId() {
        return id;
    }
    public String getVardas() {
        return vardas;
    }
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
    public String getGrupe() {
        return grupe;
    }
    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }
}
