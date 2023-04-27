package edu.comillas.icai.pat.ejemplopat;

import edu.comillas.icai.pat.ejemplopat.DAO.User;
import edu.comillas.icai.pat.ejemplopat.Repositories.UserRepository;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import edu.comillas.icai.pat.ejemplopat.service.impl.MyServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Tests {
    @Autowired
    MyService myService;


    @Test
    public void User_ok(){

        User U=new User(2,"apodo","nombre", "apellido","correo");
        myService.SetUSER(U);
        assertEquals(1,myService.findUser(U));
    }

    public void User_NOT_Ok()
    {

        User U=null;
        assertEquals(-1,myService.findUser(U));
    }
    public void Api_OK()
    {
        Object o=myService.getHealthCheck("https://api.thecatapi.com/v1/images/search");
        assertEquals(true,(o!=null));
    }
}