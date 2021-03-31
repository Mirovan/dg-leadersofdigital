call mvn clean package
call docker build -t mirovan/dg .
@REM call docker tag mirovan/dg store/name
@REM call docker push store/name
call docker run -dp 8080:8080 mirovan/dg