
package home.antonyaskiv.testprojecttumblr.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reblog {

    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("tree_html")
    @Expose
    private String treeHtml;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTreeHtml() {
        return treeHtml;
    }

    public void setTreeHtml(String treeHtml) {
        this.treeHtml = treeHtml;
    }

}
