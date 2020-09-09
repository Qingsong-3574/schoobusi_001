<html >
<head>
   <#include "../comm/head.ftl">
</head>
<body>
<#include "../comm/nav.ftl">
<div style="padding-left: 180px ;margin-top: 80px;width: 100%">
    <form action="/adduser" method="post">
       用户名： <input type="text" name="name"> <br/>
        OA<input type="text" name="oa"><br/>
        联系电话：<input type="text" name="tel"><br/>
        省份：<input type="text" name="province"><br/>
        地市<input type="text" name="city"><br/>
        角色：<select name="role">

             <#if role == "0">
                <option value="1">省级管理员</option>
             </#if>
                <option value="1">地市管理员</option>
                <option value="2">营销经理</option>


        </select>
        <button type="submit">提交</button>
    </form>

</div>


</body>
</html>