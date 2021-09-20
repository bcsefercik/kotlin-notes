# Kotlin + Spring Boot Notes
## https://spring.io/guides/tutorials/spring-boot-kotlin/

- One of Kotlin’s key features is null-safety - which cleanly deals with null values at compile time rather than bumping into the famous `NullPointerException` at runtime. This makes applications safer through nullability declarations and expressing "value or no value" semantics without paying the cost of wrappers like `Optional`. 

- Spring provides null exception avoidance. This feature can be enabled by adding the `-Xjsr305` compiler flag with the strict options.

- `jackson-module-kotlin` adds support for serialization/deserialization of Kotlin classes and data classes (single constructor classes can be used automatically, and those with secondary constructors or static factories are also supported)

- `src/main/kotlin/com/example/blog/BlogApplication.kt`: Compared to Java, you can notice the lack of semicolons, the lack of brackets on empty class (you can add some if you need to declare beans via @Bean annotation) and the use of runApplication top level function. `runApplication<BlogApplication>(*args)` is Kotlin idiomatic alternative to `SpringApplication.run(BlogApplication::class.java, *args)` and can be used to customize the application with following syntax.
    
## First Controller
`src/main/kotlin/com/example/blog/HtmlController.kt`
-  we import the `org.springframework.ui.set` extension function in order to be able to write `model["title"] = "Blog"` instead of `model.addAttribute("title", "Blog")`.

We also need to create the associated Mustache templates.
`src/main/resources/templates/header.mustache`
`src/main/resources/templates/footer.mustache`
`src/main/resources/templates/blog.mustache`

```kotlin
@Controller
class HtmlController {
    @GetMapping("/")  // url route
    fun blog(model: Model): String {
        model["title"] = "BCS Blog"  //data to be used in template
        return "blog"  // template name
    }
}
```

- Test files are located under `src/test/kotlin/<package>/<file>`

## JUnit 5 - Integration Tests
For the sake of this example, let’s create an integration test in order to demonstrate various features:

- We use real sentences between backticks instead of camel-case to provide expressive test function names
- JUnit 5 allows to inject constructor and method parameters, which is a good fit with Kotlin read-only and non-nullable properties
- This code leverages getForObject and getForEntity Kotlin extensions (you need to import them)

- Here we don’t use `data` classes with `val` properties because JPA is not designed to work with immutable classes or the methods generated automatically by `data` classes. If you are using other Spring Data flavor, most of them are designed to support such constructs so you should use classes like `data class User(val login: String, …)` when using Spring Data MongoDB, Spring Data JDBC, etc.

- While Spring Data JPA makes it possible to use natural IDs (it could have been the login property in User class) via Persistable, it is not a good fit with Kotlin due to KT-6653, that’s why it is recommended to always use entities with generated IDs in Kotlin.










