package Servl;

import Disp.Dispatcher;
import by.googlemapid.sample.DirectionSample;
import org.json.JSONException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;


@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String str = request.getParameter("textinput");
        int AA=0;
        String SSS="Россия, Москва, улица Кульнева 3";

        try {
          AA = Dispatcher.doDistance(SSS);// в идеале должен принимать str а не   sss
        } catch (JSONException e) {

           e.printStackTrace();
       }

        //AA =  DirectionSample.main(str);



        String srt = AA+"";
        //String srt =    Arrays.toString(Disp.doNewRouteArray(A, Main.lis(str)));

        session.setAttribute("inputtext",str+srt);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/showsession.jsp");
        dispatcher.forward(request,response);
    }
}
