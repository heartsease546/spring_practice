function displayCurrentTime() {
  $('#current_time_span').text('');
  current_time = new Date();
  year = current_time.getFullYear();
  month = current_time.getMonth();
  date = current_time.getDate();
  day = current_time.getDay();
  hour = current_time.getHours();
  minute = current_time.getMinutes();
  second = current_time.getSeconds() + 1;
  monthArr = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  dayArr = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
  $('#current_time_span').text(date + " " + monthArr[month] + ", " + year + "  " + dayArr[day] + "  " + hour + ":" + minute + ":" + second);
}
setInterval('displayCurrentTime()', 1000);