<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
     integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
     <style>
        .h3{
            color: blueviolet;
            text-align: center;
            padding-top: 20px;
        }
        .msg{
            color: tomato;
            text-align: center;
        }
        body{
            background-color: rgb(218, 250, 250);
        }
     </style>
</head>
<body>
    <p class="h3">Add New Product Details</p>
    <br><br>
    <form action="/newProduct" method="post" class="form-container" modelattribute="product">
        <div class="row justify-content-center ">
        <div class="col-12 col-sm-6 col-md-3 ">
            <div class="mb-3 ">
                <label for="id" class="form-label">Id</label>
                <input type="number" class="form-control" id="id" name="id" placeholder="Id" required>
              </div>
            <div class="mb-3 ">
            <label for="user" class="form-label">Product Name</label>
            <input type="text" class="form-control" id="user" name="name" placeholder="Name" required>
          </div>
          <div class="mb-3 ">
            <label for="Pass" class="form-label">Cost</label>
            <input type="number" class="form-control" id="Pass" name="cost" placeholder="Cost" required>
          </div>
          <div class="mb-3 ">
            <label for="Quantity" class="form-label">Quantity in kg's</label>
            <input type="number" class="form-control" id="Quantity" name="qnty" placeholder="0" required>
          </div>
          <div class="mb-3 ">
            <label for="Image" class="form-label">Url (image of the Product)</label>
            <input type="url" class="form-control" id="Image" name="img" placeholder="link" required>
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
          </div>
        </div>
        <br>
      </form>
      <p class="msg">${message}</p>
</body>
</html>