# spring-oauth-security

To get Token call  - 

Post call - http://localhost:8081/oauth/token 

Header - Authorization : Basic {value} - value is basic encoding of clientId:Secret. ex: dGVzdENsaWVudDpzZWNyZXQ= for testClient:secret

Body - Form-urlencoded
  grant_type - client_credentials
  
Use access_token to make request to secured resources. Pass the access_token in header as Authorization Bearer type
