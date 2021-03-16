package eu.europa.ec.digit.search;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    static class DTO {

    }

    @PostMapping("/sort")
    public String doSort(@RequestBody DTO dto) {
        return "foo";
    }
}
