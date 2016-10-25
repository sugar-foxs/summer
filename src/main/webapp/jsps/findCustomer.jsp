<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-15
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>id查找用户</title>
    <%--<script src="../js/jquery.validate.min.js"></script>--%>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../js/jquery-3.0.0.min.js"></script>
    <script type="text/javascript" src="../js/findCustomer.js"></script>
</head>
<body>

    <center>
    <input type="text" placeholder="请输入用户id" id="customerid" name="customerid"/>
    <input type="button" value="查询" id="query" onclick="javascript:butOnclick();"/>
    </center>


<div class="row">
    <div class="col-sm-10 col-sm-offset-1">
        <table style="width:100%;border: 1px solid">
            <thead>
            <tr style="background-color: #215867;text-align: center;">
                <%--<td><span style="color: white">用户地址</span></td>--%>
                <td><span style="color: white">用户邮箱</span></td>
                <td><span style="color: white">用户id</span></td>
                <td><span style="color: white">用户姓名</span></td>
                <td><span style="color: white">用户密码</span></td>
                <td><span style="color: white">用户电话</span></td>
                <td>&nbsp;</td>
            </tr>
            </thead>
            <tbody id="list" style="text-align: center">
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
