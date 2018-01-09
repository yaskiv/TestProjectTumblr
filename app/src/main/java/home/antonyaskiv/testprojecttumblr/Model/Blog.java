
package home.antonyaskiv.testprojecttumblr.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Blog {

    @SerializedName("ask")
    @Expose
    private Boolean ask;
    @SerializedName("ask_anon")
    @Expose
    private Boolean askAnon;
    @SerializedName("ask_page_title")
    @Expose
    private String askPageTitle;
    @SerializedName("can_subscribe")
    @Expose
    private Boolean canSubscribe;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("is_adult")
    @Expose
    private Boolean isAdult;
    @SerializedName("is_nsfw")
    @Expose
    private Boolean isNsfw;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("posts")
    @Expose
    private Integer posts;
    @SerializedName("reply_conditions")
    @Expose
    private String replyConditions;
    @SerializedName("share_likes")
    @Expose
    private Boolean shareLikes;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("total_posts")
    @Expose
    private Integer totalPosts;
    @SerializedName("updated")
    @Expose
    private Integer updated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("is_optout_ads")
    @Expose
    private Boolean isOptoutAds;

    public Boolean getAsk() {
        return ask;
    }

    public void setAsk(Boolean ask) {
        this.ask = ask;
    }

    public Boolean getAskAnon() {
        return askAnon;
    }

    public void setAskAnon(Boolean askAnon) {
        this.askAnon = askAnon;
    }

    public String getAskPageTitle() {
        return askPageTitle;
    }

    public void setAskPageTitle(String askPageTitle) {
        this.askPageTitle = askPageTitle;
    }

    public Boolean getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(Boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(Boolean isAdult) {
        this.isAdult = isAdult;
    }

    public Boolean getIsNsfw() {
        return isNsfw;
    }

    public void setIsNsfw(Boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public String getReplyConditions() {
        return replyConditions;
    }

    public void setReplyConditions(String replyConditions) {
        this.replyConditions = replyConditions;
    }

    public Boolean getShareLikes() {
        return shareLikes;
    }

    public void setShareLikes(Boolean shareLikes) {
        this.shareLikes = shareLikes;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Integer totalPosts) {
        this.totalPosts = totalPosts;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsOptoutAds() {
        return isOptoutAds;
    }

    public void setIsOptoutAds(Boolean isOptoutAds) {
        this.isOptoutAds = isOptoutAds;
    }

}
