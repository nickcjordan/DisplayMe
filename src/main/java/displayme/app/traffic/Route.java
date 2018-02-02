
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
    "hasBridge",
    "computedWaypoints",
    "fuelUsed",
    "hasTunnel",
    "hasUnpaved",
    "hasHighway",
    "realTime",
    "boundingBox",
    "distance",
    "time",
    "locationSequence",
    "hasSeasonalClosure",
    "sessionId",
    "locations",
    "hasCountryCross",
    "legs",
    "formattedTime",
    "routeError",
    "options",
    "hasFerry"
})
public class Route implements Serializable
{

    @JsonProperty("hasTollRoad")
    private boolean hasTollRoad;
    @JsonProperty("hasBridge")
    private boolean hasBridge;
    @JsonProperty("computedWaypoints")
    private List<Object> computedWaypoints = null;
    @JsonProperty("fuelUsed")
    private double fuelUsed;
    @JsonProperty("hasTunnel")
    private boolean hasTunnel;
    @JsonProperty("hasUnpaved")
    private boolean hasUnpaved;
    @JsonProperty("hasHighway")
    private boolean hasHighway;
    @JsonProperty("realTime")
    private int realTime;
    @JsonProperty("boundingBox")
    private BoundingBox boundingBox;
    @JsonProperty("distance")
    private double distance;
    @JsonProperty("time")
    private int time;
    @JsonProperty("locationSequence")
    private List<Integer> locationSequence = null;
    @JsonProperty("hasSeasonalClosure")
    private boolean hasSeasonalClosure;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("locations")
    private List<Location> locations = null;
    @JsonProperty("hasCountryCross")
    private boolean hasCountryCross;
    @JsonProperty("legs")
    private List<Leg> legs = null;
    @JsonProperty("formattedTime")
    private String formattedTime;
    @JsonProperty("routeError")
    private RouteError routeError;
    @JsonProperty("options")
    private Options options;
    @JsonProperty("hasFerry")
    private boolean hasFerry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7961468485240277909L;

    @JsonProperty("hasTollRoad")
    public boolean isHasTollRoad() {
        return hasTollRoad;
    }

    @JsonProperty("hasTollRoad")
    public void setHasTollRoad(boolean hasTollRoad) {
        this.hasTollRoad = hasTollRoad;
    }

    @JsonProperty("hasBridge")
    public boolean isHasBridge() {
        return hasBridge;
    }

    @JsonProperty("hasBridge")
    public void setHasBridge(boolean hasBridge) {
        this.hasBridge = hasBridge;
    }

    @JsonProperty("computedWaypoints")
    public List<Object> getComputedWaypoints() {
        return computedWaypoints;
    }

    @JsonProperty("computedWaypoints")
    public void setComputedWaypoints(List<Object> computedWaypoints) {
        this.computedWaypoints = computedWaypoints;
    }

    @JsonProperty("fuelUsed")
    public double getFuelUsed() {
        return fuelUsed;
    }

    @JsonProperty("fuelUsed")
    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    @JsonProperty("hasTunnel")
    public boolean isHasTunnel() {
        return hasTunnel;
    }

    @JsonProperty("hasTunnel")
    public void setHasTunnel(boolean hasTunnel) {
        this.hasTunnel = hasTunnel;
    }

    @JsonProperty("hasUnpaved")
    public boolean isHasUnpaved() {
        return hasUnpaved;
    }

    @JsonProperty("hasUnpaved")
    public void setHasUnpaved(boolean hasUnpaved) {
        this.hasUnpaved = hasUnpaved;
    }

    @JsonProperty("hasHighway")
    public boolean isHasHighway() {
        return hasHighway;
    }

    @JsonProperty("hasHighway")
    public void setHasHighway(boolean hasHighway) {
        this.hasHighway = hasHighway;
    }

    @JsonProperty("realTime")
    public int getRealTime() {
        return realTime;
    }

    @JsonProperty("realTime")
    public void setRealTime(int realTime) {
        this.realTime = realTime;
    }

    @JsonProperty("boundingBox")
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    @JsonProperty("boundingBox")
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
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

    @JsonProperty("locationSequence")
    public List<Integer> getLocationSequence() {
        return locationSequence;
    }

    @JsonProperty("locationSequence")
    public void setLocationSequence(List<Integer> locationSequence) {
        this.locationSequence = locationSequence;
    }

    @JsonProperty("hasSeasonalClosure")
    public boolean isHasSeasonalClosure() {
        return hasSeasonalClosure;
    }

    @JsonProperty("hasSeasonalClosure")
    public void setHasSeasonalClosure(boolean hasSeasonalClosure) {
        this.hasSeasonalClosure = hasSeasonalClosure;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("hasCountryCross")
    public boolean isHasCountryCross() {
        return hasCountryCross;
    }

    @JsonProperty("hasCountryCross")
    public void setHasCountryCross(boolean hasCountryCross) {
        this.hasCountryCross = hasCountryCross;
    }

    @JsonProperty("legs")
    public List<Leg> getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    @JsonProperty("formattedTime")
    public String getFormattedTime() {
        return formattedTime;
    }

    @JsonProperty("formattedTime")
    public void setFormattedTime(String formattedTime) {
        this.formattedTime = formattedTime;
    }

    @JsonProperty("routeError")
    public RouteError getRouteError() {
        return routeError;
    }

    @JsonProperty("routeError")
    public void setRouteError(RouteError routeError) {
        this.routeError = routeError;
    }

    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
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
