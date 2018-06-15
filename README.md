# testTask2

Create a pull request here with the implementation of the assignment below.

Create Spring Boot REST API application with these endpoints:

- add two numbers
```text
request
POST /api/sums
{
    "a": 23,
    "b": 56
}
response
{
    "id": 1,
    "sum": 79
}
```
- get sum for previous operations by id
```text
request
GET /api/sums/1
response
{
    "id": 1,
    "sum": 79
}
```
- get all previous sums
```text
request
GET /api/sums
response
[
    {
        "id": 1,
        "sum": 79
    },
    {
        "id": 2,
        "sum": -65
    }
]
```
                
Application should:
- have a build script (Gradle or Maven)
- be n-tier application consisting of controller, service and storage layer
- have unit tests for controller and service classes 
- have integration tests   
