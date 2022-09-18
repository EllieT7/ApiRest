package bo.edu.ucb.security.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/v1/api/security")
public class SecurityApi{
    @PostMapping(path = "/username")
    public Map<String,String> validateUserName(@RequestBody Map<String, String> body){
        Map<String, String> result = new HashMap<>();
        System.out.println(body.get("username"));
        result.put("statusCode","SCTY-0000");
        result.put("result", "OK");
        result.put("errorDetail", null);
        return result;
    }
}