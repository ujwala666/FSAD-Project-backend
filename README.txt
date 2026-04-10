Virtual Art Gallery - Spring Boot Backend

Import into STS:
1. Open STS
2. File -> Import -> Existing Maven Projects
3. Select the extracted artgallery-backend folder
4. Finish
5. Right click project -> Maven -> Update Project
6. Run ArtGalleryBackendApplication.java as Spring Boot App
7. Open http://localhost:8080/index.html

Demo login:
Email: admin@artgallery.com
Password: admin123

Notes:
- Uses H2 in-memory database, so no MySQL setup is needed.
- Frontend files are inside src/main/resources/static
- Data resets when the app restarts.
- H2 console: http://localhost:8080/h2-console
  JDBC URL: jdbc:h2:mem:artgallerydb
  username: sa
  password: (leave blank)
