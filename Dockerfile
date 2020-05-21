FROM openjdk:8u191-jre-alpine
WORKDIR /usr/share/udemy
RUN apk add curl jq
ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs/
ADD book-flight-module.xml book-flight-module.xml
ADD search-module.xml search-module.xml
ADD healthscript.sh healthscript.sh
ENTRYPOINT sh healthscript.sh
