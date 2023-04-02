/*package edu.comillas.icai.pat.ejemplopat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")
public class heroesController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/service1", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<model1[]> getHeroes() {
        final String url = "https://api.thecatapi.com/v1/images/search";
        final ResponseEntity<model1[]> response = restTemplate.getForEntity(url, Model1[].class);
        return response;
    }
}
*/