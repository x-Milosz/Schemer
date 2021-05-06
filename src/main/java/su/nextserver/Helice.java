
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
    "bp_type",
    "helix_form",
    "index",
    "num_pairs",
    "num_stems",
    "pairs",
    "strand1",
    "strand2"
})
@Generated("jsonschema2pojo")
public class Helice {

    /**
     * The bp_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_type")
    private String bpType = "";
    /**
     * The helix_form schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helix_form")
    private String helixForm = "";
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
     * The num_pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_pairs")
    private Integer numPairs = 0;
    /**
     * The num_stems schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_stems")
    private Integer numStems = 0;
    /**
     * The pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pairs")
    private List<Pair> pairs = new ArrayList<Pair>();
    /**
     * The strand1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand1")
    private String strand1 = "";
    /**
     * The strand2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand2")
    private String strand2 = "";

    /**
     * The bp_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_type")
    public String getBpType() {
        return bpType;
    }

    /**
     * The bp_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_type")
    public void setBpType(String bpType) {
        this.bpType = bpType;
    }

    /**
     * The helix_form schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helix_form")
    public String getHelixForm() {
        return helixForm;
    }

    /**
     * The helix_form schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helix_form")
    public void setHelixForm(String helixForm) {
        this.helixForm = helixForm;
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
     * The num_pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_pairs")
    public Integer getNumPairs() {
        return numPairs;
    }

    /**
     * The num_pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_pairs")
    public void setNumPairs(Integer numPairs) {
        this.numPairs = numPairs;
    }

    /**
     * The num_stems schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_stems")
    public Integer getNumStems() {
        return numStems;
    }

    /**
     * The num_stems schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_stems")
    public void setNumStems(Integer numStems) {
        this.numStems = numStems;
    }

    /**
     * The pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pairs")
    public List<Pair> getPairs() {
        return pairs;
    }

    /**
     * The pairs schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pairs")
    public void setPairs(List<Pair> pairs) {
        this.pairs = pairs;
    }

    /**
     * The strand1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand1")
    public String getStrand1() {
        return strand1;
    }

    /**
     * The strand1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand1")
    public void setStrand1(String strand1) {
        this.strand1 = strand1;
    }

    /**
     * The strand2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand2")
    public String getStrand2() {
        return strand2;
    }

    /**
     * The strand2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("strand2")
    public void setStrand2(String strand2) {
        this.strand2 = strand2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Helice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bpType");
        sb.append('=');
        sb.append(((this.bpType == null)?"<null>":this.bpType));
        sb.append(',');
        sb.append("helixForm");
        sb.append('=');
        sb.append(((this.helixForm == null)?"<null>":this.helixForm));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("numPairs");
        sb.append('=');
        sb.append(((this.numPairs == null)?"<null>":this.numPairs));
        sb.append(',');
        sb.append("numStems");
        sb.append('=');
        sb.append(((this.numStems == null)?"<null>":this.numStems));
        sb.append(',');
        sb.append("pairs");
        sb.append('=');
        sb.append(((this.pairs == null)?"<null>":this.pairs));
        sb.append(',');
        sb.append("strand1");
        sb.append('=');
        sb.append(((this.strand1 == null)?"<null>":this.strand1));
        sb.append(',');
        sb.append("strand2");
        sb.append('=');
        sb.append(((this.strand2 == null)?"<null>":this.strand2));
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
        result = ((result* 31)+((this.bpType == null)? 0 :this.bpType.hashCode()));
        result = ((result* 31)+((this.numStems == null)? 0 :this.numStems.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.strand1 == null)? 0 :this.strand1 .hashCode()));
        result = ((result* 31)+((this.helixForm == null)? 0 :this.helixForm.hashCode()));
        result = ((result* 31)+((this.numPairs == null)? 0 :this.numPairs.hashCode()));
        result = ((result* 31)+((this.pairs == null)? 0 :this.pairs.hashCode()));
        result = ((result* 31)+((this.strand2 == null)? 0 :this.strand2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Helice) == false) {
            return false;
        }
        Helice rhs = ((Helice) other);
        return (((((((((this.bpType == rhs.bpType)||((this.bpType!= null)&&this.bpType.equals(rhs.bpType)))&&((this.numStems == rhs.numStems)||((this.numStems!= null)&&this.numStems.equals(rhs.numStems))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.strand1 == rhs.strand1)||((this.strand1 != null)&&this.strand1 .equals(rhs.strand1))))&&((this.helixForm == rhs.helixForm)||((this.helixForm!= null)&&this.helixForm.equals(rhs.helixForm))))&&((this.numPairs == rhs.numPairs)||((this.numPairs!= null)&&this.numPairs.equals(rhs.numPairs))))&&((this.pairs == rhs.pairs)||((this.pairs!= null)&&this.pairs.equals(rhs.pairs))))&&((this.strand2 == rhs.strand2)||((this.strand2 != null)&&this.strand2 .equals(rhs.strand2))));
    }

}
