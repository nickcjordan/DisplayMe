
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
    "signs",
    "index",
    "maneuverNotes",
    "direction",
    "narrative",
    "iconUrl",
    "distance",
    "time",
    "linkIds",
    "streets",
    "attributes",
    "transportMode",
    "formattedTime",
    "directionName",
    "mapUrl",
    "startPoint",
    "turnType"
})
public class Maneuver implements Serializable
{

    @JsonProperty("signs")
    private List<Sign> signs = null;
    @JsonProperty("index")
    private int index;
    @JsonProperty("maneuverNotes")
    private List<Object> maneuverNotes = null;
    @JsonProperty("direction")
    private int direction;
    @JsonProperty("narrative")
    private String narrative;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("distance")
    private int distance;
    @JsonProperty("time")
    private int time;
    @JsonProperty("linkIds")
    private List<Object> linkIds = null;
    @JsonProperty("streets")
    private List<String> streets = null;
    @JsonProperty("attributes")
    private int attributes;
    @JsonProperty("transportMode")
    private String transportMode;
    @JsonProperty("formattedTime")
    private String formattedTime;
    @JsonProperty("directionName")
    private String directionName;
    @JsonProperty("mapUrl")
    private String mapUrl;
    @JsonProperty("startPoint")
    private StartPoint startPoint;
    @JsonProperty("turnType")
    private int turnType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7269390279211156296L;

    @JsonProperty("signs")
    public List<Sign> getSigns() {
        return signs;
    }

    @JsonProperty("signs")
    public void setSigns(List<Sign> signs) {
        this.signs = signs;
    }

    @JsonProperty("index")
    public int getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(int index) {
        this.index = index;
    }

    @JsonProperty("maneuverNotes")
    public List<Object> getManeuverNotes() {
        return maneuverNotes;
    }

    @JsonProperty("maneuverNotes")
    public void setManeuverNotes(List<Object> maneuverNotes) {
        this.maneuverNotes = maneuverNotes;
    }

    @JsonProperty("direction")
    public int getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(int direction) {
        this.direction = direction;
    }

    @JsonProperty("narrative")
    public String getNarrative() {
        return narrative;
    }

    @JsonProperty("narrative")
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("distance")
    public int getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(int distance) {
        this.distance = distance;
    }

    @JsonProperty("time")
    public int getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(int time) {
        this.time = time;
    }

    @JsonProperty("linkIds")
    public List<Object> getLinkIds() {
        return linkIds;
    }

    @JsonProperty("linkIds")
    public void setLinkIds(List<Object> linkIds) {
        this.linkIds = linkIds;
    }

    @JsonProperty("streets")
    public List<String> getStreets() {
        return streets;
    }

    @JsonProperty("streets")
    public void setStreets(List<String> streets) {
        this.streets = streets;
    }

    @JsonProperty("attributes")
    public int getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(int attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("transportMode")
    public String getTransportMode() {
        return transportMode;
    }

    @JsonProperty("transportMode")
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @JsonProperty("formattedTime")
    public String getFormattedTime() {
        return formattedTime;
    }

    @JsonProperty("formattedTime")
    public void setFormattedTime(String formattedTime) {
        this.formattedTime = formattedTime;
    }

    @JsonProperty("directionName")
    public String getDirectionName() {
        return directionName;
    }

    @JsonProperty("directionName")
    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    @JsonProperty("mapUrl")
    public String getMapUrl() {
        return mapUrl;
    }

    @JsonProperty("mapUrl")
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    @JsonProperty("startPoint")
    public StartPoint getStartPoint() {
        return startPoint;
    }

    @JsonProperty("startPoint")
    public void setStartPoint(StartPoint startPoint) {
        this.startPoint = startPoint;
    }

    @JsonProperty("turnType")
    public int getTurnType() {
        return turnType;
    }

    @JsonProperty("turnType")
    public void setTurnType(int turnType) {
        this.turnType = turnType;
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
