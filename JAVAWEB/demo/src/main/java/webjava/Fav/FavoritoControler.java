package webjava.animais;

import spark.Route;


public class AnimalControler {
    
    public static Route som = (req, res) -> {

        String animal = req.params("animal");
        String cachorro = "cachorro";
        String cavalo = "cavalo";
        String gato = "gato";
        String ovelha = "ovelha";
        String vaca = "vaca";

        if (animal.equals(cachorro)) {

            cachorro dog = new cachorro();
            return dog.getFala();

        } else if (animal.equals(cavalo)) {

            cavalo horse = new cavalo();
            return horse.getFala();
            
        } else if (animal.equals(gato)) {

            gato cat = new gato();
            return cat.getFala();

        } else if (animal.equals(ovelha)) {

            ovelha sheep = new ovelha();
            return sheep.getFala();

        } else if (animal.equals(vaca)) {

            vaca cow = new vaca();
            return cow.getFala();
        } else {
            return "Animal desconhecido";
        }
    };
        
    
}
