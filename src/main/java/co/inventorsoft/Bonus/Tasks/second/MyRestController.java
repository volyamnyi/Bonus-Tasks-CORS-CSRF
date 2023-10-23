package co.inventorsoft.Bonus.Tasks.second;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @PostMapping("/submit")
    public String handleFormSubmission(CsrfToken csrfToken) {
        return csrfToken != null ? "CSRF token is taken. " + csrfToken.getToken() : "CSRF token is not present.";
    }
}
