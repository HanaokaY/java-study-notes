// 問題: "2023-01-01 00:00:00"から100日後の日付を出力してください。

package date_time_handling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Problem2 {
    public static void main(String[] args) {
        String dateStr = "2023-01-01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
        try {
            Date date = sdf.parse(dateStr);
            cal.setTime(date);
            cal.add(Calendar.DATE, 100);
            Date resultDate = cal.getTime();
            
            String resultStr = sdf.format(resultDate);
            System.out.println(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
