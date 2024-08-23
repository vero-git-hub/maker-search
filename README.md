# Maker-Search
## Overview
Maker-Search is a proof-of-concept (PoC) project designed for the manufacturing industry. The application provides a search API that allows buyers to search for manufacturers based on customized requirements. The API supports various search criteria, including location, nature of business, and manufacturing processes. Additionally, the API includes pagination, input validation, and basic error handling.

## Features
- **Search Manufacturers:** Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
- **Sorting:** Display results in ascending or descending order.
- **Pagination Support:** Handle large results by paginating the response.
- **Input Validation:** Ensure that all incoming data is properly validated.
- **Error Handling:** Implement basic error handling and return informative error messages.
- **Data Persistence:** Use H2 file-based database for storing supplier data.

## Technologies Used
- **Java v17.0.7**
- **Spring Boot v3.3.2**
    - Spring Web
    - Spring Data JPA
    - Spring Boot DevTools
    - Spring Boot Actuator (optional)
    - Spring Boot Validation
- **H2 Database**
- **Lombok** (optional)
- **Maven v3.9.7**

## Getting Started
### Prerequisites
- Java 17+
- Maven 3.9+
- Git (optional)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/maker-search.git

2. Navigate to the project directory:
    ```bash
   cd maker-search

3. Build the project using Maven:
    ```bash
   mvn clean install

### Running the Application
To run the application locally, use the following Maven command:

    mvn spring-boot:run

The application will start on http://localhost:8080.

### H2 Database Console
You can access the H2 database console at http://localhost:8080/h2-console.

- **JDBC URL:** jdbc:h2:file:./data/testdb
- **Username:** sa
- **Password:** (leave it blank)

### API Endpoints
**Search Suppliers**
- **URL:** POST /api/supplier/query
- **Description:** Retrieve a list of suppliers based on location, nature of business, and manufacturing processes.
- **Request Body:**
    ```
    {
        "location": "New York",
        "natureOfBusiness": "small_scale",
        "manufacturingProcess": "3d_printing"
    }
    ```
- **Response Example:**
    ```
    {
        "totalPages": 5,
        "totalElements": 24,
        "size": 5,
        "content": [
        {
            "supplierId": 1,
            "companyName": "ABC Manufacturing",
            "website": "http://abc-manufacturing.com",
            "location": "New York",
            "natureOfBusiness": "small_scale",
            "manufacturingProcesses": "3d_printing, casting"
        },
        ...
    ],
    "number": 0,
    "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
    },
    "pageable": {
        "pageNumber": 0,
        "pageSize": 5,
        "sort": {
            "empty": false,
            "sorted": true,
            "unsorted": false
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
        "first": true,
        "last": false,
        "numberOfElements": 5,
        "empty": false
    }
    ```

### Testing with Postman
You can use Postman to test the API endpoints. Below are the steps to perform a search using Postman:
1. **Open Postman** and create a new POST request.
2. **Set the URL** to http://localhost:8080/api/supplier/query.
3. **Add Request Body:**
- Select raw and set the type to JSON.
- Paste the following JSON into the request body:
```
{
    "location": "New York",
    "natureOfBusiness": "small_scale",
    "manufacturingProcess": "3d_printing"
}
```
4. **Send the Request:**
- Click the "Send" button.
- You should receive a response similar to the one shown in the API Endpoints section.

### Sample cURL Commands
**Search Suppliers**
```
curl -X POST http://localhost:8080/api/supplier/query -H "Content-Type: application/json" -d '{
  "location": "New York",
  "natureOfBusiness": "small_scale",
  "manufacturingProcess": "3d_printing"
}'
```

### Contributing
Feel free to fork this repository and contribute by submitting pull requests. We welcome any improvements or suggestions.

### License
This project is licensed under the MIT License.