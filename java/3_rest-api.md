
# Creating Your First REST API Endpoint

Now let's make our Spring Boot application do something interesting – create a REST API.

**What is a REST API?**

Imagine you are ordering food at a restaurant.

* **You (the Client):**  You look at the menu and decide what you want (e.g., "I want a burger"). You tell the waiter your order. This is like making a **request** to the API.
* **The Waiter (the API):** The waiter takes your order and goes to the kitchen. The waiter is like the **interface** or the "API" that connects you to the kitchen.
* **The Kitchen (the Server/Application):** The kitchen prepares your burger. This is like the **application** that processes your request.
* **The Waiter brings you the Burger (the Response):** The waiter brings you back your burger. This is like the **response** from the API – the data you requested.

A REST API (Representational State Transfer Application Programming Interface) is a way for different computer programs to talk to each other over the internet using standard web requests.  It's commonly used for web applications to communicate with servers and exchange data.

**Creating a Simple REST API Endpoint in Spring Boot**

We'll create a very simple endpoint that will respond with a greeting when you access it in a web browser.

1. **Create a Controller Class:**
   - In your IntelliJ IDEA project, in the `src/main/java/com/example/myfirstspringbootapp` package, right-click and select `New` -> `Java Class`.
   - Name the class `HelloController` and click "OK".

2. **Add Annotations and Code:**
   - Open the `HelloController.java` file.
   - Replace the code with the following:

   ```java
   package com.example.myfirstspringbootapp;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RequestMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController // This tells Spring that this class is a REST Controller
   @RequestMapping("/hello") // This sets the base path for all endpoints in this controller to "/hello"
   public class HelloController {

       @GetMapping // This annotation maps HTTP GET requests to this method
       public String sayHello() {
           return "Hello from Spring Boot!"; // This is the response that will be sent back
       }
   }
   ```

**Test Your REST Endpoint in a Web Browser**

Run you spring boot application. Open your web browser (like Chrome, Firefox, Safari, etc.).
In the address bar, type: http://localhost:8080/hello and press Enter.   
You should see the text: Hello from Spring Boot! displayed in your browser!
Congratulations! You've created your first REST API endpoint in Spring Boot! 🎉 You just made your application respond to web requests!   


**Making the Endpoint More Dynamic - Adding a Parameter**

Let's make our greeting a bit more personalized. We'll add a parameter to the endpoint so you can say hello to a specific name.

- Modify the sayHello() method in HelloController.java:
- Change the sayHello() method to accept a parameter named name.
- Add the @RequestParam annotation to tell Spring Boot to get the value for name from the web request parameters.

Add Following packages to import
```java
import org.springframework.web.bind.annotation.RequestParam; // Import for @RequestParam
```

Update the sayHello method as below:
```java
    @GetMapping
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) { // Added @RequestParam and parameter
        return "Hello, " + name + "!"; // Personalized greeting
    }
```
> Explanation of the Changes:

*@RequestParam(value = "name", defaultValue = "World") String name:
@RequestParam tells Spring Boot to expect a parameter in the web request.
value = "name" specifies that the parameter's name in the URL will be "name".
defaultValue = "World" sets a default value of "World" if the name parameter is not provided in the request.
String name: This declares a String variable named name to store the value of the parameter.*

Run Your Spring Boot Application Again.

Test the Updated Endpoint in a Web Browser:

Try these URLs in your browser and see what happens:
http://localhost:8080/hello (You should see: Hello, World!, because of the default value)
http://localhost:8080/hello?name=Sharu (You should see: Hello, Sharu!)
http://localhost:8080/hello?name=Lady (You should see: Hello, Lady!)

You've now created a REST API endpoint that can take input and provide a dynamic response! 