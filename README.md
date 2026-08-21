# Multi-Module Enterprise Application demo

A reference Java enterprise application demonstrating how a larger system can be organised into **independent but cooperating modules** using both **Gradle** and **Maven**.

The project explores modular application design, dependency management, separation of concerns and layered enterprise architecture using the Java and Spring ecosystem.

## Architecture Overview

The application is divided into four primary modules:

```text
multi-module-example
│
├── common
│   └── Shared models, utilities and cross-cutting concerns
│
├── core
│   └── Domain logic, persistence and core application services
│
├── web-service
│   └── Service/API layer
│
└── web-app
    └── Web application and presentation layer
```

The intention is to demonstrate a dependency structure where responsibilities are separated rather than placing all application concerns inside a single monolithic project structure.

## Technology Stack

| Area               | Technology                     |
| ------------------ | ------------------------------ |
| Language           | Java                           |
| Framework          | Spring Framework 6             |
| Web                | Spring MVC / Spring Web        |
| Persistence        | Hibernate / Spring Data JPA    |
| Enterprise APIs    | Jakarta EE                     |
| Connection Pooling | HikariCP                       |
| Search             | Elasticsearch                  |
| Build Tools        | Gradle and Maven               |
| Configuration      | XML-based Spring configuration |

## Project Modules

### `common`

The `common` module contains functionality intended to be shared across multiple modules.

Typical responsibilities include:

* Shared domain models
* Common utilities
* Reusable abstractions
* Cross-cutting functionality

This module should remain independent of higher-level application concerns wherever possible.

### `core`

The `core` module represents the central application layer.

It is responsible for areas such as:

* Domain and business logic
* Persistence concerns
* Hibernate integration
* Spring-managed services
* Repository and data-access abstractions

The goal is to keep the application's core behaviour independent from the specific delivery mechanism.

### `web-service`

The `web-service` module exposes application functionality through a service-oriented interface.

This demonstrates how the core application capabilities can be consumed externally without coupling domain logic directly to the presentation layer.

### `web-app`

The `web-app` module represents the web-facing application layer.

Its responsibilities are separated from the underlying business and persistence layers, allowing the application to maintain clearer boundaries between:

```text
Presentation
      ↓
Application / Service Layer
      ↓
Domain / Business Logic
      ↓
Persistence / Infrastructure
```

## Architectural Concepts Explored

This repository is primarily intended as a learning and reference project for exploring:

* Multi-module application architecture
* Gradle multi-project builds
* Maven multi-module builds
* Dependency direction between modules
* Separation of concerns
* Shared libraries and common abstractions
* Spring application configuration
* ORM and persistence architecture
* Database connection pooling
* Search integration
* Enterprise application layering

The project is deliberately useful for examining **how a larger Java application can be decomposed structurally before introducing more complex architectural patterns such as microservices**.

## Why a Multi-Module Architecture?

As applications grow, placing every concern inside a single project can create increasingly difficult dependency relationships.

A multi-module architecture allows responsibilities to be separated into logical units:

```text
                 ┌──────────────┐
                 │   Web App    │
                 └──────┬───────┘
                        │
                 ┌──────▼───────┐
                 │ Web Service  │
                 └──────┬───────┘
                        │
                 ┌──────▼───────┐
                 │     Core     │
                 └──────┬───────┘
                        │
                 ┌──────▼───────┐
                 │    Common    │
                 └──────────────┘
```

This approach can improve:

* **Maintainability** — responsibilities are easier to locate.
* **Reusability** — shared functionality can be isolated.
* **Dependency management** — module relationships become explicit.
* **Build organisation** — individual modules can be managed as part of a larger system.
* **Architectural clarity** — application boundaries are visible in the project structure.

## Build Tool Comparison

The repository contains both Gradle and Maven configuration to explore multi-module project organisation using two major Java build ecosystems.

### Gradle

The Gradle configuration defines the project structure and module relationships using:

* `settings.gradle`
* Root `build.gradle`
* Module-specific build configuration

### Maven

The Maven configuration provides an alternative multi-module build structure using:

* Parent `pom.xml`
* Module declarations
* Module dependency management

The purpose is not to declare one build tool superior to the other, but to understand how each models:

* Project aggregation
* Dependency management
* Module boundaries
* Build lifecycle

## Key Learning Focus

This repository is particularly useful for developers moving beyond:

> "I can build a Spring application."

toward:

> **"I understand how a larger enterprise Java application can be structured, decomposed and maintained."**

The focus is therefore not simply CRUD functionality, but the relationship between:

```text
Application Structure
        +
Dependency Boundaries
        +
Framework Integration
        +
Persistence
        +
Infrastructure
        =
Enterprise Application Architecture
```

## Running the Project

The project can be explored using either Gradle or Maven depending on the build configuration being tested.

### Gradle

```bash
./gradlew build
```

### Maven

```bash
mvn clean install
```

Individual module execution will depend on the module being explored and its runtime configuration.

## Purpose

This repository forms part of my broader exploration of **enterprise Java engineering and application architecture**.

The emphasis is on understanding the architectural foundations beneath modern frameworks:

* How applications are structured
* How modules depend on one another
* How business logic is separated from delivery mechanisms
* How persistence and infrastructure concerns are integrated
* How a modular monolith differs structurally from an unstructured monolith

The intention is to build engineering understanding that transfers across frameworks, platforms and enterprise domains.
