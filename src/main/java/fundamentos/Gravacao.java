package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome", "idade", "telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Lara", "09", "11989989989"});
        linhas.add(new String[]{"Lucas", "05", "1198998489"});
        linhas.add(new String[]{"Vanda", "59", "11977934988"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();
        escritor.close();


    }
}
