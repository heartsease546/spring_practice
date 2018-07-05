<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome to login Heartsease backend!</title>
  <link rel="stylesheet" type="text/css" href="../css/login.css">
  <script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
  <script type="text/javascript" src="../js/vue.js"></script>
  <script type="text/javascript" src="../js/axios.js"></script>
  <script type="text/javascript" src="../js/login.js"></script>
</head>
<body>
  <div id="input_div">
    <div>
      <input type="text" name="account_txt" placeholder="        Account" title="Please input your account">
    </div>
    <div>
      <input type="password" name="account_psw" placeholder="        Password" title="Please input your password">
      <span id="eye_pic" class="eye_close" title="Hide Password" @click="displayPsw"></span>
    </div>
    <div>
      <input type="submit" name="login" value="Login" title="Login" @click="login">
    </div>
  </div>
</body>
</html>