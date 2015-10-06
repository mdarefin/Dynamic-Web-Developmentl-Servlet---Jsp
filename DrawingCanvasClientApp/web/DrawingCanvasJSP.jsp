<%-- 
    Document   : DrawingCanvasJSP
    Created on : Oct 5, 2015, 9:16:18 PM
    Author     : WaLiD
--%>

<%@page contentType="image/jpeg" pageEncoding="UTF-8"
        import="java.awt.*,java.awt.image.*,
        com.sun.image.codec.jpeg.*,java.util.*"
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Drawing Canvas</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                drawingcanvaspackage.DrawingCanvasWS_Service service = new drawingcanvaspackage.DrawingCanvasWS_Service();
                drawingcanvaspackage.DrawingCanvasWS port = service.getDrawingCanvasWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String shapes = request.getParameter("shapeList");
                java.lang.String color = request.getParameter("colorList");

                // Create image
                int width = 200, height = 200;
                BufferedImage image = new BufferedImage(width,
                        height, BufferedImage.TYPE_INT_RGB);
// Get drawing context
                Graphics g = image.getGraphics();
// Fill background
                g.setColor(Color.white);
                g.fillRect(0, 0, width, height);
// Create random polygon
                Polygon poly = new Polygon();
                Random random = new Random();
                for (int i = 0; i < 5; i++) {
                    poly.addPoint(random.nextInt(width),
                            random.nextInt(height));
                }
// Fill polygon
                g.setColor(Color.cyan);
                g.fillPolygon(poly);
// Dispose context
                g.dispose();
// Send back image
                ServletOutputStream sos = response.getOutputStream();
                JPEGImageEncoder encoder
                        = JPEGCodec.createJPEGEncoder(sos);
                encoder.encode(image);

                // TODO process result here
                java.lang.String result = port.drawingCanvasOP(shapes, color);
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
