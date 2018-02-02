
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
    "ul",
    "lr"
})
public class BoundingBox implements Serializable
{

    @JsonProperty("ul")
    private Ul ul;
    @JsonProperty("lr")
    private Lr lr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6905368443579502173L;

    @JsonProperty("ul")
    public Ul getUl() {
        return ul;
    }

    @JsonProperty("ul")
    public void setUl(Ul ul) {
        this.ul = ul;
    }

    @JsonProperty("lr")
    public Lr getLr() {
        return lr;
    }

    @JsonProperty("lr")
    public void setLr(Lr lr) {
        this.lr = lr;
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
