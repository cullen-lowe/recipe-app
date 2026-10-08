package com.example.recipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class RecipeAppApplication {

    public static void main(String[] args) {
        String stringDirectoryPath = "C:\\Users\\culle\\Documents\\Recipes";

        scanDirectory(stringDirectoryPath);
        //Commented out because I don't need to run a spring app just yet.
        //SpringApplication.run(RecipeAppApplication.class, args);
    }

    public static void scanDirectory(String stringDirectoryPath) {
        Path directoryPath = Paths.get(stringDirectoryPath);

        try (Stream<Path> stream = Files.walk(directoryPath)) {
            List<Path> listAllFiles = stream
                    .filter(path -> path.getFileName().toString().endsWith("Meatball Soup.md"))
                    .toList();

            listAllFiles.forEach(System.out::println);

            listAllFiles.forEach(path -> {
                try {
                    String stringFileContent = Files.readString(path);
                    System.out.println(stringFileContent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
