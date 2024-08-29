<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>사용자 등록</title>
</head>
<body>

  <%-- css 파일 연결 (webapp 폴더를 기준으로 경로 작성) --%>
  <link rel="stylesheet" href="/resources/css/signUp.css">

  <h1>사용자 등록</h1>

  <form action="/signUp" method="POST" id="signUpForm">
    <div>
      ID : <input type="text" name="userId" id="userId">

      <%-- 아이디 중복 여부 확인해서 메시지 출력 --%>
      <span id="check"></span>
    </div>
    <div>
      PW : <input type="password" name="userPw">
    </div>
    <div>
      Name : <input type="text" name="userName">
    </div>
    <div> 
      <button>등록</button>
    </div>
  </form>


  <%-- js 파일 연결 (webapp 폴더를 기준으로 경로 작성) --%>
  <script src="resources/js/signUp.js"></script>
</body>
</html>