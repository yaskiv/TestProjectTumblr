
package home.antonyaskiv.testprojecttumblr.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("response")
    @Expose
    private Response_of_API responseOfAPI;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Response_of_API getResponseOfAPI() {
        return responseOfAPI;
    }

    public void setResponseOfAPI(Response_of_API responseOfAPI) {
        this.responseOfAPI = responseOfAPI;
    }

}
