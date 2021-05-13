<%--
  Created by IntelliJ IDEA.
  User: turga
  Date: 25.04.2021
  Time: 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add film: </title>
    <link rel="stylesheet" href="css/add.css">
</head>
<body>
<%@include file="header.jsp"%>
<div class="container"> <div class=" text-center mt-5 ">
    <h1>Add new Film</h1>
</div>
    <div class="row ">
        <div class="col-lg-7 mx-auto">
            <div class="card mt-2 mx-auto p-4 bg-light">
                <div class="card-body bg-light">
                    <div class="container">
                        <form id="contact-form" role="form" action="newFilm" method="post">
                            <div class="controls">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_name">Film name</label> <input id="form_name" type="text" name="name" class="form-control" placeholder="*" required="required"> </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_lastname">Genre</label> <input id="form_lastname" type="text" name="genre" class="form-control" placeholder="*" required="required"> </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_name">Link to the poster</label> <input id="trailer" type="text" name="trailer" class="form-control" placeholder="link" required="required"> </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_lastname">Pegi</label> <input id="pegi" type="text" name="pegi" class="form-control" placeholder="*" required="required"> </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_lastname">Duration</label> <input id="duration" type="text" name="duration" class="form-control" placeholder="in minutes" required="required"> </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_lastname">Price</label> <input id="price" type="text" name="price" class="form-control" placeholder="*" required="required"> </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group"> <label for="form_lastname">Start time</label> <input id="datetime-local" type="datetime-local" name="date" class="form-control" required="required"> </div>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group"> <label for="form_message">Description</label> <textarea id="form_message" name="description" class="form-control" placeholder="Write description here." rows="4" required="required"></textarea> </div>
                                    </div>
                                    <div class="col-md-12"> <input type="submit" class="btn btn-success btn-send pt-2 btn-block " value="Send Message"> </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
