
## Features
- REST API (/webhook)
- Accepts JSON input
- Returns predefined replies
- Logs messages

## API

POST /webhook

Request:
{
  "message": "Hi"
}

Response:
{
  "reply": "Hello",
  "time": "timestamp"
}

## Screenshots

### API Test
![API Test](screenshots/chatbot.png)

### Console Logs
![Logs](screenshots/chatbot_error_handling.png)

### Dashboard
![Dashboard](screenshots/chatbot_hi.png)

## Run
mvn spring-boot:run
