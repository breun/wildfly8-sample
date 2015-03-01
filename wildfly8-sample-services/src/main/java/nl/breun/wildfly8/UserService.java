package nl.breun.wildfly8;

import javax.ejb.Stateless;

@Stateless
public class UserService {

    public String sayHello(User user) {
        return "Hello " + user.getUsername();
    }
}