package com.company;

public class Main {

    public static void main(String[] args) {
        //Kuriamas moksleivio klases objektas, pagal pilna(su visias parametrais) moksleivio konstruktoriu
        Moksleivis moksleivis = new Moksleivis(1,"Petras","Petraitis","java");
        Moksleivis moksleivis1 = new Moksleivis(2,"Jonas","Jonaitis","php");
        //Kuriamas moksleivio klases objektas, pagal tuscia moksleivio konstruktoriu
        Moksleivis moksleivis2 = new Moksleivis();
        moksleivis2.setVardas("Antanas");
        moksleivis2.setPavarde("Antanaitis");
        moksleivis2.setGrupe("JS");

        System.out.print(moksleivis.getVardas()+" istojo i KITM grupe " +moksleivis.getGrupe()+". Mokslu eigoje "
                +moksleivis.getVardas()+ " apsisprende pakeisti grupe, is " +
                moksleivis.getGrupe()+" i ");
        moksleivis.setGrupe("PHP");
        System.out.println(moksleivis.getGrupe()+" "+moksleivis.getVardas()+" yra "
                +moksleivis.getGrupe()+" grupes moksleivis.");


    }
}