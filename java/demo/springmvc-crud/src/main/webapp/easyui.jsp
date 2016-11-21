<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ include file="/common/common-jsp.jspf" %>
<title>easyui</title>
<script type="text/javascript">
	$(function() {
		alert("Jquery可以使用了!");
	});
</script>
</head>

<body>
	<div id="p" class="easyui-panel" style="width:500px;height:200px;padding:10px;" title="My Panel" 
		iconCls="icon-save" collapsible="true">
		easyUI 可以使用
	</div>
		${proPath}
</body>
</html>
