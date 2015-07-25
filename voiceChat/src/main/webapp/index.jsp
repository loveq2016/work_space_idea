<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title></title>
    <script src="static/js/jquery-2.1.4.min.js"></script>
    <script src="static/js/mui.min.js"></script>
    <link href="static/css/mui.min.css" rel="stylesheet"/>
    <script>
        var page = {
            init: function () {
                $("#audio").click(function () {
                    mui.openWindow({
                        url: "audio.jsp",
                        id: "audio"
                    })
                });
            }
        };

        $(document).ready(function () {
            page.init();
        });
    </script>
</head>
<body>
<header class="mui-bar mui-bar-nav">
    <h1 class="mui-title">测试</h1>
</header>
<div class="mui-content">
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">
            <a class="mui-navigate-right" id="audio">
                test for audio
            </a>
        </li>
        <li class="mui-table-view-cell">
            <a class="mui-navigate-right">
                Item 2
            </a>
        </li>
        <li class="mui-table-view-cell">
            <a class="mui-navigate-right">
                Item 3
            </a>
        </li>
    </ul>
</div>
</body>
</html>
