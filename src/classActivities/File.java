package classActivities;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s exists ", path.getFileName());
            System.out.printf("%n%s a directory ", Files.isDirectory(path)? "is" : "is Not");
            System.out.printf("%n%s absolute ", path.isAbsolute() ? "is": "is not");
            System.out.printf("%n%s last modified time  ", Files.getLastModifiedTime(path));
            System.out.printf("%n size : %s", Files.size(path));
            System.out.printf("%n Absolute %s", path.toAbsolutePath());

            if(Files.isDirectory(path)){
                try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
                    for(Path filePath: directoryStream){
                        System.out.println(filePath.getFileName());
                    }
                }

            }else {
                System.out.printf("path %s is not a directory", path);
            }

        }else {
            System.out.println("path does not exist");
        }
    }
}
