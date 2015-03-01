package nl.breun;

import nl.breun.wildfly8.User;

import javax.ejb.Stateless;

@Stateless
public class UserService {

    public String sayHello(User user) {
        return "Hello " + user.getUsername();
    }
}