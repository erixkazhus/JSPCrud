<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.ico">

    <title>  
    
	   <%
	   	if(request.getAttribute("title") == null){
	   		out.print("Homepage");
	   	}else{
	   		out.print(request.getAttribute("title"));
	   	}
	   %>    
    </title>
   
    <link href="assets/css/bootstrap.css" rel="stylesheet">
   
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    
    <script src="assets/js/modernizr.js"></script>
    <style>
		  .basketball-icon {
		    width: 70px; /* Adjust the width as needed */
		    height: auto;
		    margin-left: -195px;  /* Maintain aspect ratio */
		  }
		 
	</style>
  </head>
  <body>   
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">      
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <div>
	          <img src="assets/img/basketball-4264543_640.png" alt="Basketball Icon" class="basketball-icon">
	          <a class="navbar-brand" href="index.html">Swish Hoop</a>          
          </div>          
        </div>
        <div class="navbar-collapse collapse navbar-right">
          <ul class="nav navbar-nav">
            <li><a href="<%= request.getContextPath() %>/home?page=home">HOME</a></li>
            <li><a href="<%= request.getContextPath() %>/site?page=listusers">LIST USERS</a></li>
            
            <li><a href="<%= request.getContextPath() %>/site?page=adduser">ADD USERS</a></li>
           <!-- <li class="active"><a href="contact.html">LOGIN</a></li>
             <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">PAGES <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="blog.html">BLOG</a></li>
                <li><a href="single-post.html">SINGLE POST</a></li>
                <li><a href="portfolio.html">PORTFOLIO</a></li>
                <li><a href="single-project.html">SINGLE PROJECT</a></li>
              </ul>
            </li>--> 
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>	

	 <div class="container mtb">
	 	<div class="row">
	 		<div class="col-lg-8">
	 			
	 			
			</div><! --/col-lg-8 -->
	 		
	 		
	 	</div><! --/row -->
	 </div><! --/container -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/retina-1.1.0.js"></script>
	<script src="assets/js/jquery.hoverdir.js"></script>
	<script src="assets/js/jquery.hoverex.min.js"></script>
	<script src="assets/js/jquery.prettyPhoto.js"></script>
  	<script src="assets/js/jquery.isotope.min.js"></script>
  	<script src="assets/js/custom.js"></script>


  </body>
</html>
