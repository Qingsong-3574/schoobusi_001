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
            <th>用户id</th>
            <th>用户名称</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#if content??>
        <#list content as users>
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.createtime}</td>
            <td></td>
        </tr>
        </#list>
    </#if>

    </tbody>
    </table>
    <ul class="pagination pull-right">
        <#if curPage lte 1>
        <li  class="disabled"><a href="#" disabled="true">上一页</a></li>
        <#else>
        <li><a href="/mainList?page=${curPage-1}">上一页</a></li>
    </#if>
    <#list 1..total as index>
    <li><a href="mainList?page=${index}">${index}</a></li>
</#list>
<#if curPage gte total>
<li><a href="#" disabled="true">下一页</a></li>
<#else>
<li><a href="/mainList?page=${curPage+1}">下一页</a></li>
</#if>

</ul>
</div>

</body>
<script>
    var webSocket ;
    webSocket=new WebSocket("ws://localhost:8081/ws/001");
    webSocket.onmessage=function (msg) {
        alert(msg);
        $("#noticeMsg").val(msg.data);
    }
    window.onbeforeunload=function (ev) {
        webSocket.close();
    }
    //window.onbeforeunload
</script>
</html>