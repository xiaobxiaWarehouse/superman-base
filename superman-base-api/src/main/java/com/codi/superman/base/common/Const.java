package com.codi.superman.base.common;

/**
 * 常量
 *
 * @author shi.pengyan
 * @date 2016年11月8日 下午1:57:36
 */
public interface Const {

    /* User-Agent*/
    String HTTP_HEADER_USER_AGENT = "User-Agent";

    /*状态可用*/
    String STATE_A = "A";

    /*状态不可用*/
    String STATE_X = "X";

    String YES = "Y";
    String NO = "N";


    /*登陆用户标识*/
    String SESSION_LOGIN_USER = com.codi.base.common.Const.SESSION_LOGIN_USER;
    /*登陆用户session*/
    String SESSION_LOGIN_USER_SESSION = "SESSION_LOGIN_USER_SESSION";

    /*JSESSIONID*/
    String JSESSIONID = "JSESSIONID";

    /*redis端key前缀*/
    String COMMON_SESSION_PREFIX = "PORTAL_SESSION";

    /*权限类型：0，目录*/
    Integer PRIV_TYPE_DIRECTORY = 0;
    /*权限类型：1，菜单*/
    Integer PRIV_TYPE_MENU = 1;
    /*权限类型：2，数据*/
    Integer PRIV_TYPE_DATA = 2;

    /*Android*/
    Integer APP_TYPE_ANDROID = 1;
    /*IOS*/
    Integer APP_TYPE_IOS = 2;
    /*WINPHONE*/
    Integer APP_TYPE_WINPHONE = 3;

    /* 日志类型 */
    String LOG_TYPE_APP_ADD = "APP_ADD";
    String LOG_TYPE_APP_DEL = "APP_DEL";
    String LOG_TYPE_APP_UPDATE = "APP_UPDATE";

    String LOG_TYPE_APP_VERSION_ADD = "APP_VERSION_ADD";
    String LOG_TYPE_APP_VERSION_DEL = "APP_VERSION_DEL";
    String LOG_TYPE_APP_VERSION_UPDATE = "APP_VERSION_UPDATE";

    String LOG_TYPE_CACHE_QUERY = "CACHE_QUERY";
    String LOG_TYPE_CACHE_DEL = "CACHE_DEL";


    String LOG_TYPE_PARAM_ADD = "PARAM_ADD";
    String LOG_TYPE_PARAM_DEL = "PARAM_DEL";
    String LOG_TYPE_PARAM_UPDATE = "PARAM_UPDATE";

    String LOG_TYPE_PRIV_ADD = "PRIV_ADD";
    String LOG_TYPE_PRIV_DEL = "PRIV_DEL";
    String LOG_TYPE_PRIV_UPDATE = "PRIV_UPDATE";

    String LOG_TYPE_ROLE_PRIV_ADD = "ROLE_PRIV_ADD";
    String LOG_TYPE_ROLE_PRIV_DEL = "ROLE_PRIV_DEL";
    String LOG_TYPE_ROLE_PRIV_UPDATE = "ROLE_PRIV_UPDATE";

    String LOG_TYPE_ROLE_ADD = "ROLE_ADD";
    String LOG_TYPE_ROLE_DEL = "ROLE_DEL";
    String LOG_TYPE_ROLE_UPDATE = "ROLE_UPDATE";

    String LOG_TYPE_USER_ROLE_ADD = "USER_ROLE_ADD";
    String LOG_TYPE_USER_ROLE_DEL = "USER_ROLE_DEL";
    String LOG_TYPE_USER_ROLE_UPDATE = "USER_ROLE_UPDATE";

    String LOG_TYPE_USER_ADD = "USER_ADD";
    String LOG_TYPE_USER_DEL = "USER_DEL";
    String LOG_TYPE_USER_UPDATE = "USER_UPDATE";

    String LOG_TYPE_LOGIN = "LOGIN";
    String LOG_TYPE_LOGOUT = "LOGOUT";

    String LOG_TYPE_FILE_DELETE = "FILE_DELETE";


    /*access key*/
    String QINIU_ACCESS_KEY = "QINIU_ACCESS_KEY";
    /*secret key*/
    String QINIU_SECRET_KEY = "QINIU_SECRET_KEY";
    /* 文件桶*/
    String QINIU_BUCKET = "QINIU_BUCKET";
    /* 文件桶 host*/
    String QINIU_BUCKET_HOST = "QINIU_BUCKET_HOST";

    Integer BULLETIN_USE_STATE = 1;

}
