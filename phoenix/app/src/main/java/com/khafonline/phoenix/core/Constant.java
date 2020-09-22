package com.khafonline.phoenix.core;


public class Constant {


    public static final int CODE_INVITE_LIENGTH = 6;
    public static final boolean SHOW_WAITING = false;
    public static final String NOTIFICATION_CHANNEL_NAME ="جنسیس" ;
    public static final int PROFILE_IMAGE_QUALITY = 60;
    public static final int PROFILE_IMAGE_MAX_SIZE = 400;



    public static final String RESULT_SUCCEED = "SUCCEED";
    public static final String RESULT_FAILED = "FAILED";


    static final boolean ARE_YOU_IN_DEBUG_MODE = true;

    public static final String CURRENCY = " تومان ";



    public static final String[] Prefixes = {"آقای", "خانم", "مهندس", "دکتر", "دانشگاه", "اداره", "شرکت", "کارگاه", "کارخانه", "بانک","کارت"};

    public static final String DATE_FORMAT = "yyyy/MM/dd  kk:mm:ss";
    static final String MY_LOG_PREFIX = "#### khafonline.com->";
    public static final int DEFAULT_FONT = 4;



    //region fonts
    public static final String[] fonts = {"tahoma.ttf", "Koodak.TTF", "Titr.TTF", "Zar.TTF", "IRAN_Sans.ttf", "IRAN_Sans_Bold.ttf", "Roboto-Bold.ttf", "RobotoCondensed-Regular.ttf", "Roboto-Light.ttf", "Roboto-Medium.ttf", "Ubuntu-B.ttf", "Ubuntu-BL.ttf", "Ubuntu-L.ttf", "Ubuntu-LI.ttf", "Ubuntu-R.ttf", "Ubuntu-RI.ttf",
            "Far_Dimona.ttf","Far_Bold.ttf","Far_BardiyaBd.ttf","Mj_Heritage.ttf","Ziba.ttf","Lalezar.ttf"};
    public static final String[] Gender = {"پسر", "دختر"};
    public static final String DEFAULT_FONT_FOLDER = "font/";
    //endregion


    // region database
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "GenesisDB";
    public static final String DATABASE_BACKUP_NAME = DATABASE_NAME + "_backup.db";
    public static final long REFRESH_DATABASE_INTERVAL_MINUTES = 24*60;//24*60;// in minute

    //endregion

    // region Server

    public final static String WEB_SERVER_ADDRESS = "http://khafonline.com/phoenix_v1/";
    public final static String DATA_SERVER_ADDRESS = WEB_SERVER_ADDRESS;
    public final static String IMAGE_SERVER_ADDRESS = "http://khafonline.com/media/";
    public final static String IMAGE_SERVER_ADDRESS_ROOT = "http://khafonline.com";
//    public final static String DATA_SERVER_ADDRESS = "http://192.168.100.198:2030/";
//    public final static String IMAGE_SERVER_ADDRESS = "http://192.168.100.198:2030";


    //endregion

    //region image

    //region Rest


    public static final String REST_PARAM_MODIFIED_DATE = "modifiedDate";
    public static final String REST_PARAM_STUDENT_ID = "id";
    public static final String REST_PARAM_SEARCH = "search";
    public static final String REST_PARAM_OPERATION = "opeartion";
    public static final String REST_PARAM_PARAMETER = "parameter";
    public static final String REST_PARAM_OPERAND = "operand";




    //endregion

    //region SharedPref

    final static String SHAREDPREF_FIRST_RUN = "SHAREDPREF_FIRST_RUN";
    final static String SHAREDPREF_SERVER_ADDRESS = "ServerAddress";
    final static String SHAREDPREF_FILE_NAME = "com.smartcoder.Dakkeh.PREFERENCE_FILE_KEY";
    public final static String USERPROFILE_SHAREDPREF_FILE_NAME="USERPROFILE_SHAREDPREF_FILE_NAME";
    public final static String SHAREDPREF_LOGGED_IN_TEACHER="LOGGED_IN_TEACHER";
    final static String SHAREDPREF_FIRST_NAME_FIRST = "first_name_first";
    public final static String SHAREDPREF_USER_FILE_NAME = "SHAREDPREF_USER_FILE_NAME";







    //i love coding
    //endregion


    public final static int CAMERA_IMAGE = 1;

    //region Operation
    public final static String NULL = "NULL";
    public final static String DELETE = "DELETE";
    public final static String UPDATE = "UPDATE";
    public static final int TOKEN_LENGTH = 5;
    static final String SHAREDPREF_USER_EMAIL = "SHAREDPREF_USER_EMAIL";
    static final String SHAREDPREF_USER_FIRST_NAME = "SHAREDPREF_USER_FIRST_NAME";
    static final String SHAREDPREF_USER_LAST_NAME = "SHAREDPREF_USER_LAST_NAME";
    static final String SHAREDPREF_USER_TOKEN = "SHAREDPREF_USER_TOKEN";
    static final String SHAREDPREF_USER_IMAGE = "SHAREDPREF_USER_IMAGE";
    static final String SHAREDPREF_USER_MOBILE = "SHAREDPREF_USER_MOBILE";
    static final String SHAREDPREF_USER_USERNAME = "SHAREDPREF_USER_USERNAME";
    static final String SHAREDPREF_SHIPPER_ID = "SHAREDPREF_SHIPPER_ID";
    static final String SHAREDPREF_SUPPLIER_ID = "SHAREDPREF_SUPPLIER_ID";
    static final String SHAREDPREF_USER_INVITED = "SHAREDPREF_USER_INVITED";
    static final String SHAREDPREF_USER_ACCEPTED = "SHAREDPREF_USER_ACCEPTED";
    static final String SHAREDPREF_USER_REGION = "SHAREDPREF_USER_REGION";
    static final String SHAREDPREF_USER_BIO = "SHAREDPREF_USER_BIO";




    //endregion


}
