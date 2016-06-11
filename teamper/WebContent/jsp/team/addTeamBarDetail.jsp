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

<title> �ϰ��� �� �Է�</title>
</head>
<body>
<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
 <div class="container-fluid">
  <div class="row">
   <div class="col-md-6 col-sm-6 col-xs-12">
    <div class="formden_header">
     <h2>
      �ϰ��� �� �Է�
     </h2>
     <p>
      ������ �� �ϰ��� ���� ����ȭ�� �ϵ��� �Է��մϴ�.
     </p>
    </div>
    <form method="post">
     <div class="form-group ">
      <label class="control-label " for="select1">
       Team Bar Name
      </label>
      <select class="select form-control" id="select1" name="select1">
       <option value="�ϰ�1">
        �ϰ�1
       </option>
       <option value="�ϰ�2">
        �ϰ�2
       </option>
       <option value="�ϰ�3">
        �ϰ�3
       </option>
      </select>
      <span class="help-block" id="hint_select1">
       ���γ����� ���Ե� �ϰ� �Ǵ� �ܰ踦 �����մϴ�.
      </span>
     </div>
     <div class="form-group ">
      <label class="control-label " for="select">
       worker
      </label>
      <select class="select form-control" id="select" name="select">
       <option value="�����1">
        �����1
       </option>
      </select>
      <span class="help-block" id="hint_select">
       �ش� �ϰ��� ���� ����ڸ� �����մϴ�.
      </span>
     </div>
     <div class="form-group ">
      <label class="control-label " for="name">
       Team Bar Detail Name
      </label>
      <input class="form-control" id="name" name="name" type="text"/>
      <span class="help-block" id="hint_name">
       �ϰ��� ���� �����ϵ��� �Է��մϴ�.
      </span>
     </div>
     <div class="form-group ">
      <label class="control-label " for="name1">
       Team Bar Detail Name
      </label>
      <input class="form-control" id="name1" name="name1" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="name2">
       Team Bar Detail Name
      </label>
      <input class="form-control" id="name2" name="name2" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="name3">
       Team Bar Detail Name
      </label>
      <input class="form-control" id="name3" name="name3" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="name4">
       Team Bar Detail Name
      </label>
      <input class="form-control" id="name4" name="name4" type="text"/>
     </div>
     <div class="form-group">
      <div>
       <button class="btn btn-primary " name="submit" type="submit">
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