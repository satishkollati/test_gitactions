import org.springframework.web.bind.annotation.GetMapping;

@RestConroller
public class UserController {
    @GetMapping
   public String test_git_actions(){
    return "hello world";

   } 
}