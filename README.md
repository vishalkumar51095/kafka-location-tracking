
# 🛵 Kafka Location Update Microservices

This project consists of two Spring Boot microservices communicating over Apache Kafka:

- **DeliveryBoy (Producer)** – Sends location updates.
- **EndUser (Consumer)** – Listens to those updates in real-time.

---

## 📁 Project Structure

| Service        | Port  | Role              |
|----------------|-------|-------------------|
| DeliveryBoy    | 8080  | Kafka Producer    |
| EndUser        | 8081  | Kafka Consumer    |

---

## 🛠️ Prerequisites

- Java 17+ or 8
- Kafka 3.5.0 with Scala 2.13
- Zookeeper (comes with Kafka)
- Postman (or any REST client)
- Git Bash / CMD / Terminal

---

## 🚀 Getting Started

### 1️⃣ Start Zookeeper

Open a new terminal and run:

```bash
cd C:\kafka_2.13-3.5.0
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

> Keep this terminal open.

---

### 2️⃣ Start Kafka Server

In another terminal:

```bash
cd C:\kafka_2.13-3.5.0
bin\windows\kafka-server-start.bat config\server.properties
```

> Keep this terminal open.

---

### 3️⃣ Run Spring Boot Services

#### ✅ DeliveryBoy Producer

Run the main class:

```bash
com.deliveryboy.deliveryboy.DeliveryboyApplication
```

> Runs on `http://localhost:8080`

#### ✅ EndUser Consumer

Run the main class:

```bash
com.enduser.enduser.EnduserApplication
```

> Runs on `http://localhost:8081`

---

## 📫 Sending Location Updates (via Postman)

### POST `/location/update`

**URL**:  
```
http://localhost:8080/location/update
```

**Method**: `POST`

**Headers**:
```http
Content-Type: application/json
```

**Body**:
> No body required. Random (x, y) coordinates will be sent.

---

## 📥 Viewing Consumed Messages

### ✅ Option 1: EndUser Logs

Check the logs in the EndUser terminal or IDE console:

```text
Consumed: (34 , 76)
Consumed: (45 , 22)
Consumed: (19 , 89)
```

---

### ✅ Option 2: Kafka Console Consumer

Run this in a new terminal:

```bash
cd C:\kafka_2.13-3.5.0
bin\windows\kafka-console-consumer.bat --topic location-update-topic --from-beginning --bootstrap-server localhost:9092
```

> You’ll see real-time Kafka messages printed.

---

## 🧩 Kafka Topic Details

| Topic Name            | location-update-topic |
|-----------------------|------------------------|
| Producer              | DeliveryBoy            |
| Consumer              | EndUser                |
| Kafka Port            | 9092                   |

---

## 🧰 Troubleshooting

- 🔁 **Restart everything** if Kafka/Zookeeper crashes.
- ⚠️ Avoid typos: use `localhost` not `locahost`.
- 🧪 Test Kafka setup with console commands if Spring Boot apps don’t respond.

---

## 📎 Author

**Vishal Kumar**  
Java + Spring Boot Developer  
📍 Noida, India

---

## 📘 License

This project is licensed under the MIT License.
```

Let me know if you'd like a downloadable version or an auto-generated PDF as well!
