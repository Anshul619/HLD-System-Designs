# Dev vs Production environment deployment

|                      | Dev                                               | Production                                     |
|----------------------|---------------------------------------------------|------------------------------------------------|
| Access               | Developers and QA only                            | End-users, public or clients                   |
| Configuration        | Allow live debugging, verbose logging, hot reload | Optimized, secure, minimal logging             |
| Performance          | Lower performance tolerances                      | High performance, fast load times              |
| Error Handling       | Stack traces, error details shown                 | Generic error messages, logs hidden from users |
| Data                 | Dummy/fake/test data                              | Real user data                                 |
| Security             | Relaxed (to ease testing)	                        | Tightened (to prevent attacks, data leaks)     |
| Build/Bundle         | Unminified, source maps included                  | Minified, tree-shaken, compressed assets       |
| Deployment Frequency | Frequent, even multiple times a day               | Infrequent, carefully planned                  |


# Build Commands

````
# Development
npm run dev

# Production
npm run build
````
