package webjava.repete;

import spark.Route;

public class RepeteControler {

    public static Route repeat = (req, res) -> {
        
        String palavra = req.params("palavra") + " ";
        Integer qtd = Integer.parseInt(req.params("qtd"));

        return palavra.repeat(qtd);
    };
}
