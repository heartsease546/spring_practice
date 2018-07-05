<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Could not find the specific resources</title>
  <script type="text/javascript">
    var init_second = 10;
    function countDown() {
      init_second --;
      let second_span = document.getElementById('second_counter');
      second_span.innerHTML = '' + init_second;
      if(init_second == 1) {
        clearInterval(interval);
        window.location.href='http://localhost:9999/spring/backend/login';
      }
    }
    var interval = setInterval('countDown()', 1000);
    window.onload = function(){
      document.getElementsByTagName('a')[0].onclick = function(){
        window.location.href='http://localhost:9999/spring/backend/login';
        console.log('click click click');
      };
    };
  </script>
  <style type="text/css">
    html {
      background: url('../pics/pika-396886-unsplash.jpg');
      background-size: cover;
    }
    body {
      margin: 0 auto;
      padding: 0; 
      width: 900px;
      height: 200px;
      font-family: Consolas;
    }
    div {
      margin: 15% auto;
      padding-top: 3%;
      height: 60%;
      background: rgba(255, 255, 255, 0.5);
      border: none;
      border-radius: 5px;
      font-size: 1.5em;
      text-align: center;
      color: #003333;
    }
    a {
      text-decoration-line: underline;
    }
    a:hover {
      color: yellow;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <div>
    Sorry, could not find the specific resources!
    <br/>
    Please check the resource address again, thanks.
    <br/>
    <span>
      After <span id='second_counter'>10</span>s will redirect to <a>login</a> page.
    </span>
  </div>
</body>
</html>