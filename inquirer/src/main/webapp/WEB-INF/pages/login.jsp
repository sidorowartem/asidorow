<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inquirer login</title>
    <%-- libs section --%>
    <link rel="stylesheet" href="resources/css/bootstrap/bootstrap.css">
    <link rel="stylesheet" href="resources/css/bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="resources/css/bootstrap/signin.css">

    <script type="text/javascript" src="resources/libs/jquery-2.1.3.js"></script>
    <script type="text/javascript" src="resources/libs/bootstrap.js"></script>
</head>
<body>

<div class="container">
    <form class="form-signin">
        <h2 class="form-singin-header">Please, sign in</h2>
        <label for="username">Username</label>
        <input type="text" id="username" placeholder="Username" class="form-control" required autofocus/>
        <label for="password">Password</label>
        <input type="password" id="password" placeholder="Password" class="form-control" required/>
        <button class="btn btn-block btn-primary btn-large" type="submit">Sign in</button>
    </form>
</div>

</body>
</html>
