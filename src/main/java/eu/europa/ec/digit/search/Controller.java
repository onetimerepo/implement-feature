package eu.europa.ec.digit.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    static class DTO {

    }

    @GetMapping("/sort")
    public String doSort(@PathVariable DTO dto) {
        return "foo";
    }
}
