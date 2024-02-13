Tech Stack :
1. Java 17
2. Maven
3. Intellij
4. SpringBoot
5. PostgreSql
6. API Docs Postman

Installation :
1. clone file
2. pada application properties terdapat variable database berupa :
   spring.datasource.url=jdbc:postgresql://${database.postgres.url}:5432/${database.postgres.dbname}
   spring.datasource.username=${database.postgres.username}
   spring.datasource.password=${database.postgres.password}
3. Rubah environment variable tersebut sesuai dengan management database yang digunakan
4. jika sudah tinggal run application dan test menggunakan Postman

