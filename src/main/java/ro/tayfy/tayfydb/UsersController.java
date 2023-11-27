package ro.tayfy.tayfydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @PostMapping
    public boolean addUser(@RequestParam String username, @RequestParam String password) {
        UsersDAO usersDAO = TayfyDbApplication.appContext.getBean(UsersDAO.class);
        return usersDAO.createPerson(username, password);
    }
}
