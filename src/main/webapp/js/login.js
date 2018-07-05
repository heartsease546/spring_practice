window.onload = function() {

  var eye_open_close = new Vue({
    el: '#eye_pic',
    data: {},
    methods: {
      displayPsw: function() {
        let eye = document.getElementById('eye_pic');
        let psw_input = document.getElementsByName('account_psw')[0];
        if (eye.getAttribute('class') == 'eye_close') {
          eye.setAttribute('title', 'Display Password');
          eye.setAttribute('class', 'eye_open');
          psw_input.setAttribute('type', 'text');
        } else {
          eye.setAttribute('title', 'Hide Password');
          eye.setAttribute('class', 'eye_close');
          psw_input.setAttribute('type', 'password');
        }
      }
    }
  });

  var login = new Vue({
    el: 'input[type="submit"]',
    data: {

    },
    methods: {
      login: function() {
        let account = document.getElementsByName('account_txt')[0].value;
        let password = document.getElementsByName('account_psw')[0].value;
        console.log(account + ', ' + password);
        axios.post(
          'http://localhost:9090/spring/backend/login',
          {
            txt_account: account,
            txt_password: password
          },
          {
            header: {
              'Content-Type': 'application/json'
            }
          }).then(function(response){
            console.log(response);
          }
        )
      }
    }
  });
  console.log(login);
}
// $(function() {
//   $('#input_div div span').click(function(){
//     if ($(this).hasClass('eye_close') == true) {
//       $('input[name="account_psw"]').prop('type', 'text');
//       $(this).prop('title', 'Display Password');
//       $(this).removeClass('eye_close');
//       $(this).addClass('eye_open');
//     } else {
//       $('input[name="account_psw"]').prop('type', 'password');
//       $(this).prop('title', 'Hide Password');
//       $(this).removeClass('eye_open');
//       $(this).addClass('eye_close');
//     }
//   });
// })