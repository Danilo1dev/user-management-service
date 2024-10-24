# Usar a imagem do JDK como base
FROM openjdk:21-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado para o container
COPY target/*.jar app.jar

# Definir o comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
