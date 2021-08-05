package webjava;

import static spark.Spark.*;
import webjava.animais.AnimalControler;
import webjava.contador.ContadorControler;
import webjava.repete.RepeteControler;

public class App 
{
    public static void main( String[] args )
    {

        // staticFiles.location("/public");

        get("/", ContadorControler.count);

        get("/details", ContadorControler.details);

        get("/nome/:nome", (req, res) -> {return "Bem vindo(a) " + req.params("nome") + "!";});

        get("/repetir/:palavra/:qtd", RepeteControler.repeat);

        get("/som/:animal", AnimalControler.som);
        
    }
}
