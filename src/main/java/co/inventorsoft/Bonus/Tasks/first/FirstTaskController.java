package co.inventorsoft.Bonus.Tasks.first;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
;

@RestController
public class FirstTaskController {
    @CrossOrigin(value = "http://allowedorigin.com")
    @GetMapping("/corsAllowedOrigin")
    public String getAllowedOrigin() {
        return "corsAllowedOrigin domain response";
    }

    @CrossOrigin("http://localhost")
    @GetMapping("/localhost")
    public String getLocalhost() {
        return "localhost response";
    }
}
