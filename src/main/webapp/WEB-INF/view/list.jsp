<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/resource/index3.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-1.8.3.js"></script>
<script type="text/javascript">
	
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit()
	}
	
	function add(){
		location="add.jsp"
	}
	
</script>


</head>
<body>

	<form action="list"	method="post">
		
		<input	type="hidden"	name="pageNum">
		种类:<input	type="text"	name="tname" value="${vo.tname }">
		品牌:<input	type="text"	name="bname" value="${vo.bname }">
		单价范围:<input	type="text"	name="p1"	 value="${vo.p1 }">-<input	type="text"	name="p2" value="${vo.p2 }">
		商品名称:<input type="text"	name="name" value="${vo.name }">
		
		<button>提交</button>
	</form>

	<table>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品类别</td>
			<td>商品品牌</td>
			<td>尺寸</td>
			<td>价格</td>
			<td>数量</td>
			<td>标签</td>
			<td>图片</td>
			<td>
				操作
				<button onclick="add()">添加</button>
			</td>
		</tr>
		
		
		<c:forEach	items="${page.list }"	var="g"	varStatus="count">
			<tr>
				<td>${count.count }</td>
				<td>${g.gname }</td>
				<td>${g.ywname }</td>
				<td>
					<c:forEach items="${g.ts }" var="t">
						${t.tname }
					</c:forEach>
				</td>
				<td>
					<c:forEach	items="${g.bs }"	var="b">
						${b.bname }
					</c:forEach>
				</td>
				<td>${g.size }</td>
				<td>${g.price }</td>
				<td>${g.quantity }</td>
				<td>${g.label }</td>
				<td>${g.pic }</td>
				
			</tr>
		</c:forEach>
		
		<!-- 分页 -->
				<tr>
						<td		colspan="10">
								<button	onclick="fenye(1)">首页</button>
																		<!-- page.prePage==0?1:page.prePage -->
								<button	onclick="fenye(${page.prePage==0?1:page.prePage	})">上一页</button>
								<button	onclick="fenye(${page.nextPage==0?page.pages:page.nextPage	})">下一页</button>
								<button	onclick="fenye(${page.pages	})">尾页</button>
								第${page.pageNum }/${page.pages }页,共${page.total }条
								
						</td>
						
				</tr>
		
	</table>


</body>
</html>