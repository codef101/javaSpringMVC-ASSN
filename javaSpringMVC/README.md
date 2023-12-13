# Spring MVC Project README

## Project Overview

This Spring MVC project implements a user form submission and persistence application with additional features such as page hits tracking and asynchronous updates. The project is organized into packages, and various requirements are implemented in different classes/files.

## Project Structure

├───.idea
└───javaSpringMVC
├───.mvn
│   └───wrapper
└───src
├───main
│   ├───java
│   │   └───com
│   │       └───javamvcweb
│   │           ├───controller
│   │           ├───javaSpringMVC
│   │           ├───model
│   │           ├───repository
│   │           └───service
│   └───resources
│       ├───static
│       └───templates
└───test
└───java
└───com
└───javamvcweb
└───javaSpringMVC
├───controller
├───repository
└───service



## Requirements Implementation

- **Requirement 1**: Implemented in `FormController.java`
- **Requirement 3**: Implemented in `UserEntity.java`
- **Requirement 4**: Implemented in `FormService.java` and `FormServiceImpl.java`
- **Requirement 5**: Implemented in `user-form.html`
- **Requirement 6**: Implemented in `PageHitsController.java`
- **Requirement 8**: Implemented in `FormRepository.java`

## Asynchronous Page Hits

Page hits are tracked asynchronously in `PageHitsController.java`. The hits are updated every 3 seconds and can be displayed on any page.

## Bonus Points (Libraries Used)

- **Lombok**: Used in `UserEntity.java` for automatic generation of getters, setters, and other boilerplate code.
- **Spring Web MVC**: Used for building the MVC architecture.
- **Thymeleaf**: Used for templating in `user-form.html`.

## Instructions for Running the Project

1. Clone the repository: `git clone https://github.com/your-username/your-project.git`
2. Navigate to the project directory: `cd your-project`
3. Build the project: `./mvnw clean install` (or use your build tool)
4. Run the application: `./mvnw spring-boot:run` (or use your build tool)
5. Open your browser and go to [http://localhost:8080/user-form](http://localhost:8080/user-form) to access the user form.

Ensure that you have Java and Maven installed on your machine.

Feel free to modify these instructions based on your actual project structure and build tool configuration.
