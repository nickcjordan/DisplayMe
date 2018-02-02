
package displayme.app.joke;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attachments",
    "response_type",
    "username"
})
public class JokeAPIResponse implements Serializable
{

    @JsonProperty("attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("response_type")
    private String responseType;
    @JsonProperty("username")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4928373248867469262L;

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("response_type")
    public String getResponseType() {
        return responseType;
    }

    @JsonProperty("response_type")
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
