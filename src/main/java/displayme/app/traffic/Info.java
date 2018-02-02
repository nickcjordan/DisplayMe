
package displayme.app.traffic;

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
    "copyright",
    "statuscode",
    "messages"
})
public class Info implements Serializable
{

    @JsonProperty("copyright")
    private Copyright copyright;
    @JsonProperty("statuscode")
    private int statuscode;
    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8768724055678541753L;

    @JsonProperty("copyright")
    public Copyright getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    @JsonProperty("statuscode")
    public int getStatuscode() {
        return statuscode;
    }

    @JsonProperty("statuscode")
    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    @JsonProperty("messages")
    public List<Object> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Object> messages) {
        this.messages = messages;
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
