/liquibase/docker-entrypoint.sh \
  --driver=org.postgresql.Driver \
  --url=jdbc:postgresql://database:5432/dg \
  --username=postgres \
  --password=postgres \
  --classpath=/liquibase/classpath \
  --changeLogFile=./db.changelog.xml \
  update