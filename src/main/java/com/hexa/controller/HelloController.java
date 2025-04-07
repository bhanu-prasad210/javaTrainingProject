@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Java App!";
    }
}
