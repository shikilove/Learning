package algorithm;

/**
 * Title : algorithm <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-4 11:25
 */
public class StringSearchResult {

    private String keyword;

    private int index;

    public StringSearchResult(int index, String keyword) {
        this.keyword = keyword;
        this.index = index;
    }

    public StringSearchResult() {
    }

    public String keyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int index() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
