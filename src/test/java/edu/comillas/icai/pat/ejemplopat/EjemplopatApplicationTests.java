package edu.comillas.icai.pat.ejemplopat;

import edu.comillas.icai.pat.ejemplopat.DAO.User;
import edu.comillas.icai.pat.ejemplopat.DTO.Usuario;
import edu.comillas.icai.pat.ejemplopat.Repositories.UserRepository;
import edu.comillas.icai.pat.ejemplopat.controler.HealthCheckController;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.EMAIL;
import static org.h2.util.ParserUtil.VALUES;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EjemplopatApplicationTests {

	void contextLoads() {
	}

}
