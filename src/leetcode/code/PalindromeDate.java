package leetcode.code;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Title : leetcode.code <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-12-2 14:52
 */
public class PalindromeDate {

    /**
     * 今天是20211202，这样的日期被称为回文日期，请计算接下来的十个回文日期分别是哪一天
     */

    public static void main(String[] args) {
        for (Date date : new PalindromeDate().palindromeDate()) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
            System.out.println(format.format(date));
        }

    }

    private List<Date> palindromeDate() {
        List<Date> dates = new ArrayList<>();
        LocalDate now = LocalDate.now();
        while (dates.size() <= 10) {
            now = now.plusDays(1);
            String dateStr = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            if (dateStr.substring(0, dateStr.length() / 2).equals(new StringBuilder(dateStr.substring(dateStr.length() / 2)).reverse().toString())) {
                dates.add(Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant()));
            }
        }
        return dates;
    }
}
