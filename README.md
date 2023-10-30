# LabSeq Desafio

This project tackled the challenge of implementing a REST service using Quarkus (Java) and Angular. The goal was to calculate values from the LabSeq sequence efficiently, emphasizing both the mathematical problem's solution and optimization for speed and efficiency.

## Problem Statement

The LabSeq sequence, defined as `l(n)`, presented a unique challenge:

- `n=0` => `l(0) = 0`
- `n=1` => `l(1) = 1`
- `n=2` => `l(2) = 0`
- `n=3` => `l(3) = 1`
- `n>3` => `l(n) = l(n-4) + l(n-3)`

Efficiently calculating these values, especially for large `n`, was crucial. The service needed to optimize calculations and cache intermediate results for faster computations.

## Solution Overview

- Created a robust backend in Quarkus and a frontend in Angular. 
- Provided a REST API documented with OpenAPI (Swagger - Quarkus). 
- Implemented a caching mechanism for enhanced performance and accuracy.

## Technologies Used

- **Backend**: Quarkus (Java)
- **Frontend**: Angular (TypeScript)
- **API Documentation**: Swagger

### Prerequisites
- Java 11+ (I used Java 17)
- Maven

## Testing the Project

### Cloning the Repository
To test the project from a fresh clone, execute:

```code
git clone https://github.com/AndreEdson93L/labseq_desafio.git

```

### Backend Testing
1. Navigate to the backend directory.
   ```code
   cd [your directory]
   
   ```
3. Execute to start the backend.
   ```code
   ./mvnw compile quarkus:dev

   ```
4. Access the LabSeq endpoint and Swagger UI to ensure they are working as expected.

### Frontend Testing
1. Navigate to the frontend directory.
2. Execute to install dependencies.
   ```code
   npm install
   
   ```
3. Execute to start the frontend.
   ```code
   ng serve
   
   ```
4. Access the frontend application and test the LabSeq calculation functionality. The frontend will be accessible at: [http://localhost:4200/](http://localhost:4200/)

### API Endpoint
You can directly access the LabSeq calculation endpoint at:
[http://localhost:8080/lab-seq?n=90](http://localhost:8080/lab-seq?n=90)
where n equals the input (number to compute).

### Swagger UI
You can directly access the Swagger UI at:
[http://localhost:8080/q/swagger-ui/](http://localhost:8080/q/swagger-ui/)

