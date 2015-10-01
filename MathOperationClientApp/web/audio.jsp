<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page contentType="audio/mpeg3" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <!--        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>White Noise</title>
        <style>
            body  {
                background-image: url("images/snowfall.gif");
                background-color: #cccccc;
                color: #D8D8D8;
            }
        </style>
    </head>
    <body>
        <br><br>
        <h1>Animal audio</h1>
        <br>

        Lion Roaring
        <audio controls="controls"> 
            <c:choose>
                <source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176879_1/courses/NYT01_CST_4713_D770_1159_1/ElephantBaby-Mother_reunion.mp3" />
                  <!-- else if condition --> 
            </c:choose>
        
        </audio> 
        Tiger Roaring
         <audio controls="controls"> 
            <c:choose>
                <source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176881_1/courses/NYT01_CST_4713_D770_1159_1/Tiger%20Roar.mp3" />
                  <!-- else if condition --> 
            </c:choose>
        
        </audio>
        Tiger 
        <audio controls="controls"> 
            <c:choose>
                <source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176879_1/courses/NYT01_CST_4713_D770_1159_1/ElephantBaby-Mother_reunion.mp3" />
                  <!-- else if condition --> 
            </c:choose>
        
        </audio>
<!--             <c:when test="${"Lion Roaring"}"></c:when>  if condition 
                <c:when test="${"Tiger Roaring"}"><source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176881_1/courses/NYT01_CST_4713_D770_1159_1/Tiger%20Roar.mp3" /></c:when>  else if condition 
                <c:when test="${"Tiger Roaring"}"><source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176879_1/courses/NYT01_CST_4713_D770_1159_1/ElephantBaby-Mother_reunion.mp3" /></c:when> -->
    </body>
</html>