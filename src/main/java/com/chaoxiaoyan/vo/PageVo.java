package com.chaoxiaoyan.vo;

public class PageVo<T> {
    private  long count;
    private int page;
    private int size;
    private int totalpage;

    public void setCount(long count) {
        this.count = count;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public long getCount() {
        return count;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public int getTotalpage() {
        return totalpage;
    }
}
