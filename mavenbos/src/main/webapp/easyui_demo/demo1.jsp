<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 先引入 jquery的 js -->
<script type="text/javascript" 
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js">
</script>
<!-- 引入 easyui的js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<!-- 引入国际化 js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<!-- 引入 默认样式 css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css"/>
<!-- 引入 icon图标 css  -->
<link rel="stylesheet" 
type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css"/>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',title:'北部'" style="height:100px;">北</div>
	<div data-options="region:'south'" style="height:100px;">南</div>
	<div data-options="region:'west'" style="width:100px;">西</div>
	<div data-options="region:'center'" >中</div>
	<div data-options="region:'east'" style="width:100px;">东</div>
</body>
</html>