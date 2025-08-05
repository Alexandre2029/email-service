# 📧 Email Sender API

Este projeto é uma API REST simples desenvolvida com **Spring Boot** para envio de e-mails utilizando o **AWS Simple Email Service (SES)**. Ela expõe um endpoint que permite o envio de e-mails por meio de uma requisição `HTTP POST`.

---

## 🚀 Funcionalidades

- Envio de e-mails com o **Amazon SES (Simple Email Service)**.
- API RESTful simples e eficiente.
- Tratamento de erros com respostas claras.
- Separação de responsabilidades entre o controlador e o serviço.

---

## 📡 Endpoint

### `POST /api/email/send`

#### Corpo da Requisição (JSON)

```json
{
  "to": "destinatario@exemplo.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do e-mail"
}
```

#### Respostas

- `200 OK`: Email sent successfully.
- `500 Internal Server Error`: Error while sending email.

---

## ☁️ Integração com AWS SES

Este projeto utiliza o **Amazon Simple Email Service (SES)** como provedor de e-mails. 

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- AWS SDK para Java (SES)
- Maven ou Gradle

---
