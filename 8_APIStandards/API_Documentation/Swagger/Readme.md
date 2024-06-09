# Introduction
- [Swagger](https://swagger.io/) can be used for API development (to specify API skeleton, request, response body etc.) and documentation.

# Key Components
- [Open API Specification](OpenAPISpec.md) (formerly called Swagger Specification)
- [Swagger Editor](https://editor-next.swagger.io/)

# API Development Steps (with GoLang)

## Step1 - Create Swagger Annotation (swagger.json)
- [operationId](https://swagger.io/docs/specification/paths-and-operations/) is an optional unique string used to identify an operation. 
- If provided, these IDs must be unique among all operations described in your API.

````json
{
	"consumes": [
		"application/json"
	],
	"produces": [
		"application/json"
	],
	"schemes": [
		"http",
		"https"
	],
	"swagger": "2.0",
	"info": {
		"description": "this is the example api",
		"title": "Example Service API.",
		"termsOfService": "TOS",
		"contact": {
			"name": "Developer1",
			"email": "developer@example.com"
		},
		"license": {
			"name": "MIT",
			"url": "http://opensource.org/licenses/MIT"
		},
		"version": "0.0.1"
	},
	"host": "localhost:5550",
	"basePath": "/v1",
	"paths": {
		"/example": {
			"post": {
				"summary": "Example API",
				"operationId": "ExampleHandler",
				"parameters": [{
						"description": "Example request",
						"name": "Body",
						"in": "body",
						"schema": {
							"$ref": "#/definitions/ExampleRequest"
						}
					},
					{
						"type": "string",
						"x-go-name": "RequestToken",
						"description": "RequestToken",
						"name": "Request-Token",
						"in": "header",
						"required": true
					}
				],
				"responses": {
					"200": {
						"$ref": "#/responses/ExampleResponse"
					}
				}
			}
		},
	},
	"definitions": {
		"Account": {
			"type": "object",
			"properties": {
				"billingAddress": {
					"$ref": "#/definitions/BillingAddress"
				},
				"createdAt": {
					"type": "string",
					"format": "date-time",
					"x-go-name": "CreatedAt"
				}
			},
			"x-go-package": "github.com/package1"
		},
		"ExampleRequest": {
			"type": "object",
			"properties": {
				"account": {
					"$ref": "#/definitions/Account"
				}
			},
			"x-go-package": "github.com/package2"
		},
		"ExampleResponse": {
			"type": "object",
			"properties": {
				"data": {
					"$ref": "#/definitions/EstimateData"
				},
				"errors": {
					"type": "array",
					"items": {
						"type": "string"
					},
					"x-go-name": "Errors"
				},
				"status": {
					"type": "string",
					"x-go-name": "Status"
				}
			},
			"x-go-package": "github.com/package3"
		}
	},
	"responses": {
		"ExampleResponse": {
			"description": "example response",
			"schema": {
				"$ref": "#/definitions/ExampleResponse"
			}
		}
	}
}
````

## Step2 - Include swagger.json in router.go

````go
// NewHandler initializes the handler with required injected services along with http routes
// Does not return as it deals directly with a reference to the gin Engine
func NewHandler(c *Config) {
	// Create a handler (which will later have injected services)
	h := &Handler{
		ExampleHandler: c.ExampleHandler
	} // currently has no properties

	// setup swagger
	c.R.StaticFile("/swagger.json")
	opts := middleware.SwaggerUIOpts{SpecURL: "/swagger.json"}
	sh := middleware.SwaggerUI(opts, nil)
	c.R.GET("/docs", gin.WrapH(sh))

	// Create an account group
	g := c.R.Group("/v1")

	g.GET("/status", h.ApiStatus)

	e := g.Group("/example", VerifyRequestTokenMiddleware)
	e.POST("/", h.ExampleHandler)
}
````

## Step3 - Generate Documentation
- `swagger.yaml` can be generated from `swagger.json`, which be used for the documentation.

````script
# TBD - Command
````

