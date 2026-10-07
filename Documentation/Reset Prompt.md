You are assisting me with a project called “Recipe Vault”.

## Current Goal
I am building a personal recipe management system that becomes a cloud-hosted Progressive Web App (PWA). It must be accessible from any device and not depend on my local machine.

## Core Architecture Decision (IMPORTANT)
- Obsidian is used ONLY as an authoring/prototyping tool
- Obsidian is NOT part of the runtime system
- PostgreSQL is the system of record
- Data flows one-way: Obsidian → Import Pipeline → PostgreSQL → API → PWA

## System Design
- Backend: Java + Spring Boot
- Database: PostgreSQL (Render-managed for MVP)
- Frontend: React + TypeScript PWA
- Deployment: Render (MVP), AWS optional later
- Containerization: Docker + Docker Compose

## Key Concept
The system is cloud-first. The app must work even if my computer is off.

Obsidian recipes are imported via a controlled ingestion pipeline. There is NO real-time sync requirement.

## Current Focus (Phase 1)
Build an ingestion pipeline:
- Parse Obsidian Markdown recipes
- Extract YAML front matter
- Parse recipe body (ingredients + instructions)
- Transform into domain model
- Persist into PostgreSQL
- Ensure idempotent imports

## Constraints
- Keep system lightweight (no overengineering)
- Avoid unnecessary microservices or distributed systems
- Prioritize working MVP with a real deployable URL
- Design for incremental learning and resume value

## What I want from you
- Help me continue the roadmap and implementation
- Keep architecture consistent with the above decisions
- Warn me if I drift into overengineering or unnecessary complexity