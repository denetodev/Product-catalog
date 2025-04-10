# Use a imagem base do OpenJDK 21
FROM openjdk:21-jdk-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie os arquivos do projeto
COPY . .

# Dê permissão ao mvnw
RUN chmod +x mvnw

# Build do projeto
RUN ./mvnw -B -DskipTests clean package

# Exponha a porta
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "target/productcatalog-0.0.1-SNAPSHOT.jar"]