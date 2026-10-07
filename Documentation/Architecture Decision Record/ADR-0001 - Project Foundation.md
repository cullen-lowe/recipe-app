**Date:** July 1, 2026

---

# Context

I wanted to create a personal software project that would strengthen my software engineering resume while also solving a real problem that I encounter regularly.

Rather than creating a generic portfolio application (such as a to-do list or CRUD application), I chose to build a recipe management platform because I already maintain a large recipe collection inside Obsidian.

The project should be something that I continue using long after it is initially completed.

Because this project is intended both as a learning platform and as a portfolio piece, architectural decisions should prioritize long-term maintainability, incremental growth, and opportunities to learn modern software engineering practices.

---

# Decision

The project will be developed as a full-stack web application centered around an existing Obsidian recipe vault.

The application will:

- Treat Obsidian Markdown files as the source of truth.
    
- Import recipe data into a relational database.
    
- Expose recipe information through a REST API.
    
- Present recipes through a Progressive Web App (PWA).
    
- Utilize Docker and Docker Compose for development and deployment.
    
- Be built incrementally through small, usable milestones.
    

---

# Goals

The project should accomplish the following:

- Improve Java backend development skills.
    
- Learn modern frontend development.
    
- Gain practical experience with Docker.
    
- Learn API design.
    
- Learn database design.
    
- Learn deployment practices.
    
- Produce a polished portfolio project.
    
- Create a recipe application that I personally use.
    

---

# Architectural Principles

## Obsidian remains the source of truth

Recipes will continue to be authored inside Obsidian.

The application is responsible for parsing, storing, searching, and displaying recipe information.

Editing recipes directly through the application is not an initial project goal.

---

## Incremental development

Every development phase should produce a working application.

The application should always remain usable between milestones.

---

## Learn technologies for practical reasons

New technologies should only be introduced when they solve an actual problem within the project.

The project should avoid unnecessary complexity or "resume-driven development."

---

## Separate responsibilities

The application should maintain clear boundaries between:

- Data storage
    
- Business logic
    
- User interface
    
- Infrastructure
    

This should allow each layer to evolve independently.

---

# Technology Decisions

## Backend

**Decision**

Use Java with Spring Boot.

**Reasoning**

Java aligns with my professional experience and desired career path while Spring Boot provides a mature ecosystem for REST APIs and enterprise application development.

---

## Database

**Decision**

Use PostgreSQL.

**Reasoning**

Provides an opportunity to work with a production-grade relational database while reinforcing SQL and database design concepts.

---

## Frontend

**Decision**

Use React with TypeScript.

**Reasoning**

Provides experience with a widely adopted frontend framework while maintaining a clean separation from the backend.

---

## Mobile Strategy

**Decision**

Develop a Progressive Web App rather than a native iOS application.

**Reasoning**

A PWA can be installed on an iPhone without App Store distribution, can be developed entirely from Windows, and avoids requiring Swift, Xcode, or an Apple Developer subscription during development.

---

## Containerization

**Decision**

Use Docker and Docker Compose.

**Reasoning**

The project naturally consists of multiple services that benefit from isolated environments.

Docker also provides an opportunity to learn containerization, simplifies onboarding, and prepares the application for future deployment.

---

# Development Strategy

Development should generally follow this progression:

1. Planning
    
2. Docker fundamentals
    
3. Recipe parsing
    
4. Database persistence
    
5. REST API
    
6. Web frontend
    
7. Docker Compose
    
8. Progressive Web App
    
9. Synchronization
    
10. Feature expansion
    
11. Deployment
    

This order allows each phase to build upon the previous one while maintaining a usable application.

---

# Expected Benefits

- A practical application used in everyday life.
    
- Strong portfolio project.
    
- Hands-on experience with modern development practices.
    
- Experience across the full software development lifecycle.
    
- Opportunity to demonstrate architecture decisions during interviews.
    

---

# Consequences

## Positive

- Solves a real personal problem.
    
- Encourages long-term development.
    
- Covers multiple areas of software engineering.
    
- Demonstrates practical experience instead of tutorial knowledge.
    
- Can continue growing after version 1.0.
    

## Negative

- Larger scope than a typical portfolio project.
    
- Requires learning several new technologies.
    
- Longer timeline before reaching the complete vision.
    
- Requires discipline to avoid unnecessary features.
    

---

# Future Revisions

This ADR establishes the overall direction of the project.

Future ADRs should document significant architectural decisions as they occur, including:

- Database schema strategy
    
- Docker architecture
    
- Synchronization approach
    
- Search implementation
    
- Authentication (if added)
    
- Deployment strategy
    
- Offline support
    
- Caching strategy
    
- AI integration