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
          <h1>Nom Prenom</h1>
        </div>
      </div>

      <div class="container">
        <div class="row">
          <div class="col-md-4 mkhtfn-display">
            <img src="../resources/img/img_1.jpg" class="img-fluid mb-3">
             <a class="btn btn-block btn-social btn-twitter">
                <span class="fa fa-twitter"></span> Tweet
              </a>
              <a class="btn btn-block btn-social btn-facebook">
                <span class="fa fa-facebook"></span> Share in facebook
              </a>
              <a class="btn btn-block btn-social btn-google">
                <span class="fa fa-google"></span> Sign in Google+
              </a>

          </div>
          <div class="col-md-7 offset-md-1">
            <table border="0">
              <tr>
                <td><span class="key">Nom</span></td>
                <td>Smith</td>
              </tr>
              <tr>
                <td><span class="key">Prenom</span></td>
                <td>Lyaqut</td>
              </tr>
              <tr>
                <td><span class="key">Address</span></td>
                <td>3649 Jewell Road, Minneapolis Minnesota</td>
              </tr>
              <tr>
                <td><span class="key">Dernier Vue</span></td>
                <td>01/01/01</td>
              </tr>
              <tr>
                <td><span class="key">Description</span></td>
                <td>I found out today that Snooki hates the nickname "Snooki" and is planning to go back to using her real name, "Danny DeVito"</td>
              </tr>
              <tr>
                <td><span class="key">Country</span></td>
                <td>United States</td>
              </tr>
              <tr>
                <td><span class="key">City</span></td>
                <td>Minnesota</td>
              </tr>
            </table>

            <div class="messages mt-5">
              <h2>Comments</h2>
              <ul>
                <li>
                  <h3>Message author</h3>
                  <span class="meta-info">posted on 01/01/01</span>
                  <p>Coffee fanatic. Thinker. Avid food geek. Freelance social media maven. Certified troublemaker. Pop culture enthusiast.</p>
                </li>
                 <li>
                  <h3>Message author</h3>
                  <span class="meta-info">posted on 01/01/01</span>
                  <p>Coffee fanatic. Thinker. Avid food geek. Freelance social media maven. Certified troublemaker. Pop culture enthusiast.</p>
                </li>
                <li>
                  <h3>Message author</h3>
                  <span class="meta-info">posted on 01/01/01</span>
                  <p>Coffee fanatic. Thinker. Avid food geek. Freelance social media maven. Certified troublemaker. Pop culture enthusiast.</p>
                </li>
                <li>
                  <h3>Message author</h3>
                  <span class="meta-info">posted on 01/01/01</span>
                  <p>Coffee fanatic. Thinker. Avid food geek. Freelance social media maven. Certified troublemaker. Pop culture enthusiast.</p>
                </li>
              </ul>
            </div>
            <hr>
            <div class="add-comment">
              <form>
                <div class="form-group">
                  <label for="confirm" class="cols-sm-2 control-label">New Comment</label>
                  <div class="cols-sm-10">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-comment fa-lg" aria-hidden="true"></i></span>
                      <textarea class="form-control" aria-label="With textarea"></textarea>
                    </div>
                  </div>
                </div>

                <div class="form-group ">
                  <button type="button" class="btn btn-primary btn-lg btn-block login-button">Submit</button>

                </div>
              </form>
            </div>

          </div>

        </div>

      </div> <!-- /container -->

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
