package application;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ProgramFolder {

    public static void main(String[] args) {

        String path = "/Users/crowel/Documents/java/curso-java-udemy/exercises/file/src/main/java/application/files";

        new File(path + "/myfolder1").mkdir();
        new File(path + "/myfolder1").delete();

        File filePath = new File(path);

        List<File> files = Arrays.asList(filePath.listFiles(File::isFile));
        List<File> folders = Arrays.asList(filePath.listFiles(File::isDirectory));

        files.stream().map(file -> file.getName()).forEach(System.out::println);

        if (!folders.isEmpty()) {
            folders.stream().map(folder -> folder.getName()).forEach(System.out::println);
        }


    }

}
