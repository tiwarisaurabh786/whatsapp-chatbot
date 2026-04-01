# WhatsApp Chatbot Backend

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

## Run
mvn spring-boot:run
