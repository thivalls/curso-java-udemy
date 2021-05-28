package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.time.Instant;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<LogEntry> logs = new TreeSet<>();
        String path = "C:\\Users\\Thiago.valls\\studies\\udemy\\exercises\\set\\src\\main\\java\\application\\dados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                logs.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (LogEntry log : logs) {
            System.out.println(log.toString());
        }

        System.out.println("Numero de itens adicionados: " + logs.size());
    }
}
