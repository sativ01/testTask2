# testTask2

Create a pull request here with the implementation of the following task:

Create a java project, that would be packed as a jar and would be have a following public API:

public interface CalculateFactorial {
    // returns factorial of n, block with exceptions might be present or not by the choice of candidate.
    Integer factorial(Integer n) <throws Exceptions >;
}
Project should have a build script (gradle or maven). Recommended to write at least one test and some javadocs.

Task can be done partially or with any additions (it is up to candidate choice).


Create Spring Boot REST API with these endpoints:
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


- parts to be present:
    - n-tier application
        - controller layer
        - service layer
        - storage layer
    - integration tets
    - unit tests
        - for controller
        - service classes
    - build system usage
        - Gradle or Maven
