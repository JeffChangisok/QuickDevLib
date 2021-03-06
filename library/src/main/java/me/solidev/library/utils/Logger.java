package me.solidev.library.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by _SOLID
 * Date:2016/5/10
 * Time:10:15
 */
public class Logger {

    /**
     * 是否为开发者模式(开发模式打印LOG,非开发模式不打印LOG)
     */
    private static boolean mDebug = true;

    private Logger() {
    }

    @NonNull
    private static String getTagName(Object object) {
        String tagName = object.getClass().getSimpleName();
        if (TextUtils.isEmpty(tagName)) tagName = "AnonymityClass";
        return tagName;
    }

    public static void i(Object object, String msg) {
        String tagName = getTagName(object);
        if (mDebug) {
            Log.i(tagName, msg);
        }
    }


    public static void i(String msg) {
        if (mDebug) {
            Log.i("LogInfo", msg);
        }
    }

    public static void e(Object object, String msg) {
        String tagName = getTagName(object);
        if (mDebug) {
            Log.e(tagName, msg);
        }
    }

    public static void e(String msg) {
        if (mDebug) {
            Log.e("LogError", msg);
        }
    }
}
