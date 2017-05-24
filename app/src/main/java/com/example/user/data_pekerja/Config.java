package com.example.user.data_pekerja;

/**
 * Created by User on 24-May-17.
 */

public class Config {
    //Address of our scripts of the CRUD
    public static final String URL_ADD="http://faisalfnx.hol.es/Data_pekerja/addEmp.php";
    public static final String URL_GET_ALL = "http://faisalfnx.hol.es/Data_pekerja/getAllEmp.php";
    public static final String URL_GET_EMP = "http://faisalfnx.hol.es/Data_pekerja/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://faisalfnx.hol.es/Data_pekerja/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://faisalfnx.hol.es/Data_pekerja/deleteEmp.php?id=";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "nama";
    public static final String KEY_EMP_DESG = "alamat";
    public static final String KEY_EMP_SAL = "umur";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "nama";
    public static final String TAG_DESG = "alamat";
    public static final String TAG_SAL = "umur";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}
