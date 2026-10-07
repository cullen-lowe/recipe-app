# Project Goal

Build a personal recipe management platform with a cloud-hosted Progressive Web App (PWA) that is accessible anywhere, independent of local files or devices.

Obsidian is used as a **local authoring and prototyping environment**, while the application itself runs on a **cloud-hosted system of record (PostgreSQL + API)**.

---

# Project Vision

The finished application should allow:

- Writing and experimenting with recipes in Obsidian
- Importing recipes into a cloud database
- Browsing and managing recipes through a web interface
- Installing the app as a PWA on iPhone and desktop
- Accessing recipes even when local machines are offline
- Extending into meal planning, grocery lists, and analytics

---

# Guiding Principles

## Obsidian is an authoring tool, not runtime dependency

- Vault is used for drafting and experimentation
- Application does NOT read the vault directly in production
- Data enters the system through a controlled import pipeline

---

## Cloud system is the source of truth

- PostgreSQL stores all production data
- API is the only interface used by the frontend

---

## Build incrementally

Each phase produces a usable system, even if minimal.

---

## Learn through practical application

All technologies must directly support a real feature or system need.

---

# Proposed Technology Stack

## Backend
- Java
- Spring Boot
- Spring Data JPA
- Maven

## Database
- PostgreSQL (Render-managed for MVP)
- Flyway (schema migrations)

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

## DevOps / Deployment
- GitHub
- GitHub Actions
- Render (MVP deployment)
- AWS (optional later migration/extension)

---

# Development Phases

---

# Phase 0 — Planning

## Goal
Define architecture, workflow, and system boundaries before implementation.

## Deliverables
- Final architecture (Obsidian → Import → DB → API → UI)
- Repository setup
- Initial backlog (this roadmap)
- Data model draft (recipes, ingredients, tags)

## Learning Focus
- System design
- Data flow architecture
- Requirements definition

---

# Phase 1 — Core Domain & Import Pipeline (Obsidian → DB)

## Goal
Build the foundation that converts Obsidian recipes into structured data stored in PostgreSQL.

## Deliverables
- Recipe domain model (Java)
- Markdown + YAML parser for Obsidian recipes
- One-way import tool:
  - reads vault files
  - transforms into structured objects
  - writes to database
- Basic validation and error handling

## Learning Focus
- File parsing (Markdown + YAML)
- Data transformation pipelines
- Relational modeling
- Separation of authoring vs production data

## Definition of Success
- Recipes written in Obsidian can be imported into PostgreSQL
- Database contains structured recipe data
- Import process is repeatable and reliable

---

# Phase 2 — Database Layer

## Goal
Establish PostgreSQL as the system of record.

## Deliverables
- Database schema design
- Flyway migrations
- Recipe, ingredient, tag tables
- Connection from Spring Boot API

## Learning Focus
- Relational schema design
- Migration management
- JPA/Hibernate fundamentals

---

# Phase 3 — REST API

## Goal
Expose recipe data through a backend service.

## Deliverables
- Recipe API endpoints
- Tag and ingredient endpoints
- Search/filter endpoints (basic)
- DTO layer + validation

## Learning Focus
- REST design
- API layering
- Error handling patterns

---

# Phase 4 — Web Application (PWA)

## Goal
Build the user-facing interface.

## Deliverables
- Recipe browsing UI
- Recipe detail view
- Search interface
- Mobile-friendly layout
- PWA installability

## Learning Focus
- React fundamentals
- Component architecture
- PWA basics

---

# Phase 5 — Search & Filtering

## Goal
Improve recipe discoverability.

## Features
- Search by name
- Filter by ingredients
- Filter by tags
- Difficulty + cook time filters

---

# Phase 6 — Containerization

## Goal
Standardize environment execution.

## Deliverables
- Dockerized backend
- Docker Compose for local dev
- PostgreSQL container for testing

## Learning Focus
- Container workflows
- Environment reproducibility

---

# Phase 7 — Deployment (MVP Release)

## Goal
Make the system accessible anywhere.

## Deliverables
- Deploy backend to Render
- Deploy PostgreSQL (Render managed DB)
- Deploy frontend (Render static or service)
- Public URL accessible on mobile

## Learning Focus
- Cloud deployment basics
- CI/CD via GitHub Actions
- Environment configuration

---

# Phase 8 — Import Tool Expansion

## Goal
Improve Obsidian → DB workflow.

## Features
- incremental imports (optional)
- update detection (hash/timestamp)
- re-import command

---

# Phase 9 — Cook Mode UX

## Goal
Optimize for real cooking usage.

## Features
- large step-by-step view
- ingredient checklist
- simplified navigation
- optional timers

---

# Phase 10 — Organization Features

- Favorites
- Collections
- Recently viewed
- Ratings

---

# Phase 11 — Meal Planning

- weekly planner
- grocery list generation
- ingredient aggregation

---

# Phase 12 — Analytics

- recipe usage trends
- ingredient frequency
- cuisine breakdown
- cooking statistics

---

# Phase 13 — Recipe Importer Enhancements

- import from web sources
- YouTube/Instagram parsing (later)
- structured Obsidian generation improvements

---

# Phase 14 — Polish & Resume Finalization

- documentation
- performance improvements
- CI/CD cleanup
- deployment hardening
- final public release

---

# Long-Term Vision

The Recipe Vault becomes:

- A cloud-hosted personal recipe system
- A portfolio-grade full-stack application
- A demonstration of:
  - backend engineering
  - frontend development
  - data modeling
  - containerization
  - cloud deployment
  - system design thinking