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
你的姓名: <input type="text" name="name" value="张三" id="name">
请输入评论内容： <input type="text" name="c" id="c">

<br>
<input type="button" value="提交" id="btn">
<hr>
<div id="result"></div>


<script>
    $("#btn").click(function () {
        // 1. 创建 xhr 对象
        const xhr = new XMLHttpRequest();

        // 2. 建立连接
        xhr.open("get", "ajax?c=" + $("#c").val() + "&name=" + $("#name").val(), false);

        // 3. 发送请求(同步请求下,等待响应返回)
        xhr.send();

        // 4. 接收响应
        $("#result").html(xhr.responseText);
    });

    setInterval(function () {
        document.getElementById("time").innerHTML = currentTime();
    }, 1000);

</script>
</body>
</html>
