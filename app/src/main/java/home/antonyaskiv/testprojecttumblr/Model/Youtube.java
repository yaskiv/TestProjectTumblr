
package home.antonyaskiv.testprojecttumblr.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Youtube {

    @SerializedName("video_id")
    @Expose
    private String videoId;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
