package nl.breun.wildfly8;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/sample", name="hello-sample")
public class SampleServlet extends HttpServlet {

    @EJB
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = new User();
        user.setUsername("Test User");

        String message = userService.sayHello(user);

        resp.getWriter().println(message);
    }
}