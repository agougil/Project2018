<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../resources/img/favicon.ico">

    <title>Boring Stuff</title>
 <!-- Bootstrap core CSS & social buttons -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../resources/css/bootstrap-social.css" rel="stylesheet">
     <link href="../resources/css/font-awesome.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../resources/css/main.css" rel="stylesheet">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
  </head>

  <body>


    <!-- Navigation -->
      <nav class="navbar navbar-expand-lg navbar-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">
          <img src="../resources/img/user-search.svg" /> Moukhtafoun
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Link</a>
            </li>
           
            <li class="nav-item">
              <a class="nav-link disabled" href="#">Disabled</a>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
           <ul class="navbar-nav mr-auto">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Dropdown
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Something else here</a>
              </div>
            </li>
           </ul>
        </div>
      </div>
      
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="mkhtfn-banner">
        <div class="container">
          <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
              <form class="mkhtfn-form" method="post" action="addUser">
                <h2 class="mkhtfn-form-title">Register</h2>

                <div class="form-group">
                  <label for="name" class="cols-sm-2 control-label">Your Name</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                      <input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name"/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="email" class="cols-sm-2 control-label">Your Email</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                      <input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="username" class="cols-sm-2 control-label">Username</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                      <input type="text" class="form-control" name="username" id="username"  placeholder="Enter your Username"/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="password" class="cols-sm-2 control-label">Password</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                      <input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                      <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="confirm" class="cols-sm-2 control-label">Address</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-map fa-lg" aria-hidden="true"></i></span>
                      <input type="text" class="form-control" name="address" id="address"  placeholder="7 Rue..."/>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="confirm" class="cols-sm-2 control-label">Phone Number</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-phone fa-lg" aria-hidden="true"></i></span>
                      <input type="text" class="form-control" name="phone" id="phone"  placeholder="+212.."/>
                    </div>
                  </div>
                </div>

                <div class="form-group ">
                  <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
                </div>
                <div class="login-register">
                        <a href="/mokhtafonVspring/login">Login</a>
                </div>

              </form>
            </div>
          </div>
        </div>
      </div>

    </main>

    <footer class="container mt-5 mb-4">
      <hr style="margin-top: 35px;">
      <p>&copy; Moukhtafoun 2017</p>
    </footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../resources/js/jquery.min.js"><\/script>')</script>
    <script src="../resources/js/popper.min.js"></script>
    <script src="../resources/js/bootstrap.min.js"></script>
  </body>
</html>
