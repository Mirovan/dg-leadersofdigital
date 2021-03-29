FROM liquibase/liquibase:latest

#ENV LIQUIBASE_URL=jdbc:postgresql://${POSTGRES_HOST}:${POSTGRES_PORT}/${POSTGRES_DB}
ENV LIQUIBASE_URL=jdbc:postgresql://172.21.33.81:5432/dg
ENV LIQUIBASE_USERNAME=postgres
ENV LIQUIBASE_PASSWORD=postgres
ENV LIQUIBASE_CHANGELOG=db.changelog.xml

ADD ./liquibase /liquibase/changelog

CMD ["sh", "-c", "docker-entrypoint.sh --url=${LIQUIBASE_URL} --username=${LIQUIBASE_USERNAME} --password=${LIQUIBASE_PASSWORD} --classpath=/liquibase/changelog --changeLogFile=${LIQUIBASE_CHANGELOG} update"]