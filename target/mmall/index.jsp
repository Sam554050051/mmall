<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>

<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="upload上传">
</form>

<form name="form2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">

<form>
    <input type="file" name="upload_file"/>
    <input type="submit" value="richtext_img_upload上传">
<form/>
</body>

</html>
