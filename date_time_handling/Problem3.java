// 問題: "2023-12-31 23:59:59"と現在時刻との間の差（日数と時間）を出力してください。

package date_time_handling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Problem3 {
    public static void main(String[] args) {
        String dateStr = "2023-12-31 23:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        try {
            Date date = sdf.parse(dateStr);
            Date now = new Date();
            long diff = date.getTime() - now.getTime();
            long days = diff / (24 * 60 * 60 * 1000);
            long hours = (diff / (60 * 60 * 1000)) % 24;

            System.out.println("Days: " + days);
            System.out.println("Hours: " + hours);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
