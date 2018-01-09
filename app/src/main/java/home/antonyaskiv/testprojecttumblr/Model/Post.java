
package home.antonyaskiv.testprojecttumblr.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("blog_name")
    @Expose
    private String blogName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("post_url")
    @Expose
    private String postUrl;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("reblog_key")
    @Expose
    private String reblogKey;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("is_blocks_post_format")
    @Expose
    private Boolean isBlocksPostFormat;
    @SerializedName("recommended_source")
    @Expose
    private Object recommendedSource;
    @SerializedName("recommended_color")
    @Expose
    private Object recommendedColor;
    @SerializedName("note_count")
    @Expose
    private Integer noteCount;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("reblog")
    @Expose
    private Reblog reblog;
    @SerializedName("trail")
    @Expose
    private List<Trail> trail = null;
    @SerializedName("permalink_url")
    @Expose
    private String permalinkUrl;
    @SerializedName("html5_capable")
    @Expose
    private Boolean html5Capable;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    @Expose
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    @Expose
    private Integer thumbnailHeight;
   /* @SerializedName("player")
    @Expose
    private String player;*/
    @SerializedName("video_type")
    @Expose
    private String videoType;
    @SerializedName("can_like")
    @Expose
    private Boolean canLike;
    @SerializedName("can_reblog")
    @Expose
    private Boolean canReblog;
    @SerializedName("can_send_in_message")
    @Expose
    private Boolean canSendInMessage;
    @SerializedName("can_reply")
    @Expose
    private Boolean canReply;
    @SerializedName("display_avatar")
    @Expose
    private Boolean displayAvatar;
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;
    @SerializedName("source_title")
    @Expose
    private String sourceTitle;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("album")
    @Expose
    private String album;
    @SerializedName("track_name")
    @Expose
    private String trackName;
    @SerializedName("album_art")
    @Expose
    private String albumArt;
    @SerializedName("embed")
    @Expose
    private String embed;
    @SerializedName("plays")
    @Expose
    private Integer plays;
    @SerializedName("audio_url")
    @Expose
    private String audioUrl;
    @SerializedName("audio_source_url")
    @Expose
    private String audioSourceUrl;
    @SerializedName("provider_uri")
    @Expose
    private String providerUri;
    @SerializedName("is_external")
    @Expose
    private Boolean isExternal;
    @SerializedName("audio_type")
    @Expose
    private String audioType;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("dialogue")
    @Expose
    private List<Dialogue> dialogue = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("link_author")
    @Expose
    private Object linkAuthor;
    @SerializedName("excerpt")
    @Expose
    private Object excerpt;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("image_permalink")
    @Expose
    private String imagePermalink;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getReblogKey() {
        return reblogKey;
    }

    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getIsBlocksPostFormat() {
        return isBlocksPostFormat;
    }

    public void setIsBlocksPostFormat(Boolean isBlocksPostFormat) {
        this.isBlocksPostFormat = isBlocksPostFormat;
    }

    public Object getRecommendedSource() {
        return recommendedSource;
    }

    public void setRecommendedSource(Object recommendedSource) {
        this.recommendedSource = recommendedSource;
    }

    public Object getRecommendedColor() {
        return recommendedColor;
    }

    public void setRecommendedColor(Object recommendedColor) {
        this.recommendedColor = recommendedColor;
    }

    public Integer getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(Integer noteCount) {
        this.noteCount = noteCount;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Reblog getReblog() {
        return reblog;
    }

    public void setReblog(Reblog reblog) {
        this.reblog = reblog;
    }

    public List<Trail> getTrail() {
        return trail;
    }

    public void setTrail(List<Trail> trail) {
        this.trail = trail;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public Boolean getHtml5Capable() {
        return html5Capable;
    }

    public void setHtml5Capable(Boolean html5Capable) {
        this.html5Capable = html5Capable;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

  /*  public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }*/

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Boolean getCanReblog() {
        return canReblog;
    }

    public void setCanReblog(Boolean canReblog) {
        this.canReblog = canReblog;
    }

    public Boolean getCanSendInMessage() {
        return canSendInMessage;
    }

    public void setCanSendInMessage(Boolean canSendInMessage) {
        this.canSendInMessage = canSendInMessage;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public Boolean getDisplayAvatar() {
        return displayAvatar;
    }

    public void setDisplayAvatar(Boolean displayAvatar) {
        this.displayAvatar = displayAvatar;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public Integer getPlays() {
        return plays;
    }

    public void setPlays(Integer plays) {
        this.plays = plays;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getAudioSourceUrl() {
        return audioSourceUrl;
    }

    public void setAudioSourceUrl(String audioSourceUrl) {
        this.audioSourceUrl = audioSourceUrl;
    }

    public String getProviderUri() {
        return providerUri;
    }

    public void setProviderUri(String providerUri) {
        this.providerUri = providerUri;
    }

    public Boolean getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Dialogue> getDialogue() {
        return dialogue;
    }

    public void setDialogue(List<Dialogue> dialogue) {
        this.dialogue = dialogue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getLinkAuthor() {
        return linkAuthor;
    }

    public void setLinkAuthor(Object linkAuthor) {
        this.linkAuthor = linkAuthor;
    }

    public Object getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Object excerpt) {
        this.excerpt = excerpt;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImagePermalink() {
        return imagePermalink;
    }

    public void setImagePermalink(String imagePermalink) {
        this.imagePermalink = imagePermalink;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

}
