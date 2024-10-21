# Usa la imagen oficial de Amazon Corretto JDK para la versión de Java 21
FROM amazoncorretto:21-alpine-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado por Maven desde la carpeta 'target' a la carpeta de trabajo del contenedor
COPY target/api-0.0.1-SNAPSHOT.jar /app/api.jar

# Exponer el puerto en el que corre tu aplicación (generalmente 8080 para Spring Boot)
EXPOSE 8080

# Comando para ejecutar el JAR
ENTRYPOINT ["java","-jar","/app/api.jar"]





#el JDK que utilizas en tu proyecto
#FROM amazoncorretto:21-alpine-jdk
#ejecusion de la programa
#COPY target/api-0.0.1-SNAPSHOT.jar api.jar
#ENTRYPOINT ["java","-jar","/api.jar"]
