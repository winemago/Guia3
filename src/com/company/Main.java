package com.company;

public class Main {

    public static void main(String[] args) {
      /*  Cylinder cilo = new Cylinder();                        //1

        System.out.println(cilo);

        Cylinder cilo2 = new Cylinder(2.0,"blue",10);

        System.out.println(cilo2 + " area base: " + cilo2.area() + " volume: " + cilo2.volume());
       */


        /*                                                         //2
        Student stdnt1 = new Student(23123213,"jorge", "rial", "facho@gmail.com", "bolivar 1031", "10/22/2012",1000,"TSP");
        Student stdnt2 = new Student(23123213,"matias", "araneta", "facho@gmail.com", "sanmartrin 3564", "10/22/2022",4000,"TSP");
        Student stdnt3 = new Student(23123213,"daneil", "sori", "facho@gmail.com", "colon 1324", "20/12/2012",2000,"TSP");
        Student stdnt4 = new Student(23123213,"kylo", "ren", "facho@gmail.com", "luro 281", "30/02/2052",3000,"TSP");

        Staff prof1 = new Staff(123213,"gustavo","sovinco","sovin@gmail.com","vergara 1233",60000,"maniana");
        Staff prof2 = new Staff(387373,"lanana","feudale","aaaa@gmail.com","lopez 2333",70000,"maniana");
        Staff prof3 = new Staff(7256326,"marcelo","tinelli","cuervo@gmail.com","luro 4233",80000,"noche");
        Staff prof4 = new Staff(322313,"martin","juarez","racing@gmail.com","guemes 3223",9000,"tarde");

        Person[] uni = new Person[8];
        uni[0] = stdnt1;
        uni[1] = stdnt2;
        uni[2] = stdnt3;
        uni[3] = stdnt4;
        uni[4] = prof1;
        uni[5] = prof2;
        uni[6] = prof3;
        uni[7] = prof4;

        int s=0;
        int p=0;

        for (Person per: uni) {
            if (per instanceof Student){
                s++;
            }else{
                p++;
            }
        }

        System.out.println(stdnt1 + " Cantidad: " + s);
        System.out.println(prof1 + " Cantidad: " + p);

        double fee=0;

        for (Person per: uni){
            if(per instanceof Student){
                fee += ((Student) per).getFee();
            }
        }

        System.out.println("Ttoal de cuotas: " + fee);

         */

        Circulo c = new Circulo();
        Circulo c2 = new Circulo(3);
        Circulo c3 = new Circulo("orange",2);

        System.out.println(c2);
        System.out.println(c3 + " Area: " + c3.area() + " Perimetro: " + c3.perimetro());

        Cuadrado bob = new Cuadrado(10,22.5);

        System.out.println(bob + " Area" + bob.area() + " Perimetro" + bob.perimetro());
    }
}
