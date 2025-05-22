<%@ page isELIgnored="false" %>
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


    <form action="resetform" method="post"
      class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">


      <div class="card p-4 w-100" style="max-width: 600px;">

        <div class=" text-danger d-flex justify-content-center align-items-center $font-family-base">
          <span>
            <p>${error}</p>
          </span>
        </div>
        <h1 class="text-center mb-4">Password Reset Form !!!!!!!!!</h1>
        <div class="form-group">
           <span id="Message"></span>
          <label>Email</label>
          <input type="email" placeholder="Enter Email" class="form-control" name="emailId" id="email" value="${dto}"
            onchange="checkEmail()" readonly>
          <span id="emailExists"> </span>
        </div>

        </br>


        <div class="form-group">
          <label>New Password</label>
          <input type="password" placeholder="Enter new  password" class="form-control" name="password" id="password"
            onchange="passwordEntry()">
          <span id="errorPassword"></span>

        </div>

        <div class="form-group">
                    <label>Confirm new Password</label>
                    <input type="password" placeholder="Re Enter new Password" class="form-control" name="confirmPassword"
                        id="confirmPass" onblur="confirm()">
                    <span id="errorConfirmPassword" class="text-danger"></span>
                </div>


        </br>
        <div class="form-group text-center ">
          <input type="submit" id="button" class="btn btn-primary" value="Reset">           
        </div>
    </form>


    
    <script>
      const checkEmail = async () => {

        let emailId = document.getElementById("email").value
        var button = document.getElementById("button");
        const response = await axios(" http://localhost:8080/modules/emailExist?emailId=" + emailId)

        if (emailId.length < 5) {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
          button.setAttribute("disabled", "");
        } else if (response.data == "email already exists") {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>email already exists</span>";
          button.setAttribute("disabled", "");
        } else {
          document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
          button.removeAttribute("disabled");
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


      function confirm() {
          let password = document.getElementById("password").value;
          let checkPassword = document.getElementById("confirmPass").value;
          console.log(password, checkPassword);
          var button = document.getElementById("button");

          if (password === checkPassword) {
            document.getElementById("errorConfirmPassword").innerHTML = "";
            button.removeAttribute("disabled");
          } else {
            document.getElementById("errorConfirmPassword").innerHTML = "<span style='color:red;'>Password is not  matching</span>";
            button.setAttribute("disabled", "");
          }
        }

      function reset(event) {
        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;
        var confirmPassword=document.getElementById("confirmPass").value;
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

   <footer class="footer">
      <div class="footer bg-dark py-3 mt-auto container-fluid row justify-content-center">
        <div class="col-md-6 text-center" style="color: white;">
          <p class="text-white mb-0">Copyright &copy; xworks</p>
        </div>
      </div>
    </footer>


  </body>

  </html>