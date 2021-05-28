package application.exec3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Thiago.valls\\studies\\udemy\\exercises\\set\\src\\main\\java\\application\\exec3\\dados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> votes = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String key = fields[0];
                if (votes.get(key) != null) {
                    Integer vote = votes.get(key) + Integer.parseInt(fields[1]);
                    votes.put(key, vote);
                } else {
                    Integer vote = Integer.parseInt(fields[1]);
                    votes.put(key, vote);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
