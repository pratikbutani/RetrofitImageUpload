<?php
  
    $file_path = "";
     
    $file_path = $file_path . basename( $_FILES['uploaded_file']['name']);
    if(move_uploaded_file($_FILES['uploaded_file']['tmp_name'], $file_path)) {
        $result = array("result" => "success");
    } else{
        $result = array("result" => "error");
    }

    echo json_encode($result);

?>
