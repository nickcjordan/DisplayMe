
package displayme.app.traffic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "extraText",
    "direction",
    "type",
    "url"
})
public class Sign implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("extraText")
    private String extraText;
    @JsonProperty("direction")
    private int direction;
    @JsonProperty("type")
    private int type;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3394031603949636999L;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("extraText")
    public String getExtraText() {
        return extraText;
    }

    @JsonProperty("extraText")
    public void setExtraText(String extraText) {
        this.extraText = extraText;
    }

    @JsonProperty("direction")
    public int getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(int direction) {
        this.direction = direction;
    }

    @JsonProperty("type")
    public int getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(int type) {
        this.type = type;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
