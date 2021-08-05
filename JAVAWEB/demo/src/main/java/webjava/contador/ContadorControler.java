package webjava.contador;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import spark.Route;

public class ContadorControler {
    
    static List<LocalTime> lista = new ArrayList<LocalTime>(); 

    private static Integer i = 0;
    public static Route count = (req, res) -> {
        LocalTime time = LocalTime.now();
        lista.add(time);
        i++;
        return "Você está na página principal!";
    };

    public static Route details = (req, res) -> {

        String horas = "Horário de acesso: ";

        for (int i = 0; i < lista.size(); i++) {
            horas = horas.concat(lista.get(i).toString())+"<br>";
        }
        
        return horas + "<br> Você acessou essa página " + i + " vezes";

    };
}
