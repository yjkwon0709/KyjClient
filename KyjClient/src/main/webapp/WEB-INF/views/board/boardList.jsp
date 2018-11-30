<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>BoardList</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
	<h2>게시판 목록</h2>
	<table style="border:1px solid #ccc">
		<colgroup>
			<col width="10%" />
			<col width="*" />
			<col width="15%" />
			<col width="20%" />
		</colgroup>
		
		<thead>
			<tr>
				<th scope="col">인덱스</th>
				<th scope="col">부모글 인덱스</th>
				<th scope="col">제목</th>
				<th scope="col">내용</th>
				<th scope="col">조회수</th>
				<th scope="col">삭제구분</th>
				<th scope="col">생성일자</th>
				<th scope="col">생성자 ID</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${fn:length(list) > 0}">
					<c:forEach items="${list }" var="now">
						<tr>
							<td>${row.IDX }</td>
							<td>${row.PARTENT_IDX }</td>
							<td>${row.TITLE }</td>
							<td>${row.CONTENT }</td>
							<td>${row.HIT_CNT }</td>
							<td>${row.DEL_GB }</td>
							<td>${row.CREA_DTM }</td>
							<td>${row.CREA_ID }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="8">조회된 결과가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	
</body>
</html>