<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>同步版本</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/time.js"></script>
</head>
<body>
<h3 id="time" style="float:right;margin-top:0;margin-right: 20px;"></h3>
<video src="video/hashmap.mp4" controls width="600"></video>


<br>
<form action="original">
    你的姓名: <input type="text" name="name" value="张三" id="name">
    请输入评论内容： <input type="text" name="c" id="c">

    <br>
    <input type="submit" value="提交" id="btn">
</form>
<hr>
<div id="result">${result}</div>

</body>
</html>
