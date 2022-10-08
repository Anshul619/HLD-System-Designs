# OpenAPI
- [OpenAPI Specification](https://swagger.io/docs/specification/about/) (formerly [Swagger](Readme.md) Specification) is an API description format for [REST APIs](../../REST.md). 
- API specifications can be written in [YAML](https://en.wikipedia.org/wiki/YAML) or [JSON](https://www.w3schools.com/js/js_json_intro.asp).

An OpenAPI file allows you to describe your entire API, including:
- Available endpoints (`/users`) and operations on each endpoint (`GET /users`, `POST /users`)
- Operation parameters - Input and output for each operation
- Authentication methods
- Contact information, license, terms of use and other information.

# Basic Structure

````yaml
    openapi: 3.0.0
    info:
      title: Sample API
      description: Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
      version: 0.1.9
    servers:
      - url: http://api.example.com/v1
        description: Optional server description, e.g. Main (production) server
      - url: http://staging-api.example.com
        description: Optional server description, e.g. Internal staging server for testing
    paths:
      /users:
        get:
          summary: Returns a list of users.
          description: Optional extended description in CommonMark or HTML.
          responses:
            '200':    # status code
              description: A JSON array of user names
              content:
                application/json:
                  schema: 
                    type: array
                    items: 
                      type: string
````



