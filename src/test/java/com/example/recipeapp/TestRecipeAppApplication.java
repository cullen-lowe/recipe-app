package com.example.recipeapp;

import org.springframework.boot.SpringApplication;

public class TestRecipeAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(RecipeAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
