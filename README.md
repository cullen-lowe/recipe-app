# Recipe Vault

A personal recipe management application built around a normalized relational database.

## Project Goals

* Store and organize recipes in a structured format
* Support ingredients, units, difficulty levels, and tags
* Import recipes from Obsidian Markdown
* Provide a foundation for a future web application

## Tech Stack

* **Java / Spring Boot** — API
* **PostgreSQL** — Database
* **React / TypeScript** — Frontend
* **Docker** — Development and deployment

## Database

The current database consists of:

* `recipe` — Recipe information and preparation times
* `difficulty` — Recipe difficulty levels
* `ingredient` — Reusable ingredients
* `unit` — Measurement units
* `tag` — Recipe tags
* `recipe_ingredient` — Ingredients used by recipes
* `recipe_tag` — Recipe/tag relationships

The database is designed as a normalized relational model while avoiding unnecessary database-specific features where practical.

## Status

🚧 **In development**

Current focus: database schema and recipe import structure.
