package cn.edu.jxnu.awesome_campus.model.libary;

import java.util.List;

import cn.edu.jxnu.awesome_campus.model.IModel;

/**
 * Created by MummyDing on 16-1-27.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class BookBorrowedModel implements IModel<BookBorrowedModel> {

    /**
     * 已借图书缓存表
     */
    // 图书条形号
    private String BookCode;
    private String BookTitle;
    private String Author;
    // 借书日期
    private String BorrowTime;
    //
    // 应还日期
    private String ShouldBackTime;
    // 续借次数
    private String AgainTimes;
    // 馆藏地
    private String BookLocation;

    public BookBorrowedModel() {
    }

    public BookBorrowedModel(String bookCode, String bookTitle, String author, String borrowTime, String shouldBackTime, String againTimes, String bookLocation) {
        BookCode = bookCode;
        BookTitle = bookTitle;
        Author = author;
        BorrowTime = borrowTime;
        ShouldBackTime = shouldBackTime;
        AgainTimes = againTimes;
        BookLocation = bookLocation;
    }


    @Override
    public List<BookBorrowedModel> loadFromNet() {
        return null;
    }

    @Override
    public List<BookBorrowedModel> loadFromCache() {
        return null;
    }

    @Override
    public boolean cleanCache() {
        return false;
    }

    @Override
    public boolean cache() {
        return false;
    }


    public String getBookCode() {
        return BookCode;
    }

    public void setBookCode(String bookCode) {
        BookCode = bookCode;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBorrowTime() {
        return BorrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        BorrowTime = borrowTime;
    }

    public String getShouldBackTime() {
        return ShouldBackTime;
    }

    public void setShouldBackTime(String shouldBackTime) {
        ShouldBackTime = shouldBackTime;
    }

    public String getAgainTimes() {
        return AgainTimes;
    }

    public void setAgainTimes(String againTimes) {
        AgainTimes = againTimes;
    }

    public String getBookLocation() {
        return BookLocation;
    }

    public void setBookLocation(String bookLocation) {
        BookLocation = bookLocation;
    }
}
