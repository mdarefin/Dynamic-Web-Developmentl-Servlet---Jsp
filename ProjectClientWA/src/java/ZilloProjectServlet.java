/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Joe
 */
@WebServlet(urlPatterns = {"/ZilloProjectServlet"})
public class ZilloProjectServlet extends HttpServlet {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String city, state, zipcode, citystatezip, address;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProjectServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Result:</h1");

            try {
                final String zwxid = "X1-ZWz1ezjav5j5sb_1pt0f";
                address = request.getParameter("address");

                city = request.getParameter("city");
                state = request.getParameter("state");
                zipcode = request.getParameter("zipcode");
                if (zipcode == "") {
                    citystatezip = city + " " + state;
                } else {
                    citystatezip = zipcode;
                }
                out.println("<br/>Address: <br/>" + address + ", " + citystatezip);
                address = address.replace("+", "%2B");
                citystatezip = citystatezip.replace(",", "%2C");

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse("http://www.zillow.com/webservice/GetSearchResults.htm?zws-id=" + zwxid + "&address=" + address + "&citystatezip=" + citystatezip);
                int errorCode = Integer.parseInt(getInfo(doc, "code", false));
                String text = getInfo(doc, "text", false);

                out.println("<br/>Code:" + errorCode + "&nbsp;" + text);

                if (errorCode != 0) {
                    throw new Exception("");
                }

                String amount = getInfo(doc, "amount", true);
                String lastUpdated = getInfo(doc, "last-updated", false);
                String low = getInfo(doc, "low", true);
                String high = getInfo(doc, "high", true);
                out.println("<br/>Zestimate: " + amount
                        + "<br/>Last Updated:" + lastUpdated
                        + "<br/>Low:" + low
                        + "<br/>High:" + high);
                String zpid = getInfo(doc, "zpid", false);
                Document docGetChart = builder.parse("http://www.zillow.com/webservice/GetChart.htm?zws-id=" + zwxid + "&unit-type=percent&zpid=" + zpid + "&width=300&height=150");
                String url = getInfo(docGetChart, "url", false);
                out.println("<br><img src=\"" + url + "\"" + ">");
                out.println("<script>\n"
                        + "function goBack() {\n"
                        + "    window.history.back();\n"
                        + "}\n"
                        + "</script><br/>");
                out.println("<button onclick=\"goBack()\">Go Back</button>");
            } catch (Exception ex) {

            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getInfo(Document doc, String info, boolean isNum) {
        String temp = doc.getElementsByTagName(info).item(0).getTextContent();
        //Element item = (Element) list.item(0);
        //String result = item.getFirstChild().getNodeValue();
        if (isNum) {
            int num = Integer.parseInt(temp);
            temp = formatter.format(num);
        }
        return temp;
    }

}
