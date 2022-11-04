# springbootKeycloak_API_security

keycloak version 19.0.3

This project was build as a demo on how to secure spring boot application with keycloak
it provide a basic method level authorization.

steps
________
1. download keycloak
2. start keycloak server
3. open local keycload running on server
4. create default admin user
5. log into the dashboard

Dashboard setup.     // NOTE:==>  please use the keycloak documentation as a reference guide
____________________
1. create realm user
2. create client
3. create roles
4. create user and add role to user

Postman Token generation and API test
_____________________________________
use this link -> http://0.0.0.0:8080/realms/MyRealm/protocol/openid-connect/token
with the client and user logins you created to generate toke

spring boot app
1. add dependencies {check the project pom.xml}
2. create security config class use this project as reference guide
