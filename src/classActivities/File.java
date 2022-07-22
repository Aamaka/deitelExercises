package classActivities;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){

        }
    }
}
