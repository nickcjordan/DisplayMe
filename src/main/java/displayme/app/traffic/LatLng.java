
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
    "lng",
    "lat"
})
public class LatLng implements Serializable
{

    @JsonProperty("lng")
    private double lng;
    @JsonProperty("lat")
    private double lat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3978519622797122878L;

    @JsonProperty("lng")
    public double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(double lng) {
        this.lng = lng;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
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
