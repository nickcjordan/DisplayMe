
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
    "mustAvoidLinkIds",
    "drivingStyle",
    "countryBoundaryDisplay",
    "generalize",
    "narrativeType",
    "locale",
    "avoidTimedConditions",
    "destinationManeuverDisplay",
    "enhancedNarrative",
    "filterZoneFactor",
    "timeType",
    "maxWalkingDistance",
    "routeType",
    "transferPenalty",
    "walkingSpeed",
    "stateBoundaryDisplay",
    "maxLinkId",
    "arteryWeights",
    "tryAvoidLinkIds",
    "unit",
    "routeNumber",
    "doReverseGeocode",
    "shapeFormat",
    "maneuverPenalty",
    "useTraffic",
    "returnLinkDirections",
    "avoidTripIds",
    "manmaps",
    "highwayEfficiency",
    "sideOfStreetDisplay",
    "cyclingRoadFactor",
    "urbanAvoidFactor"
})
public class Options implements Serializable
{

    @JsonProperty("mustAvoidLinkIds")
    private List<Object> mustAvoidLinkIds = null;
    @JsonProperty("drivingStyle")
    private int drivingStyle;
    @JsonProperty("countryBoundaryDisplay")
    private boolean countryBoundaryDisplay;
    @JsonProperty("generalize")
    private int generalize;
    @JsonProperty("narrativeType")
    private String narrativeType;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("avoidTimedConditions")
    private boolean avoidTimedConditions;
    @JsonProperty("destinationManeuverDisplay")
    private boolean destinationManeuverDisplay;
    @JsonProperty("enhancedNarrative")
    private boolean enhancedNarrative;
    @JsonProperty("filterZoneFactor")
    private int filterZoneFactor;
    @JsonProperty("timeType")
    private int timeType;
    @JsonProperty("maxWalkingDistance")
    private int maxWalkingDistance;
    @JsonProperty("routeType")
    private String routeType;
    @JsonProperty("transferPenalty")
    private int transferPenalty;
    @JsonProperty("walkingSpeed")
    private int walkingSpeed;
    @JsonProperty("stateBoundaryDisplay")
    private boolean stateBoundaryDisplay;
    @JsonProperty("maxLinkId")
    private int maxLinkId;
    @JsonProperty("arteryWeights")
    private List<Object> arteryWeights = null;
    @JsonProperty("tryAvoidLinkIds")
    private List<Object> tryAvoidLinkIds = null;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("routeNumber")
    private int routeNumber;
    @JsonProperty("doReverseGeocode")
    private boolean doReverseGeocode;
    @JsonProperty("shapeFormat")
    private String shapeFormat;
    @JsonProperty("maneuverPenalty")
    private int maneuverPenalty;
    @JsonProperty("useTraffic")
    private boolean useTraffic;
    @JsonProperty("returnLinkDirections")
    private boolean returnLinkDirections;
    @JsonProperty("avoidTripIds")
    private List<Object> avoidTripIds = null;
    @JsonProperty("manmaps")
    private String manmaps;
    @JsonProperty("highwayEfficiency")
    private int highwayEfficiency;
    @JsonProperty("sideOfStreetDisplay")
    private boolean sideOfStreetDisplay;
    @JsonProperty("cyclingRoadFactor")
    private int cyclingRoadFactor;
    @JsonProperty("urbanAvoidFactor")
    private int urbanAvoidFactor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8165206367699675975L;

    @JsonProperty("mustAvoidLinkIds")
    public List<Object> getMustAvoidLinkIds() {
        return mustAvoidLinkIds;
    }

    @JsonProperty("mustAvoidLinkIds")
    public void setMustAvoidLinkIds(List<Object> mustAvoidLinkIds) {
        this.mustAvoidLinkIds = mustAvoidLinkIds;
    }

    @JsonProperty("drivingStyle")
    public int getDrivingStyle() {
        return drivingStyle;
    }

    @JsonProperty("drivingStyle")
    public void setDrivingStyle(int drivingStyle) {
        this.drivingStyle = drivingStyle;
    }

    @JsonProperty("countryBoundaryDisplay")
    public boolean isCountryBoundaryDisplay() {
        return countryBoundaryDisplay;
    }

    @JsonProperty("countryBoundaryDisplay")
    public void setCountryBoundaryDisplay(boolean countryBoundaryDisplay) {
        this.countryBoundaryDisplay = countryBoundaryDisplay;
    }

    @JsonProperty("generalize")
    public int getGeneralize() {
        return generalize;
    }

    @JsonProperty("generalize")
    public void setGeneralize(int generalize) {
        this.generalize = generalize;
    }

    @JsonProperty("narrativeType")
    public String getNarrativeType() {
        return narrativeType;
    }

    @JsonProperty("narrativeType")
    public void setNarrativeType(String narrativeType) {
        this.narrativeType = narrativeType;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("avoidTimedConditions")
    public boolean isAvoidTimedConditions() {
        return avoidTimedConditions;
    }

    @JsonProperty("avoidTimedConditions")
    public void setAvoidTimedConditions(boolean avoidTimedConditions) {
        this.avoidTimedConditions = avoidTimedConditions;
    }

    @JsonProperty("destinationManeuverDisplay")
    public boolean isDestinationManeuverDisplay() {
        return destinationManeuverDisplay;
    }

    @JsonProperty("destinationManeuverDisplay")
    public void setDestinationManeuverDisplay(boolean destinationManeuverDisplay) {
        this.destinationManeuverDisplay = destinationManeuverDisplay;
    }

    @JsonProperty("enhancedNarrative")
    public boolean isEnhancedNarrative() {
        return enhancedNarrative;
    }

    @JsonProperty("enhancedNarrative")
    public void setEnhancedNarrative(boolean enhancedNarrative) {
        this.enhancedNarrative = enhancedNarrative;
    }

    @JsonProperty("filterZoneFactor")
    public int getFilterZoneFactor() {
        return filterZoneFactor;
    }

    @JsonProperty("filterZoneFactor")
    public void setFilterZoneFactor(int filterZoneFactor) {
        this.filterZoneFactor = filterZoneFactor;
    }

    @JsonProperty("timeType")
    public int getTimeType() {
        return timeType;
    }

    @JsonProperty("timeType")
    public void setTimeType(int timeType) {
        this.timeType = timeType;
    }

    @JsonProperty("maxWalkingDistance")
    public int getMaxWalkingDistance() {
        return maxWalkingDistance;
    }

    @JsonProperty("maxWalkingDistance")
    public void setMaxWalkingDistance(int maxWalkingDistance) {
        this.maxWalkingDistance = maxWalkingDistance;
    }

    @JsonProperty("routeType")
    public String getRouteType() {
        return routeType;
    }

    @JsonProperty("routeType")
    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    @JsonProperty("transferPenalty")
    public int getTransferPenalty() {
        return transferPenalty;
    }

    @JsonProperty("transferPenalty")
    public void setTransferPenalty(int transferPenalty) {
        this.transferPenalty = transferPenalty;
    }

    @JsonProperty("walkingSpeed")
    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    @JsonProperty("walkingSpeed")
    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    @JsonProperty("stateBoundaryDisplay")
    public boolean isStateBoundaryDisplay() {
        return stateBoundaryDisplay;
    }

    @JsonProperty("stateBoundaryDisplay")
    public void setStateBoundaryDisplay(boolean stateBoundaryDisplay) {
        this.stateBoundaryDisplay = stateBoundaryDisplay;
    }

    @JsonProperty("maxLinkId")
    public int getMaxLinkId() {
        return maxLinkId;
    }

    @JsonProperty("maxLinkId")
    public void setMaxLinkId(int maxLinkId) {
        this.maxLinkId = maxLinkId;
    }

    @JsonProperty("arteryWeights")
    public List<Object> getArteryWeights() {
        return arteryWeights;
    }

    @JsonProperty("arteryWeights")
    public void setArteryWeights(List<Object> arteryWeights) {
        this.arteryWeights = arteryWeights;
    }

    @JsonProperty("tryAvoidLinkIds")
    public List<Object> getTryAvoidLinkIds() {
        return tryAvoidLinkIds;
    }

    @JsonProperty("tryAvoidLinkIds")
    public void setTryAvoidLinkIds(List<Object> tryAvoidLinkIds) {
        this.tryAvoidLinkIds = tryAvoidLinkIds;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("routeNumber")
    public int getRouteNumber() {
        return routeNumber;
    }

    @JsonProperty("routeNumber")
    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    @JsonProperty("doReverseGeocode")
    public boolean isDoReverseGeocode() {
        return doReverseGeocode;
    }

    @JsonProperty("doReverseGeocode")
    public void setDoReverseGeocode(boolean doReverseGeocode) {
        this.doReverseGeocode = doReverseGeocode;
    }

    @JsonProperty("shapeFormat")
    public String getShapeFormat() {
        return shapeFormat;
    }

    @JsonProperty("shapeFormat")
    public void setShapeFormat(String shapeFormat) {
        this.shapeFormat = shapeFormat;
    }

    @JsonProperty("maneuverPenalty")
    public int getManeuverPenalty() {
        return maneuverPenalty;
    }

    @JsonProperty("maneuverPenalty")
    public void setManeuverPenalty(int maneuverPenalty) {
        this.maneuverPenalty = maneuverPenalty;
    }

    @JsonProperty("useTraffic")
    public boolean isUseTraffic() {
        return useTraffic;
    }

    @JsonProperty("useTraffic")
    public void setUseTraffic(boolean useTraffic) {
        this.useTraffic = useTraffic;
    }

    @JsonProperty("returnLinkDirections")
    public boolean isReturnLinkDirections() {
        return returnLinkDirections;
    }

    @JsonProperty("returnLinkDirections")
    public void setReturnLinkDirections(boolean returnLinkDirections) {
        this.returnLinkDirections = returnLinkDirections;
    }

    @JsonProperty("avoidTripIds")
    public List<Object> getAvoidTripIds() {
        return avoidTripIds;
    }

    @JsonProperty("avoidTripIds")
    public void setAvoidTripIds(List<Object> avoidTripIds) {
        this.avoidTripIds = avoidTripIds;
    }

    @JsonProperty("manmaps")
    public String getManmaps() {
        return manmaps;
    }

    @JsonProperty("manmaps")
    public void setManmaps(String manmaps) {
        this.manmaps = manmaps;
    }

    @JsonProperty("highwayEfficiency")
    public int getHighwayEfficiency() {
        return highwayEfficiency;
    }

    @JsonProperty("highwayEfficiency")
    public void setHighwayEfficiency(int highwayEfficiency) {
        this.highwayEfficiency = highwayEfficiency;
    }

    @JsonProperty("sideOfStreetDisplay")
    public boolean isSideOfStreetDisplay() {
        return sideOfStreetDisplay;
    }

    @JsonProperty("sideOfStreetDisplay")
    public void setSideOfStreetDisplay(boolean sideOfStreetDisplay) {
        this.sideOfStreetDisplay = sideOfStreetDisplay;
    }

    @JsonProperty("cyclingRoadFactor")
    public int getCyclingRoadFactor() {
        return cyclingRoadFactor;
    }

    @JsonProperty("cyclingRoadFactor")
    public void setCyclingRoadFactor(int cyclingRoadFactor) {
        this.cyclingRoadFactor = cyclingRoadFactor;
    }

    @JsonProperty("urbanAvoidFactor")
    public int getUrbanAvoidFactor() {
        return urbanAvoidFactor;
    }

    @JsonProperty("urbanAvoidFactor")
    public void setUrbanAvoidFactor(int urbanAvoidFactor) {
        this.urbanAvoidFactor = urbanAvoidFactor;
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
