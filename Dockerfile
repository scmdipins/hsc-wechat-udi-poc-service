FROM openjdk:8-jdk-alpine
ADD build/libs/hsc-wechat-udi-poc-service*.jar /app.jar

ENV PROFILE=dev

ENV XMS=512
ENV XMX=256
ENV XMN=192

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo $TZ > /etc/timezone

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom",  \
            "-jar", "-Dspring.profiles.active=${PROFILE}", "/app.jar",  \
            "-Xms${XMS}m -Xmx${XMX}m -Xmn${XMN}m"]