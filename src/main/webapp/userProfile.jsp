<%@ page isELIgnored="false" %>

  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register-Page</title>
    <link rel="icon" href="https://www.x-workz.in/Logo.png">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>



  </head>

  <body>
<header class="bg-dark text-white"> 
    <div class="d-flex justify-content-between align-items-center p-3">
      <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">
       
      <div>
        <button type="button" class="btn btn-info"><a href="index">Home</a></button>
      </div>
    </div>

    <hr color="black">

    </header>



    <form action="update" method="post" onclick="form()"
      class=" shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center  min-vh-100"
      enctype="multipart/form-data">
       
      <div class="card p-4 w-100" style="max-width: 600px;">


        <!-- <div>
                    <span>
                        <p class="text-success d-flex justify-content-center align-items-center">${message}</p>
                    </span>
                </div>

                <div>
                    <span>
                        <p class=" text-danger d-flex justify-content-center align-items-center $font-family-base ">
                            ${error}</p>
                    </span>
                </div> -->
        <h1 class="text-center mb-4">Welcome to profile</h1>

        <div class="text-center">
        <img src="image?fileName=${detail.fileName}" style="height: 150px; width: 150px; border-radius: 50px;">
      </div>

        <div>

          <input type="text" class="form-control" value=${detail.id} name="id" hidden>
        </div>
        <span id="Message"></span>
        <div class="form-group">
          <label>FirstName</label>
          <input type="text" class="form-control" id="fName" name="firstName" value=${detail.firstName}
            onchange="fNameValidation()" required>

          <span id="Firstname"></span>

        </div>
        </br>
        <div class="form-group">
          <label>LastName</label>
          <input type="text" class="form-control" id="lName" name="lastName" value=${detail.lastName}
            onchange="lNameValidation()" required>
          <span id="Lastname"> </span>
        </div>
        </br>
        <div class=" form-group">
          <label>Email</label>
          <input type="email" class="form-control" id="email" name="emailId" value=${detail.emailId}
            onblur="checkEmail()" readonly>
          <span id="emailExists"> </span>
        </div>

        </br>
        <div class="form-group">
          <label>ContactNumber</label>
          <input type="number" class="form-control" id="contactNo" value=${detail.contactNumber} name="contactNumber"
            onblur="phone()" required>
          <span id="ph"> </span>
        </div>
        </br>

        <div class="form-group">
          <label>city</label>
          <input type="text" class="form-control" id="cityName" name="city" value=${detail.city} onchange="cityNamee()"
            required>
          <span id="Cityname" class="text-danger"> </span>
        </div>
        <br>
        <div>
          <label>Gender</label><br />
          male<input name="gender" id="male" value="male" type="radio" />
          female<input name="gender" id="female" value="female" type="radio" />
          <span id="genderError"> </span>
        </div>
        <br>


        <div class="form-group">
          <label>Password</label>
          <input type="password" class="form-control" id="password" value=${detail.password} name="password"
            onchange="passwordEntry()">
          <span id="errorPassword"></span>
        </div>
        </br>


        <div>
          <label>upload file</label>
          <input type="file" name="file" /><br />
        </div>
        <br>

        <div class="form-group text-center">
          <input type="submit" class="btn btn-primary" value="Edit" id="button">
          <button type="button" class="btn btn-primary mr-2 " name="${detail.firstName}"><a
              href="back?emailId=${detail.emailId}">Back</a> </button>
        </div>
    </form>


    

    <script>
      function fNameValidation() {
        var names = document.getElementById("fName").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length > 3 && names.length <= 20) {
          document.getElementById("Firstname").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("Firstname").innerHTML = "<span style='color:red;'>character shld be more thn 5 and less thn 20</span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }

      function lNameValidation() {
        var names = document.getElementById("lName").value;
        console.log(names)
        var button = document.getElementById("button");
        if (names.trim() !== '' && names.length > 0 && names.length <= 20) {
          document.getElementById("Lastname").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("Lastname").innerHTML = "<span style='color:red;'>character shld be more thn 5 and less thn 20</span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }

      function cityNamee() {
        var names = document.getElementById("cityName").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length > 3 && names.length <= 20) {
          document.getElementById("Cityname").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("Cityname").innerHTML = "<span style='color:red;'>character shld be more thn 5 and less thn 20</span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }

      function passwordEntry() {

        var names = document.getElementById("password").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length >= 8 && names.length <= 20) {
          document.getElementById("errorPassword").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("errorPassword").innerHTML = "<span style='color:red;'>character shld be more thn 8  </span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }




      const checkEmail = async () => {

        let emailId = document.getElementById("email").value
        var button = document.getElementById("button");
        const response = await axios(" http://localhost:8080/modules/emailExist?emailId=" + emailId)

        if (emailId.length < 5) {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
          button.setAttribute("disabled", "");
        } else {
          document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
          button.removeAttribute("disabled");
        }
        console.log(response.data)

      }

      const phone = async () => {

        let contactNumber = document.getElementById("contactNo").value
        console.log(contactNumber)
        var button = document.getElementById("button");
        const response = await axios("http://localhost:8080/modules/phoneNoExists?contactNumber=" + contactNumber)

        if (contactNumber.length < 10 || contactNumber.length > 10) {
          document.getElementById("ph").innerHTML = "<span style='color:red;'>invalid phone number</span>";
          button.setAttribute("disabled", "");
        } else {
          document.getElementById("ph").innerHTML = "<span style='color:green;'>valid</span>";
          button.removeAttribute("disabled");
        }

        console.log(response.data)


      }


      function form(event) {

        var fName = document.getElementById("fName").value;
        var lName = document.getElementById("lName").value;
        var city = document.getElementById("cityName").value;
        var email = document.getElementById("email").value;
        var phoneNo = document.getElementById("contactNo").value;
        var password = document.getElementById("password").value;
        var maleChecked = document.getElementById("male").checked;
        var femaleChecked = document.getElementById("female").checked;
        var button = document.getElementById("button");


        if (
          fName.trim() != "" && fName.length > 3 && fName.length <= 20 &&
          lName.trim() !== "" && lName.length > 0 && lName.length <= 20 &&
          city.trim() !== "" && city.length > 3 && city.length <= 20 &&
          email.trim() !== "" &&
          phoneNo.trim() !== "" && phoneNo.length == 10 &&
          password.trim() !== "" && password.length >= 8
        ) {

          if (maleChecked || femaleChecked) {
            document.getElementById("Message").innerHTML = "";
            button.removeAttribute("disabled");
          } else {
            document.getElementById("Message").innerHTML = "<span style='color:red;'>Please fill the form correctly</span>";
            button.setAttribute("disabled", "");
          }

        } else {
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