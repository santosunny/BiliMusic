package com.example.sunny.bilimusic.bean;

import java.util.List;

/**
 * Create on 18.7.12 23:55
 * <p>
 * author Zhang Zhixiang
 * <p>
 * Description:
 */
public class MusicInfo {


    /**
     * rating : {"max":10,"average":"9.3","numRaters":316,"min":0}
     * author : [{"name":"Lovestoned"}]
     * alt_title : 再见欢乐曲
     * image : https://img3.doubanio.com/view/subject/s/public/s4693961.jpg
     * title : Bye Bye Bye
     * mobile_link : https://m.douban.com/music/subject/6075537/
     * summary : Lovestoned / 单曲 / 2010-09-12 / 瑞典 / CD
     * attrs : {"publisher":["瑞典"],"singer":["Lovestoned"],"version":["单曲"],"pubdate":["2010-09-12"],"title":["Bye Bye Bye"],"media":["CD"],"tracks":["bye bye  bye"],"discs":["1"]}
     * alt : https://music.douban.com/subject/6075537/
     * id : 6075537
     * tags : [{"count":72,"name":"Lovestoned"},{"count":62,"name":"欢快"},{"count":43,"name":"瑞典"},{"count":30,"name":"欧美"},{"count":29,"name":"女声"},{"count":18,"name":"乡村"},{"count":16,"name":"POP"},{"count":15,"name":"Bye"}]
     */

    private RatingBean rating;
    private String alt_title;
    private String image;
    private String title;
    private String mobile_link;
    private String summary;
    private AttrsBean attrs;
    private String alt;
    private String id;
    private List<AuthorBean> author;
    private List<TagsBean> tags;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getAlt_title() {
        return alt_title;
    }

    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile_link() {
        return mobile_link;
    }

    public void setMobile_link(String mobile_link) {
        this.mobile_link = mobile_link;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public AttrsBean getAttrs() {
        return attrs;
    }

    public void setAttrs(AttrsBean attrs) {
        this.attrs = attrs;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<AuthorBean> getAuthor() {
        return author;
    }

    public void setAuthor(List<AuthorBean> author) {
        this.author = author;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 9.3
         * numRaters : 316
         * min : 0
         */

        private int max;
        private String average;
        private int numRaters;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public int getNumRaters() {
            return numRaters;
        }

        public void setNumRaters(int numRaters) {
            this.numRaters = numRaters;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class AttrsBean {
        private List<String> publisher;
        private List<String> singer;
        private List<String> version;
        private List<String> pubdate;
        private List<String> title;
        private List<String> media;
        private List<String> tracks;
        private List<String> discs;

        public List<String> getPublisher() {
            return publisher;
        }

        public void setPublisher(List<String> publisher) {
            this.publisher = publisher;
        }

        public List<String> getSinger() {
            return singer;
        }

        public void setSinger(List<String> singer) {
            this.singer = singer;
        }

        public List<String> getVersion() {
            return version;
        }

        public void setVersion(List<String> version) {
            this.version = version;
        }

        public List<String> getPubdate() {
            return pubdate;
        }

        public void setPubdate(List<String> pubdate) {
            this.pubdate = pubdate;
        }

        public List<String> getTitle() {
            return title;
        }

        public void setTitle(List<String> title) {
            this.title = title;
        }

        public List<String> getMedia() {
            return media;
        }

        public void setMedia(List<String> media) {
            this.media = media;
        }

        public List<String> getTracks() {
            return tracks;
        }

        public void setTracks(List<String> tracks) {
            this.tracks = tracks;
        }

        public List<String> getDiscs() {
            return discs;
        }

        public void setDiscs(List<String> discs) {
            this.discs = discs;
        }
    }

    public static class AuthorBean {
        /**
         * name : Lovestoned
         */

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class TagsBean {
        /**
         * count : 72
         * name : Lovestoned
         */

        private int count;
        private String name;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
