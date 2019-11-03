/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author didi
 */
@WebServlet(name = "ShowStudentServelet", urlPatterns = {"/ShowStudentServelet"})
public class ShowStudentServelet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String id = request.getParameter("id");
        Student student = Student.getStudent(id);
        
        if (student == null) {
            request.setAttribute("student", student);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/score-report/UnknownStudent.jsp");
            rd.forward(request, response);
        }else if (student.getScore() < 50) {
            request.setAttribute("student", student);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/score-report/LowScore.jsp");
            rd.forward(request, response);
        }else if (student.getScore() > 70) {
            request.setAttribute("student", student);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/score-report/HighScore.jsp");
            rd.forward(request, response);
        }else {
            request.setAttribute("student", student);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/score-report/NormalBalance.jsp");
            rd.forward(request, response);            
        }
    }
}
