<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Heartsease - Backend Management</title>
  <link rel="stylesheet" type="text/css" href="../css/iconfont.css">
  <link rel="stylesheet" type="text/css" href="../css/frame_all.css">
  <link rel="stylesheet" type="text/css" href="../css/frame_top.css">
  <link rel="stylesheet" type="text/css" href="../css/frame_left.css">
  <link rel="stylesheet" type="text/css" href="../css/frame_right.css">
  <script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
  <script type="text/javascript" src="../js/frame_top.js"></script>
  <style type="text/css">
    #frame_right {
      float: right;
      width: 75%;
      height: 80%;
      margin-right: 2%;
    }
    #frame_bottom {
      height: 50px;
      width: 96%;
      margin: 0.5% 2% 1% 2%;
    }
  </style>
</head>
<body>
  <div id="container">
    <div class="frame" id="frame_top">
      <div id="top_left">
        <span>Backend Management</span>
      </div>
      <div id="top_right">
        <div id="person_div">
          Welcome! <span class="iconfont ali-icon-service"></span>  <span id="user_span">test</span>
          <a>Logout</a>
        </div>
        <span id="current_time_span"></span>
      </div>
    </div>
    <div class="frame" id="frame_left">
      <div id="menu_div">
        <div class="menu_div">
          <div class="iconfont ali-icon-category"></div>
          <span>MANAGEMENT</span>
        </div>
        <div class="menu_div" id="account_management_div">
          <div class="iconfont ali-icon-bussinesscard"></div>
          <a>
            Personal Details
            <span class="iconfont ali-icon-moreunfold"></span>
          </a>
        </div>
        <div class="menu_div" id="admin_management_div">
          <div class="iconfont ali-icon-service"></div>
          <a>
            Admin Management
            <span class="iconfont ali-icon-moreunfold"></span>
          </a>
        </div>
        <div class="menu_div" id="user_management_div">
          <div class="iconfont ali-icon-account"></div>
          <a>
            User Management
            <span class="iconfont ali-icon-moreunfold"></span>
          </a>
        </div>
        <div class="menu_div" id="article_management_div">
          <div class="iconfont ali-icon-form"></div>
          <a>
            Article Management
            <span class="iconfont ali-icon-moreunfold"></span>
          </a>
        </div>
        <div class="menu_div" id="comment_management_div">
          <div class="iconfont ali-icon-text"></div>
          <a>
            Comment Management
            <span class="iconfont ali-icon-moreunfold"></span>
          </a>
        </div>
      </div>
      <div id="app-2">
        <span v-bind:title="message">
          鼠标悬停几秒钟查看此处动态绑定的提示信息！
        </span>
      </div>
    </div>
    <div class="frame" id="frame_right">
      test-right
    </div>
    <div class="frame" id="frame_bottom">
      test-bottom
    </div>
  </div>
</body>
<script type="text/javascript" src="js/vue.js"></script>
<script type="text/javascript">
  var app2 = new Vue({
    el: '#app-2',
    data: {
      message: '页面加载于 ' + new Date().toLocaleString()
    }
  })
  var vm = new Vue({
  })
</script>
</html>