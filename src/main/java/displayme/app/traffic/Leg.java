
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
    "hasTollRoad",
    "index",
    "hasBridge",
    "hasTunnel",
    "roadGradeStrategy",
    "hasHighway",
    "hasUnpaved",
    "distance",
    "time",
    "origIndex",
    "hasSeasonalClosure",
    "origNarrative",
    "hasCountryCross",
    "formattedTime",
    "destNarrative",
    "destIndex",
    "maneuvers",
    "hasFerry"
})
public class Leg implements Serializable
{

    @JsonProperty("hasTollRoad")
    private boolean hasTollRoad;
    @JsonProperty("index")
    private int index;
    @JsonProperty("hasBridge")
    private boolean hasBridge;
    @JsonProperty("hasTunnel")
    private boolean hasTunnel;
    @JsonProperty("roadGradeStrategy")
    private List<List<Object>> roadGradeStrategy = null;
    @JsonProperty("hasHighway")
    private boolean hasHighway;
    @JsonProperty("hasUnpaved")
    private boolean hasUnpaved;
    @JsonProperty("distance")
    private double distance;
    @JsonProperty("time")
    private int time;
    @JsonProperty("origIndex")
    private int origIndex;
    @JsonProperty("hasSeasonalClosure")
    private boolean hasSeasonalClosure;
    @JsonProperty("origNarrative")
    private String origNarrative;
    @JsonProperty("hasCountryCross")
    private boolean hasCountryCross;
    @JsonProperty("formattedTime")
    private String formattedTime;
    @JsonProperty("destNarrative")
    private String destNarrative;
    @JsonProperty("destIndex")
    private int destIndex;
    @JsonProperty("maneuvers")
    private List<Maneuver> maneuvers = null;
    @JsonProperty("hasFerry")
    private boolean hasFerry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2401359732693549321L;

    @JsonProperty("hasTollRoad")
    public boolean isHasTollRoad() {
        return hasTollRoad;
    }

    @JsonProperty("hasTollRoad")
    public void setHasTollRoad(boolean hasTollRoad) {
        this.hasTollRoad = hasTollRoad;
    }

    @JsonProperty("index")
    public int getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(int index) {
        this.index = index;
    }

    @JsonProperty("hasBridge")
    public boolean isHasBridge() {
        return hasBridge;
    }

    @JsonProperty("hasBridge")
    public void setHasBridge(boolean hasBridge) {
        this.hasBridge = hasBridge;
    }

    @JsonProperty("hasTunnel")
    public boolean isHasTunnel() {
        return hasTunnel;
    }

    @JsonProperty("hasTunnel")
    public void setHasTunnel(boolean hasTunnel) {
        this.hasTunnel = hasTunnel;
    }

    @JsonProperty("roadGradeStrategy")
    public List<List<Object>> getRoadGradeStrategy() {
        return roadGradeStrategy;
    }

    @JsonProperty("roadGradeStrategy")
    public void setRoadGradeStrategy(List<List<Object>> roadGradeStrategy) {
        this.roadGradeStrategy = roadGradeStrategy;
    }

    @JsonProperty("hasHighway")
    public boolean isHasHighway() {
        return hasHighway;
    }

    @JsonProperty("hasHighway")
    public void setHasHighway(boolean hasHighway) {
        this.hasHighway = hasHighway;
    }

    @JsonProperty("hasUnpaved")
    public boolean isHasUnpaved() {
        return hasUnpaved;
    }

    @JsonProperty("hasUnpaved")
    public void setHasUnpaved(boolean hasUnpaved) {
        this.hasUnpaved = hasUnpaved;
    }

    @JsonProperty("distance")
    public double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(double distance) {
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

    @JsonProperty("origIndex")
    public int getOrigIndex() {
        return origIndex;
    }

    @JsonProperty("origIndex")
    public void setOrigIndex(int origIndex) {
        this.origIndex = origIndex;
    }

    @JsonProperty("hasSeasonalClosure")
    public boolean isHasSeasonalClosure() {
        return hasSeasonalClosure;
    }

    @JsonProperty("hasSeasonalClosure")
    public void setHasSeasonalClosure(boolean hasSeasonalClosure) {
        this.hasSeasonalClosure = hasSeasonalClosure;
    }

    @JsonProperty("origNarrative")
    public String getOrigNarrative() {
        return origNarrative;
    }

    @JsonProperty("origNarrative")
    public void setOrigNarrative(String origNarrative) {
        this.origNarrative = origNarrative;
    }

    @JsonProperty("hasCountryCross")
    public boolean isHasCountryCross() {
        return hasCountryCross;
    }

    @JsonProperty("hasCountryCross")
    public void setHasCountryCross(boolean hasCountryCross) {
        this.hasCountryCross = hasCountryCross;
    }

    @JsonProperty("formattedTime")
    public String getFormattedTime() {
        return formattedTime;
    }

    @JsonProperty("formattedTime")
    public void setFormattedTime(String formattedTime) {
        this.formattedTime = formattedTime;
    }

    @JsonProperty("destNarrative")
    public String getDestNarrative() {
        return destNarrative;
    }

    @JsonProperty("destNarrative")
    public void setDestNarrative(String destNarrative) {
        this.destNarrative = destNarrative;
    }

    @JsonProperty("destIndex")
    public int getDestIndex() {
        return destIndex;
    }

    @JsonProperty("destIndex")
    public void setDestIndex(int destIndex) {
        this.destIndex = destIndex;
    }

    @JsonProperty("maneuvers")
    public List<Maneuver> getManeuvers() {
        return maneuvers;
    }

    @JsonProperty("maneuvers")
    public void setManeuvers(List<Maneuver> maneuvers) {
        this.maneuvers = maneuvers;
    }

    @JsonProperty("hasFerry")
    public boolean isHasFerry() {
        return hasFerry;
    }

    @JsonProperty("hasFerry")
    public void setHasFerry(boolean hasFerry) {
        this.hasFerry = hasFerry;
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
