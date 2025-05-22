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
<header class="bg-dark text-white"> 
        <div class="d-flex justify-content-between align-items-center p-3">
            <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">

             
            <div class="dropdown mb-1">
                <img src="image?fileName=${file}"  class="rounded-circle mx-2" alt="img" width="90"
        data-bs-toggle="modal" data-bs-target="#imageModal"/>
                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                    ${name}
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="profile?emailId=${email}">profile</a>
                    <a class="dropdown-item" href="logout?emailId=${email}">logout</a>

                </div>
            </div>

        </div>

        <hr color="black">
        </header>



         

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>


         <footer class="footer">
               <div class="footer bg-dark py-3 mt-auto container-fluid row justify-content-center">
                 <div class="col-md-6 text-center" style="color: white;">
                   <p class="text-white mb-0">Copyright &copy; xworks</p>
                 </div>
               </div>
             </footer>
    </body>