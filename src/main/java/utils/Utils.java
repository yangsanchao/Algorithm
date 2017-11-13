package utils;
/**
 * Created by ysc on 17/5/24.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getSystemTime() {
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String timeString = time.format(new java.util.Date());
        return timeString + " ";
    }

    public static String getSystemTime2() {
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString = time.format(new java.util.Date());
        return timeString;
    }

    public static long getSStr2Long(String timeStr) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(timeStr);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }


    /** 将长整型数据转换为Date后，再转换为型如yyyy-MM-dd HH:mm:ss的长字符串
     * @param l 表示某日期的长整型数据
     * @return 日期型的字符串
     */
    public static String getLong2LStr(long l) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date dt = new Date(l);
        return sdf.format(dt);
    }


    // 判断一个字符是否是中文
    public static boolean isChinese(char c) {
        return c >= 0x4E00 &&  c <= 0x9FA5;// 根据字节码判断
        //return  !((48<=code)&&(code<=57))||((97<=code)&&(code<=122))||((65<=code)&&(code<=90));
    }

    // 判断一个字符串是否含有中文
    public static boolean isChinese(String str) {
        if (str == null) return false;
        for (char c : str.toCharArray()) {
            if (isChinese(c)) return true;// 有一个中文字符就返回
        }
        return false;
    }


    public static void main(String[] args) throws Exception {

    }

}
