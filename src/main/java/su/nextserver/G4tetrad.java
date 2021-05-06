
package su.nextserver;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The items schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "G1G2_simpleParams",
    "G2G3_simpleParams",
    "G3G4_simpleParams",
    "G4G1_simpleParams",
    "direction",
    "frame",
    "glyco_bond",
    "groove_distPP",
    "groove_type",
    "index",
    "nts_long",
    "nts_short",
    "num_nts",
    "planarity",
    "rmsd",
    "topo_class",
    "type"
})
@Generated("jsonschema2pojo")
public class G4tetrad {

    /**
     * The G1G2_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G1G2_simpleParams")
    private List<Double> g1G2SimpleParams = new ArrayList<Double>();
    /**
     * The G2G3_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G2G3_simpleParams")
    private List<Double> g2G3SimpleParams = new ArrayList<Double>();
    /**
     * The G3G4_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G3G4_simpleParams")
    private List<Double> g3G4SimpleParams = new ArrayList<Double>();
    /**
     * The G4G1_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4G1_simpleParams")
    private List<Double> g4G1SimpleParams = new ArrayList<Double>();
    /**
     * The direction schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    private String direction = "";
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    private Frame frame;
    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    private String glycoBond = "";
    /**
     * The groove_distPP schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_distPP")
    private List<Double> grooveDistPP = new ArrayList<Double>();
    /**
     * The groove_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_type")
    private String grooveType = "";
    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    private Integer index = 0;
    /**
     * The nts_long schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_long")
    private String ntsLong = "";
    /**
     * The nts_short schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_short")
    private String ntsShort = "";
    /**
     * The num_nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_nts")
    private Integer numNts = 0;
    /**
     * The planarity schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("planarity")
    private Double planarity = 0.0D;
    /**
     * The rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmsd")
    private Double rmsd = 0.0D;
    /**
     * The topo_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("topo_class")
    private String topoClass = "";
    /**
     * The type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type = "";

    /**
     * The G1G2_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G1G2_simpleParams")
    public List<Double> getG1G2SimpleParams() {
        return g1G2SimpleParams;
    }

    /**
     * The G1G2_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G1G2_simpleParams")
    public void setG1G2SimpleParams(List<Double> g1G2SimpleParams) {
        this.g1G2SimpleParams = g1G2SimpleParams;
    }

    /**
     * The G2G3_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G2G3_simpleParams")
    public List<Double> getG2G3SimpleParams() {
        return g2G3SimpleParams;
    }

    /**
     * The G2G3_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G2G3_simpleParams")
    public void setG2G3SimpleParams(List<Double> g2G3SimpleParams) {
        this.g2G3SimpleParams = g2G3SimpleParams;
    }

    /**
     * The G3G4_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G3G4_simpleParams")
    public List<Double> getG3G4SimpleParams() {
        return g3G4SimpleParams;
    }

    /**
     * The G3G4_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G3G4_simpleParams")
    public void setG3G4SimpleParams(List<Double> g3G4SimpleParams) {
        this.g3G4SimpleParams = g3G4SimpleParams;
    }

    /**
     * The G4G1_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4G1_simpleParams")
    public List<Double> getG4G1SimpleParams() {
        return g4G1SimpleParams;
    }

    /**
     * The G4G1_simpleParams schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4G1_simpleParams")
    public void setG4G1SimpleParams(List<Double> g4G1SimpleParams) {
        this.g4G1SimpleParams = g4G1SimpleParams;
    }

    /**
     * The direction schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * The direction schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public Frame getFrame() {
        return frame;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    public String getGlycoBond() {
        return glycoBond;
    }

    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    public void setGlycoBond(String glycoBond) {
        this.glycoBond = glycoBond;
    }

    /**
     * The groove_distPP schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_distPP")
    public List<Double> getGrooveDistPP() {
        return grooveDistPP;
    }

    /**
     * The groove_distPP schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_distPP")
    public void setGrooveDistPP(List<Double> grooveDistPP) {
        this.grooveDistPP = grooveDistPP;
    }

    /**
     * The groove_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_type")
    public String getGrooveType() {
        return grooveType;
    }

    /**
     * The groove_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("groove_type")
    public void setGrooveType(String grooveType) {
        this.grooveType = grooveType;
    }

    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * The nts_long schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_long")
    public String getNtsLong() {
        return ntsLong;
    }

    /**
     * The nts_long schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_long")
    public void setNtsLong(String ntsLong) {
        this.ntsLong = ntsLong;
    }

    /**
     * The nts_short schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_short")
    public String getNtsShort() {
        return ntsShort;
    }

    /**
     * The nts_short schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts_short")
    public void setNtsShort(String ntsShort) {
        this.ntsShort = ntsShort;
    }

    /**
     * The num_nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_nts")
    public Integer getNumNts() {
        return numNts;
    }

    /**
     * The num_nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_nts")
    public void setNumNts(Integer numNts) {
        this.numNts = numNts;
    }

    /**
     * The planarity schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("planarity")
    public Double getPlanarity() {
        return planarity;
    }

    /**
     * The planarity schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("planarity")
    public void setPlanarity(Double planarity) {
        this.planarity = planarity;
    }

    /**
     * The rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmsd")
    public Double getRmsd() {
        return rmsd;
    }

    /**
     * The rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmsd")
    public void setRmsd(Double rmsd) {
        this.rmsd = rmsd;
    }

    /**
     * The topo_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("topo_class")
    public String getTopoClass() {
        return topoClass;
    }

    /**
     * The topo_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("topo_class")
    public void setTopoClass(String topoClass) {
        this.topoClass = topoClass;
    }

    /**
     * The type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(G4tetrad.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("g1G2SimpleParams");
        sb.append('=');
        sb.append(((this.g1G2SimpleParams == null)?"<null>":this.g1G2SimpleParams));
        sb.append(',');
        sb.append("g2G3SimpleParams");
        sb.append('=');
        sb.append(((this.g2G3SimpleParams == null)?"<null>":this.g2G3SimpleParams));
        sb.append(',');
        sb.append("g3G4SimpleParams");
        sb.append('=');
        sb.append(((this.g3G4SimpleParams == null)?"<null>":this.g3G4SimpleParams));
        sb.append(',');
        sb.append("g4G1SimpleParams");
        sb.append('=');
        sb.append(((this.g4G1SimpleParams == null)?"<null>":this.g4G1SimpleParams));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("frame");
        sb.append('=');
        sb.append(((this.frame == null)?"<null>":this.frame));
        sb.append(',');
        sb.append("glycoBond");
        sb.append('=');
        sb.append(((this.glycoBond == null)?"<null>":this.glycoBond));
        sb.append(',');
        sb.append("grooveDistPP");
        sb.append('=');
        sb.append(((this.grooveDistPP == null)?"<null>":this.grooveDistPP));
        sb.append(',');
        sb.append("grooveType");
        sb.append('=');
        sb.append(((this.grooveType == null)?"<null>":this.grooveType));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("ntsLong");
        sb.append('=');
        sb.append(((this.ntsLong == null)?"<null>":this.ntsLong));
        sb.append(',');
        sb.append("ntsShort");
        sb.append('=');
        sb.append(((this.ntsShort == null)?"<null>":this.ntsShort));
        sb.append(',');
        sb.append("numNts");
        sb.append('=');
        sb.append(((this.numNts == null)?"<null>":this.numNts));
        sb.append(',');
        sb.append("planarity");
        sb.append('=');
        sb.append(((this.planarity == null)?"<null>":this.planarity));
        sb.append(',');
        sb.append("rmsd");
        sb.append('=');
        sb.append(((this.rmsd == null)?"<null>":this.rmsd));
        sb.append(',');
        sb.append("topoClass");
        sb.append('=');
        sb.append(((this.topoClass == null)?"<null>":this.topoClass));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.g1G2SimpleParams == null)? 0 :this.g1G2SimpleParams.hashCode()));
        result = ((result* 31)+((this.glycoBond == null)? 0 :this.glycoBond.hashCode()));
        result = ((result* 31)+((this.g2G3SimpleParams == null)? 0 :this.g2G3SimpleParams.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.ntsLong == null)? 0 :this.ntsLong.hashCode()));
        result = ((result* 31)+((this.topoClass == null)? 0 :this.topoClass.hashCode()));
        result = ((result* 31)+((this.g3G4SimpleParams == null)? 0 :this.g3G4SimpleParams.hashCode()));
        result = ((result* 31)+((this.g4G1SimpleParams == null)? 0 :this.g4G1SimpleParams.hashCode()));
        result = ((result* 31)+((this.planarity == null)? 0 :this.planarity.hashCode()));
        result = ((result* 31)+((this.rmsd == null)? 0 :this.rmsd.hashCode()));
        result = ((result* 31)+((this.grooveType == null)? 0 :this.grooveType.hashCode()));
        result = ((result* 31)+((this.ntsShort == null)? 0 :this.ntsShort.hashCode()));
        result = ((result* 31)+((this.grooveDistPP == null)? 0 :this.grooveDistPP.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        result = ((result* 31)+((this.frame == null)? 0 :this.frame.hashCode()));
        result = ((result* 31)+((this.numNts == null)? 0 :this.numNts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof G4tetrad) == false) {
            return false;
        }
        G4tetrad rhs = ((G4tetrad) other);
        return ((((((((((((((((((this.g1G2SimpleParams == rhs.g1G2SimpleParams)||((this.g1G2SimpleParams!= null)&&this.g1G2SimpleParams.equals(rhs.g1G2SimpleParams)))&&((this.glycoBond == rhs.glycoBond)||((this.glycoBond!= null)&&this.glycoBond.equals(rhs.glycoBond))))&&((this.g2G3SimpleParams == rhs.g2G3SimpleParams)||((this.g2G3SimpleParams!= null)&&this.g2G3SimpleParams.equals(rhs.g2G3SimpleParams))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.ntsLong == rhs.ntsLong)||((this.ntsLong!= null)&&this.ntsLong.equals(rhs.ntsLong))))&&((this.topoClass == rhs.topoClass)||((this.topoClass!= null)&&this.topoClass.equals(rhs.topoClass))))&&((this.g3G4SimpleParams == rhs.g3G4SimpleParams)||((this.g3G4SimpleParams!= null)&&this.g3G4SimpleParams.equals(rhs.g3G4SimpleParams))))&&((this.g4G1SimpleParams == rhs.g4G1SimpleParams)||((this.g4G1SimpleParams!= null)&&this.g4G1SimpleParams.equals(rhs.g4G1SimpleParams))))&&((this.planarity == rhs.planarity)||((this.planarity!= null)&&this.planarity.equals(rhs.planarity))))&&((this.rmsd == rhs.rmsd)||((this.rmsd!= null)&&this.rmsd.equals(rhs.rmsd))))&&((this.grooveType == rhs.grooveType)||((this.grooveType!= null)&&this.grooveType.equals(rhs.grooveType))))&&((this.ntsShort == rhs.ntsShort)||((this.ntsShort!= null)&&this.ntsShort.equals(rhs.ntsShort))))&&((this.grooveDistPP == rhs.grooveDistPP)||((this.grooveDistPP!= null)&&this.grooveDistPP.equals(rhs.grooveDistPP))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))))&&((this.frame == rhs.frame)||((this.frame!= null)&&this.frame.equals(rhs.frame))))&&((this.numNts == rhs.numNts)||((this.numNts!= null)&&this.numNts.equals(rhs.numNts))));
    }

}
