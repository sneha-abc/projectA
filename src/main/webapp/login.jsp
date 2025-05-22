<!-- <%@ page isELIgnored="false" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>common-modules</title>
    <link rel="icon" href="https://www.x-workz.in/Logo.png">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  </head>

  <body>
    <div class="d-flex justify-content-between align-items-center p-3">
      <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">

    </div>
    <hr color="black">


    <form action="loginform" method="post" onclick="login()"
      class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">


      <div class="card p-4 w-100" style="max-width: 600px;">

        <div class=" text-danger d-flex justify-content-center align-items-center $font-family-base">
          <span>
            <p>${message}</p>
          </span>
        </div>
         <span id="Message"></span>
        <h1 class="text-center mb-4">Log in!!!!!!!!</h1>
        <div class="form-group">
          
          <label>Email</label>
          <input type="email" placeholder="Enter Email" class="form-control" name="emailId" id="email" value="${dto}"
            onchange="checkEmail()" required>
          <span id="emailExists" class="text-danger"> </span>
        </div>

        </br>


        <div class="form-group">
          <label>Password</label>
          <input type="password" placeholder="Enter password" class="form-control" name="password" id="password"
            onchange="passwordEntry()">
          <span id="errorPassword" class="text-danger"></span>

        </div>

        </br>
        <div class="form-group text-center ">
          <input type="submit" id=button class="btn btn-primary" value="Submit">
          <input type="reset" class="btn btn-secondary" value="Reset">
          </br>
          <a href="forgot">forgot password</a>
        </div>
    </form>


    <footer class="bg-secondary py-3 mt-5">
      <div class="container">
        <div class="row text-center text-md-left">
          <div class="col-md-4 offset-md-4 mb-2 mb-md-0 d-flex justify-content-center">
            <span> &#169; xworks.</span>
          </div>
          <div class="col-md-4 d-flex justify-content-md-end justify-content-center">
            <span id="datetime" class="text-muted"></span>
          </div>
        </div>
      </div>
    </footer>

    <script>
      const checkEmail = async () => {

        let emailId = document.getElementById("email").value;
        console.log(emailId);
        var button = document.getElementById("button");
        const response = await axios(" http://localhost:8080/modules/emailExist?emailId=" + emailId)

        if (emailId.length < 5) {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
          button.setAttribute("disabled", "");
        } else if (response.data == "email already exists") {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>email already exists</span>";
          button.removeAttribute("disabled");
        } else {
          document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
          button.setAttribute("disabled","");
        }
        console.log(response.data)

      }

      function passwordEntry() {

        var names = document.getElementById("password").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length >= 2 && names.length <= 20) {
          document.getElementById("errorPassword").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("errorPassword").innerHTML = "<span style='color:red;'>character shld be more thn 8  </span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }


      function login(event) {
        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;
        var button = document.getElementById("button");

        if (
          email.trim() !== "" &&
          password.trim() !== "" && password.length >= 2
        ) {
          document.getElementById("Message").innerHTML = "";
          button.removeAttribute("disabled");
        }
        else {
          document.getElementById("Message").innerHTML = "<span style='color:red;'>Please fill the form correctly</span>";
          button.setAttribute("disabled", "");
        }


      }
    </script>

  </body>

  </html> -->


  <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LoginPage</title>
    <link rel="icon" href="https://www.x-workz.in/Logo.png">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
  <header class="bg-dark text-white"> 
    <div class="d-flex justify-content-between align-items-center p-3">
        <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">
         
      </div>
      <hr color="black">

  </header>

      <form  action="loginform" method="post" onclick="login()"
        class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">

         
        <div class="card p-4 w-100" style="max-width: 600px;">
           <div class="d-flex justify-content-center align-items-center text-danger fst-italic">
                 <span>
                    <p>${message}</p>
                 </span>
           </div>
           <span id="Message"></span>
            
            <h1 class="text-center mb-4">Log in!!!!!!!!</h1>
            <div class="form-group">
                <label>Email</label>
                <input type="email" placeholder="Enter Email" class="form-control" name="emailId" id="email"  onchange="checkEmail()" value="${dto}" required>
            </div>
            <span id="emailExists" class="text-danger"></span>
            
            </br>
            
 
            <div class="form-group">
                <label>Password</label>
                <input type="password" placeholder="Enter password" class="form-control" name="password" id="pass" onchange="passwordd()" required>
                <span id="pasword" class="text-danger"></span>
            </div>
            
            </br>
            <div class="form-group text-center p-3 ">
                <input type="submit" id="button" class="btn btn-primary" value="Submit">
                <input type="reset" class="btn btn-secondary" value="Reset">
                </br>
                <a href="forgot">forgot password</a>
            </div>
        </div>
        
    </form>
    
      
      <script>
         const checkEmail = async () => {

          let emailId = document.getElementById("email").value;
          console.log(emailId);
          var button = document.getElementById("button");
          const response = await axios("http://localhost:8080/modules/emailExist?emailId="+ emailId)

          if (emailId.length < 5) {
            document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
            button.setAttribute("disabled", "");
          } else if (response.data == "email is exist") {
            document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
            button.removeAttribute("disabled");
          } else {
            document.getElementById("emailExists").innerHTML = "<span style='color:red;'>enter correct email</span>";
            button.setAttribute("disabled", "");
          }
          console.log(response.data)

        }

        function passwordd() {

          var names = document.getElementById("pass").value;
          console.log(names)
          var button = document.getElementById("button");

          if (names.trim() !== '' && names.length >= 3 && names.length <= 20) {
            document.getElementById("pasword").innerHTML = "";
            button.removeAttribute("Disabled");
          } else {
            document.getElementById("pasword").innerHTML = "<span style='color:red;'>Enter valid password</span>";
            button.setAttribute("Disabled", "");
            return;
          }
        }

        
        function login(event) {


          var email = document.getElementById("emailId").value;
          var password = document.getElementById("password").value;
          var button = document.getElementById("button");


          if (
            email.trim() !== "" &&
            password.trim() !== "" && password.length >= 3
          ) {
              document.getElementById("Message").innerHTML = "";
              button.removeAttribute("disabled");
            } 

          else {
            document.getElementById("Message").innerHTML = "<span style='color:red;'>Please fill the form correctly</span>";
            button.setAttribute("disabled", "");
          }
        }

      </script>

     <footer class="bg-dark py-3 mt-auto">
      <div class="footer bg-dark py-3 mt-auto container-fluid row justify-content-center">
        <div class="col-md-6 text-center" style="color: white;">
          <p class="text-white mb-0">Copyright &copy; xworks</p>
        </div>
      </div>
    </footer>
</body>
</html>