<html >
<head>
    <#include "../comm/head.ftl">
</head>
<body>
<#include "../comm/nav.ftl">
<div style="padding-left: 180px ;margin-top: 80px;width: 100%">
    <form class="" action="/mainList" method="post">
        用户：<input class="" size="20" name="name">
        <button class="" type="submit"> 提交</button>
    </form>
    <table class="table table-condensed table-bordered">
        <thead>
        <tr>
            <th>活动名称</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>地市</th>
            <th>投放目标</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#if content??>
        <#list content as users>
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.begintime}</td>
            <td>${users.endtime}</td>
            <td>${users.city}</td>
            <td>${users.target}</td>
            <td></td>
        </tr>
        </#list>
    </#if>

    </tbody>
    </table>

</div>

</body>
<script>
   /* var webSocket ;
    webSocket=new WebSocket("ws://localhost:8081/ws/001");
    webSocket.onmessage=function (msg) {
        alert(msg);
        $("#noticeMsg").val(msg.data);
    }
    window.onbeforeunload=function (ev) {
        webSocket.close();
    }*/
    //window.onbeforeunload
</script>
</html>