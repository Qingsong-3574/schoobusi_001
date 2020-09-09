<html >
<head>
   <#include "../comm/head.ftl">
</head>
<body>
<nav class="navbar navbar-fixed-top navbar-inverse" style="width: 180px;height: 100px;background-color: #2b542c">
    <ul class="nav">
        <li>
            <a href="#"><h4>校园营销管理系统</h4></a>
        </li>
        <li class="dropdown open">
            <a href="#">功能</a><div class="caret"></div>
            <ul class="dropdown-menu">
                <li><a href="/createUser">创建账号</a></li>
                <#if role=="0">
                <li><a href="/createbusiact">创建活动</a></li>
                </#if>
            </ul>
        </li>
    </ul>
</nav>
<div style="padding-left: 180px ;margin-top: 80px;width: 100%">
    <form action="/addActivity" method="post">
       任务名称： <input type="text" name="name"> <br/>
        开始时间<input type="text" name="begintime"><br/>
        结束时间：<input type="text" name="endtime"><br/>
        地市<input type="text" name="city"><br/>
        放号目标：<input type="text" name="target"><br/>

        <button type="submit">提交</button>
    </form>

</div>


</body>
</html>