# Problem
- **In 2.4.0**
![2.4.0](https://raw.githubusercontent.com/vijayansrinivasan/samples/master/springfox-test-service/in%20springfox%202.4.0.png)

- **In 2.2.2**
![2.2.2](https://raw.githubusercontent.com/vijayansrinivasan/samples/master/springfox-test-service/in%20springfox%202.2.2.png)



# Test Service
- Created to demo the issue in SpringFox 2.4.0
## Steps to Reproduce
- Run the project as spring boot application
- access the url http://localhost:8080/api-docs
  - **Response**
  ``` json
  {
  "swagger": "2.0",
  "info": {
    "description": "Developed to test SpringFox",
    "version": "1.0",
    "title": "Sample REST API",
    "license": {}
  },
  "host": "localhost:8080",
  "tags": [
    {
      "name": "admin-controller",
      "description": "Admin Controller"
    }
  ],
  "paths": {
    "/v1/accounts/{id}": {
      "get": {
        "tags": [
          "admin-controller"
        ],
        "summary": "Fetch account by Id",
        "operationId": "getAccountUsingGET",
        "consumes": [
          "application/json"
        ],
        "produces": [
          "application/json"
        ],
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "description": "accountId required",
            "required": true,
            "type": "integer",
            "format": "int64"
          }
        ],
        "responses": {
          "200": {
            "description": "The specified account has been retrieved.",
            "schema": {
              "$ref": "#/definitions/Account"
            }
          },
          "400": {
            "description": "There is a problem with a required header or with the request entity. Details about the error are provided in the response entity."
          },
          "401": {
            "description": "The user or application could not be authenticated or is not authorized to access the resource."
          },
          "403": {
            "description": "Forbidden"
          },
          "404": {
            "description": "The requested resource could not be found."
          },
          "500": {
            "description": "There was an internal server error. Additional details may be available in the response entity."
          }
        }
      }
    }
  },
  "definitions": {
    "Account": {
      "type": "object",
      "properties": {
        "id": {
          "type": "integer",
          "format": "int32"
        },
        "number": {
          "type": "string"
        }
      }
    }
  }
}
  ``` 
- Now change the springfox version in pom.xml to 2.2.2
- - Run the project as spring boot application
- access the url http://localhost:8080/api-docs
``` json
{
  "swagger": "2.0",
  "info": {
    "description": "Developed to test SpringFox",
    "version": "1.0",
    "title": "Sample REST API",
    "contact": {},
    "license": {}
  },
  "host": "localhost:8080",
  "tags": [
    {
      "name": "admin",
      "description": "admin"
    }
  ],
  "paths": {
    "/v1/accounts/{id}": {
      "get": {
        "tags": [
          "admin"
        ],
        "summary": "Fetch account by Id",
        "operationId": "getAccountUsingGET",
        "consumes": [
          "application/json"
        ],
        "produces": [
          "application/json"
        ],
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "description": "accountId required",
            "required": true,
            "type": "integer",
            "default": "0",
            "format": "int64"
          }
        ],
        "responses": {
          "200": {
            "description": "The specified account has been retrieved.",
            "schema": {
              "$ref": "#/definitions/Account"
            }
          },
          "400": {
            "description": "There is a problem with a required header or with the request entity. Details about the error are provided in the response entity."
          },
          "401": {
            "description": "The user or application could not be authenticated or is not authorized to access the resource."
          },
          "403": {
            "description": "Forbidden"
          },
          "404": {
            "description": "The requested resource could not be found."
          },
          "500": {
            "description": "There was an internal server error. Additional details may be available in the response entity."
          }
        }
      }
    }
  },
  "definitions": {
    "Account": {
      "properties": {
        "id": {
          "type": "integer",
          "format": "int32"
        },
        "number": {
          "type": "string"
        }
      }
    }
  }
}
```
