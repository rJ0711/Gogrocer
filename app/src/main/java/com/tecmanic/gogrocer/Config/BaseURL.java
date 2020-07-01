package com.tecmanic.gogrocer.Config;


public class BaseURL {
    public static final String MyPrefreance = "my_preprence";
    public static final String PREFS_NAME = "GroceryLoginPrefs";
    public static final String PREFS_NAME2 = "GroceryLoginPrefs2";
    public static final String IS_LOGIN = "isLogin";
    public static final String KEY_NAME = "user_fullname";
    public static final String KEY_EMAIL = "user_email";
    public static final String TOTAL_AMOUNT = "TOTAL_AMOUNT";
    public static final String WALLET_TOTAL_AMOUNT = "WALLET_TOTAL_AMOUNT";
    public static final String COUPON_TOTAL_AMOUNT = "COUPON_TOTAL_AMOUNT";
    public static final String KEY_ID = "user_id";
    public static final String CART_ID_FINAL = "cart_id_final";
    public static final String KEY_MOBILE = "user_phone";
    public static final String KEY_IMAGE = "user_image";
    public static final String KEY_WALLET_Ammount = "wallet_ammount";
    public static final String KEY_REWARDS_POINTS = "rewards_points";
    public static final String KEY_PAYMENT_METHOD = "payment_method";
    public static final String KEY_PINCODE = "pincode";
    public static final String KEY_SOCITY_ID = "Socity_id";
    public static final String KEY_REWARDS = "rewards";
    public static final String KEY_SOCITY_NAME = "socity_name";
    public static final String KEY_HOUSE = "house_no";
    public static final String KEY_DATE = "date";
    public static final String KEY_TIME = "time";
    public static final String USER_SKIP = "user_skip";
    public static final String USER_CURRENCY_CNTRY = "user_currency_country";
    public static final String USER_CURRENCY = "user_currency";
    public static final String APP_OTP_STATUS = "user_otp_search";
    public static final String ADDRESS = "address";


    //adreeessss
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String COUNTRY = "country";
    public static final String LAT = "lat";
    public static final String LONG = "long";
    public static final String KEY_STORE_COUNT = "STORE_COUNT";

    //Store Selection
    public static final String KEY_NOTIFICATION_COUNT = "NOTIFICATION_COUNT";
    //Firebase
    public static final String SHARED_PREF = "ah_firebase";
    public static final String TOPIC_GLOBAL = "global";
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String KEY_PASSWORD = "password";
    public static final String USER_STATUS = "user_status";
    public static final String USER_OTP = "user_otp";
    public static final String USER_EMAIL_SERVICE = "user_email_service";
    public static final String USER_SMS_SERVICE = "user_sms_service";
    public static final String USER_INAPP_SERVICE = "user_inapp_service";
    //City and Store Id
    public static final String CITY_ID = "CITY_ID";
    public static final String STORE_ID = "STORE_ID";
    static final String APP_NAME = "GoGrocer";


//    https://gogrocer.tecmanic.com/api/
    public static String BASE_URL = "https://thecodecafe.in/gogrocer-ver2.0/api/";
//    public static String BASE_URL = "https://grophy.in/gogrocer/api/";


    //    public static String IMG_URL = "https://grophy.in/gogrocer/image/";
    public static String IMG_URL = "https://thecodecafe.in/gogrocer-ver2.0/";
    //    public static String IMG_URL = "https://gogrocer.tecmanic.com/";
    public static String BANN_IMG_URL = "https://gogrocer.tecmanic.com/";
    public static String BANNER_IMG_URL = "https://thecodecafe.in/gogrocer-ver2.0/";
    public static String SignUp = BASE_URL + "register";
    public static String SignUpOtp = BASE_URL + "verify_phone";

    public static String Login = BASE_URL + "login";
    public static String USERBLOCKAPI = BASE_URL + "user_block_check";
    public static String forget_password = BASE_URL + "forget_password";
    public static String verify_otp = BASE_URL + "verify_otp";
    public static String ChangePass = BASE_URL + "change_password";

    public static String HomeTopSelling = BASE_URL + "top_selling";
    public static String HomeRecent = BASE_URL + "recentselling";
    public static String HomeDeal = BASE_URL + "dealproduct";
    public static String redeem_rewards = BASE_URL + "redeem_rewards";
    public static String BANNER = BASE_URL + "banner";
    public static String secondary_banner = BASE_URL + "secondary_banner";

    public static String Categories = BASE_URL + "catee";
    public static String ProductVarient = BASE_URL + "varient";
    public static String Search = BASE_URL + "search";

    public static String CityListUrl = BASE_URL + "city";
    public static String SocietyListUrl = BASE_URL + "society";
    public static String Add_address = BASE_URL + "add_address";
    public static String ShowAddress = BASE_URL + "show_address";
    public static String SelectAddressURL = BASE_URL + "select_address";
    public static String EditAddress = BASE_URL + "edit_address";
    public static String DELETE_ORDER_URL = BASE_URL + "cancelling_reasons";
    public static String delete_order = BASE_URL + "delete_order";
    public static String delivery_info = BASE_URL + "delivery_info";

    public static String CalenderUrl = BASE_URL + "timeslot";

    public static String WALLET_REFRESH = BASE_URL + "walletamount?user_id=";
    public static String RecharegeWallet = BASE_URL + "recharge_wallet";
    public static String myprofile = BASE_URL + "myprofile";
    public static String OrderDoneUrl = BASE_URL + "completed_orders";
    public static String PendingOrderUrl = BASE_URL + "ongoing_orders";

    public static String AboutUrl = BASE_URL + "appaboutus";
    public static String topsix = BASE_URL + "topsix";
    public static String TermsUrl = BASE_URL + "appterms";

    public static String delete_all_notification = BASE_URL + "delete_all_notification";
    public static String SupportUrl = BASE_URL + "appterms";

    public static String EDIT_PROFILE_URL = BASE_URL + "profile_edit";
    public static String cat_product = BASE_URL + "cat_product";
    public static String OrderContinue = BASE_URL + "make_an_order";
    public static String MinMaxOrder = BASE_URL + "minmax";
    public static String rewardlines = BASE_URL + "rewardlines";

    public static String Wallet_CHECKOUT = BASE_URL + "";
    public static String ADD_ORDER_URL = BASE_URL + "checkout";
    public static String COUPON_CODE = BASE_URL + "couponlist";
    public static String apply_coupon = BASE_URL + "apply_coupon";
    public static String whatsnew = BASE_URL + "whatsnew";

    public static String NoticeURl = BASE_URL + "notificationlist";
    public static String updatenotifyby = BASE_URL + "updatenotifyby";
    public static String currencyApi = BASE_URL + "currency";



  /*  public static String REGISTER_URL = BASE_URL + "register";
    public static String Otp = BASE_URL + "verify_otp";
    public static String LOGIN_URL = BASE_URL + "login";

    public static String IMG_SLIDER_URL = BASE_URL + "uploads/sliders/";
    public static String IMG_CATEGORY_URL = BASE_URL + "uploads/category/";
    public static String IMG_PRODUCT_URL = BASE_URL + "uploads/products/";

    public static String IMG_PROFILE_URL = BASE_URL + "uploads/profile/";
    public static String GET_SLIDER_URL = BASE_URL + "index.php/api/get_sliders";
    public static String GET_FEAATURED_SLIDER_URL = BASE_URL + "index.php/api/get_feature_banner";
    public static String GET_BANNER_URL = BASE_URL + "index.php/api/get_banner";

    public static String WALLET_REFRESH = BASE_URL + "index.php/api/wallet?user_id=";
    public static String REWARDS_REFRESH = BASE_URL + "index.php/api/rewards?user_id=";

    public static String GET_CATEGORY_URL = BASE_URL + "index.php/api/get_categories";
    public static String GET_SLIDER_CATEGORY_URL = BASE_URL + "index.php/api/get_sub_cat";
    public static String GET_CATEGORY_ICON_URL = BASE_URL + "index.php/api/icon";
    public static String COUPON_CODE = BASE_URL + "index.php/api/get_coupons";

    //Home PAGE

    public static String GET_MENU_PRODUCTS = BASE_URL + "index.php/api/icon";
    public static String GET_MENU_ICON_PRODUCT_URL = BASE_URL + "index.php/api/get_header_products";
    public static String GET_DEAL_OF_DAY_PRODUCTS = BASE_URL + "index.php/api/deal_product";
    public static String GET_ALL_DEAL_OF_DAY_PRODUCTS = BASE_URL + "index.php/api/get_all_deal_product";
    public static String GET_TOP_SELLING_PRODUCTS = BASE_URL + "index.php/api/top_selling_product";
    public static String GET_ALL_TOP_SELLING_PRODUCTS = BASE_URL + "index.php/api/get_all_top_selling_product";


    public static String GET_PRODUCT_URL = BASE_URL + "index.php/api/get_products";

    public static String GET_ABOUT_URL = BASE_URL + "index.php/api/aboutus";

    public static String GET_SUPPORT_URL = BASE_URL + "index.php/api/support";

    public static String GET_TERMS_URL = BASE_URL + "index.php/api/terms";

    public static String GET_TIME_SLOT_URL = BASE_URL + "index.php/api/get_time_slot";





    public static String GET_SOCITY_URL = BASE_URL + "index.php/api/get_society";

    public static String EDIT_PROFILE_URL = BASE_URL + "index.php/api/update_userdata";

    public static String ADD_ORDER_URL = BASE_URL + "index.php/api/send_order";
    public static String Wallet_CHECKOUT = BASE_URL + "index.php/api/wallet_at_checkout";
    public static String GET_ORDER_URL = BASE_URL + "index.php/api/my_orders";

    public static String GET_DELIVERD_ORDER_URL = BASE_URL + "index.php/api/delivered_complete";

    public static String ORDER_DETAIL_URL = BASE_URL + "index.php/api/order_details";

    public static String DELETE_ORDER_URL = BASE_URL + "index.php/api/cancel_order";

    public static String GET_LIMITE_SETTING_URL = BASE_URL + "index.php/api/get_limit_settings";

    public static String ADD_ADDRESS_URL = BASE_URL + "index.php/api/add_address";

    public static String GET_ADDRESS_URL = BASE_URL + "index.php/api/get_address";

    public static String FORGOT_URL = BASE_URL + "index.php/api/forgot_password";

    public static String JSON_RIGISTER_FCM = BASE_URL + "index.php/api/register_fcm";

    public static String CHANGE_PASSWORD_URL = BASE_URL + "index.php/api/change_password";

    public static String DELETE_ADDRESS_URL = BASE_URL + "index.php/api/delete_address";

    public static String EDIT_ADDRESS_URL = BASE_URL + "index.php/api/edit_address";


    // global topic to receive app wide push notifications

    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";

    public static final String PUSH_NOTIFICATION = "pushNotification";
*/
}
