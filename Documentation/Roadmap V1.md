**Project Goal**

Build a personal recipe management platform that uses my existing Obsidian recipe vault as the source of truth while providing a modern Progressive Web App (PWA) experience for desktop and iPhone.

The project should emphasize modern backend development practices while introducing frontend development, containerization, deployment, and software architecture concepts.

---

# Project Vision

The finished application should allow me to:

- Continue writing recipes in Obsidian.
- Automatically synchronize recipe changes.
- Browse recipes through a modern web interface.
- Install the application on my iPhone as a PWA.
- Search and filter recipes quickly.
- Cook directly from the app.
- Expand over time with planning, grocery lists, and analytics.

---

# Guiding Principles

## Obsidian is the source of truth

Recipes are edited in Obsidian.

The application exists to organize, search, display, and extend those recipes.

---

## Build incrementally

Every phase should end with a working application.

No phase should feel like "unfinished infrastructure."

---

## Learn by solving real problems

Every new technology should have a practical purpose within the project.

Avoid adding technologies simply to increase the tech stack.

---

# Proposed Technology Stack

## Backend

- Java
- Spring Boot
- Spring Data JPA
- Maven
## Database

- PostgreSQL
- Flyway

## Frontend

- React
- TypeScript
- Progressive Web App (PWA)

## Containerization

- Docker
- Docker Compose

## Testing

- JUnit
- Mockito
- Testcontainers

## DevOps

- Git
- GitHub
- GitHub Actions

---

# Development Phases

## Phase 0 - Planning

### Goal

Design the project before writing code.

### Deliverables

- Vision
- Architecture
- Roadmap
- GitHub repository
- Initial backlog

### Learning Focus

- Software architecture
- Project planning
- Requirements gathering

---

## Phase 0.5 - Docker Fundamentals

### Goal

Learn containerization independently before integrating it into the project.

### Deliverables

- Install Docker Desktop
- Understand images
- Understand containers
- Learn volumes
- Learn networking
- Learn Docker Compose basics

### Learning Focus

- Containerization
- Development environments
- Docker workflow

---

## Phase 1 - Recipe Parser

### Goal

Read and understand the existing Obsidian recipe vault.

### Deliverables

- Read Markdown files
- Parse YAML front matter
- Parse recipe contents
- Build Java objects representing recipes

### Learning Focus

- File processing
- Parsing
- Object modeling
- Unit testing

---

## Phase 2 - Database

### Goal

Store recipes in PostgreSQL.

### Deliverables

- Database schema
- Import parsed recipes
- Relationships between recipes, ingredients, and tags

### Docker Goal

Run PostgreSQL inside Docker.

### Learning Focus

- Relational databases
- JPA
- Hibernate
- Database migrations

---

## Phase 3 - REST API

### Goal

Expose recipe data through Spring Boot.

### Deliverables

- Recipe endpoints
- Ingredient endpoints
- Tag endpoints
- Search endpoints
- API documentation

### Docker Goal

Containerize the backend.

### Learning Focus

- REST APIs
- Validation
- DTOs
- Error handling

---

## Phase 4 - Web Application

### Goal

Create a responsive interface for viewing recipes.

### Deliverables

- Home page
- Recipe list
- Recipe details
- Mobile-friendly layout

### Docker Goal

Containerize the frontend.

### Learning Focus

- React
- TypeScript
- Component design

---

## Phase 5 - Search & Filtering

### Goal

Make recipes easy to discover.

### Deliverables

Search by:

- Name
- Ingredient
- Cuisine
- Tags
- Difficulty
- Cook time

### Learning Focus

- Query design
- Search functionality
- Backend filtering

---

## Phase 6 - Docker Compose

### Goal

Run the entire application with a single command.

### Deliverables

Containerized:

- Frontend
- Backend
- PostgreSQL

Started together using Docker Compose.

### Learning Focus

- Multi-container applications
- Networking
- Environment variables
- Volumes

---

## Phase 7 - Progressive Web App

### Goal

Install the application on desktop and iPhone.

### Deliverables

- Installable web app
- Home screen icon
- Responsive design
- App-like experience

### Learning Focus

- PWAs
- Service workers
- Web manifests

---

## Phase 8 - Automatic Synchronization

### Goal

Remove manual imports.

### Deliverables

Detect changes to Obsidian recipes and automatically update the database.

### Learning Focus

- File watching
- Synchronization
- Background processing

---

## Phase 9 - Cook Mode

### Goal

Optimize the application for cooking.

### Deliverables

- Large text
- Step-by-step instructions
- Ingredient checklist
- Simple navigation
- Optional timers

### Learning Focus

- User experience
- Mobile interface design

---

## Phase 10 - Organization Features

### Goal

Improve recipe management.

### Possible Features

- Favorites
- Collections
- Recently viewed
- Ratings

---

## Phase 11 - Meal Planning

### Goal

Extend beyond recipe browsing.

### Possible Features

- Weekly meal planner
- Grocery list generation
- Ingredient consolidation

---

## Phase 12 - Analytics

### Goal

Gain insights into the recipe collection.

### Possible Features

- Recipe statistics
- Ingredient usage
- Cuisine breakdown
- Cooking trends
- Power BI integration

---

## Phase 13 - Recipe Importer

### Goal

Automate recipe creation.

### Sources

- Recipe websites
- YouTube
- Instagram

### Output

Properly formatted Obsidian Markdown that is automatically added to the vault.

---

## Phase 14 - Polish & Deployment

### Goal

Prepare the application as a showcase portfolio project.

### Deliverables

- Documentation
- Testing
- Performance improvements
- Deployment
- CI/CD
- Final release

---

# Long-Term Vision

Recipe Vault should become:

- My primary recipe application.
- A showcase portfolio project.
- A learning platform for modern software engineering.
- A demonstration of backend, frontend, database, containerization, testing, and deployment skills.
- An application that continues to grow over time rather than ending at version 1.0.