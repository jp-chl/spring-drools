# Basic Drools Rules Manager demo for springboot

---
## Run application
```bash
./mvnw spring-boot:run
```
## Test

```bash
curl -s -w "\n" -X POST -H 'Content-Type: application/json' -d '{"name":"Mobile","cardType":"VISA","price":1001}' http://localhost:8080/order | jq
```
Pay attention to ```discount``` field in response. You should receive something like:
```json
{
  "name": "Mobile",
  "cardType": "VISA",
  "discount": 20,
  "price": 1001
}
```

