<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" /> 

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial, Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: white !important;} .asteriskField{color: red;}</style>

<title>�ϰ��Է�</title>
</head>
<body>
<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
 <div class="container-fluid">
  <div class="row">
   <div class="col-md-6 col-sm-6 col-xs-12">
    <div class="formden_header">
     <h2>
      �ϰ� �Է�
     </h2>
     <p>
      ������ �ϰ��� �ܰ踦 �Է��մϴ�.
     </p>
    </div>
    <form method="post">
     <div class="form-group ">
      <label class="control-label " for="name">
       Team Bar Name
      </label>
      <input class="form-control" id="name" name="name" type="text"/>
      <span class="help-block" id="hint_name">
       �ϰ��̸� �Ǵ� �ܰ踦 �Է��մϴ�.
      </span>
     </div>
     <div class="form-group ">
      <label class="control-label " for="number">
       Team Bar Size
      </label>
      <input class="form-control" id="number" name="number" type="text"/>
      <span class="help-block" id="hint_number">
       Team Bar�� ũ�⸦ �Է��մϴ�. ũ��� �� �ϰ��� ������ �ð�ȭ�Ͽ� ��Ÿ���ϴ�.
      </span>
     </div>
     <div class="form-group">
      <div>
       <button class="btn btn-primary " name="addwork" type="submit">
        �߰�
       </button>
       <button class="btn btn-primary " name="workscess" type="submit">
        �Ϸ�
       </button>
      </div>
     </div>
    </form>
   </div>
  </div>
 </div>
</div>
</body>
</html>