
package home.antonyaskiv.testprojecttumblr.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dialogue {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("phrase")
    @Expose
    private String phrase;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

}
