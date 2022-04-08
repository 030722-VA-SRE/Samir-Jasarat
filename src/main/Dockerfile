#builder stage with maven & jdk 8 to create base image
FROM maven:3.8.4-openjdk-8 as builder 

#need to copy source code and pom.xml from host computer to container
COPY src/ src/
COPY pom.xml pom.xml


#Bulid application to generage .jar file
RUN mvn package -Dmaven.test.skip

#No longer need Maven, so save artifiact up to this point, and discard maven
FROM java:8 as runner
#Base image with only JRE 

#copy from builder stage above (.jar) to runner stage
COPY --from=builder target/P1SpringLearningAPI.jar P1SpringLearningAPI.jar

#Use entrypoint to run application
ENTRYPOINT ["java", "-jar", "/P1SpringLearningAPI.jar"]