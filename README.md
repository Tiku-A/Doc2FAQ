# Doc2FAQ Application

A Spring Boot web application designed to convert documents into comprehensive FAQ formats. This application serves as the foundation for building an intelligent document-to-FAQ conversion system.

## Features

- **Document Processing**: Support for various document formats (planned)
- **AI-Powered Analysis**: Intelligent extraction of key information (planned)
- **FAQ Generation**: Automatic creation of well-structured FAQ documents (planned)
- **Web Interface**: Clean, responsive web interface for easy interaction

## Technology Stack

- **Java 17**: Programming language
- **Spring Boot 3.2.0**: Application framework
- **Maven**: Build tool and dependency management
- **Thymeleaf**: Template engine for web pages
- **HTML5/CSS3**: Frontend technologies

## Prerequisites

Before running this application, make sure you have the following installed:

- **Java 17** or higher
- **Maven 3.6+** (or use the Maven wrapper included in the project)
- **Git** (for cloning the repository)

## Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd doc2faq-app
```

### 2. Build the Application

Using Maven:
```bash
mvn clean compile
```

Or using the Maven wrapper (if available):
```bash
./mvnw clean compile
```

### 3. Run the Application

Using Maven:
```bash
mvn spring-boot:run
```

Or using the Maven wrapper:
```bash
./mvnw spring-boot:run
```

Alternatively, you can build a JAR file and run it:
```bash
mvn clean package
java -jar target/doc2faq-app-1.0.0-SNAPSHOT.jar
```

### 4. Access the Application

Once the application is running, open your web browser and navigate to:
```
http://localhost:8080
```

You should see the Doc2FAQ landing page with application information and status.

## Project Structure

```
doc2faq-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── doc2faq/
│   │   │           ├── Doc2FaqApplication.java      # Main application class
│   │   │           └── controller/
│   │   │               └── HomeController.java      # Home page controller
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── style.css                    # Application styles
│   │       ├── templates/
│   │       │   └── index.html                       # Landing page template
│   │       └── application.properties               # Application configuration
│   └── test/
│       └── java/                                    # Test classes (to be added)
├── target/                                          # Build output (generated)
├── .gitignore                                       # Git ignore rules
├── pom.xml                                          # Maven configuration
└── README.md                                        # This file
```

## Development

### Running in Development Mode

The application includes Spring Boot DevTools for enhanced development experience:

- **Automatic Restart**: The application automatically restarts when you make changes to the code
- **LiveReload**: Browser automatically refreshes when static resources are modified
- **Template Caching Disabled**: Thymeleaf templates are not cached in development

### Adding New Features

This is the initial setup of the Doc2FAQ application. Future development will include:

1. **File Upload Functionality**: Allow users to upload documents
2. **Document Processing**: Parse and analyze uploaded documents
3. **AI Integration**: Implement intelligent Q&A generation
4. **FAQ Export**: Generate and download FAQ documents
5. **User Management**: Add user authentication and session management
6. **Database Integration**: Store processed documents and generated FAQs

### Testing

To run tests (when test cases are added):
```bash
mvn test
```

## Configuration

The application can be configured through `src/main/resources/application.properties`:

- **Server Port**: Default is 8080, can be changed with `server.port`
- **Logging Levels**: Adjust logging verbosity
- **Thymeleaf Settings**: Template engine configuration
- **Static Resources**: Configuration for CSS, JS, and other static files

## Troubleshooting

### Common Issues

1. **Port Already in Use**: If port 8080 is already in use, change the port in `application.properties`:
   ```properties
   server.port=8081
   ```

2. **Java Version Issues**: Ensure you're using Java 17 or higher:
   ```bash
   java -version
   ```

3. **Maven Issues**: If Maven commands fail, try using the Maven wrapper:
   ```bash
   ./mvnw clean compile
   ```

### Logs

Application logs are displayed in the console when running. For more detailed logging, adjust the logging levels in `application.properties`.

## Contributing

This project is in its initial setup phase. Future contributions will focus on:

- Implementing core document processing features
- Adding comprehensive test coverage
- Improving the user interface
- Integrating AI/ML capabilities for FAQ generation

## License

This project is currently in development. License information will be added in future releases.

## Status

✅ **Current Status**: Initial Spring Boot application setup complete
- Application builds and runs successfully
- Landing page displays correctly
- Ready for core feature development

🚧 **Next Steps**: 
- Implement file upload functionality
- Add document processing capabilities
- Integrate FAQ generation features