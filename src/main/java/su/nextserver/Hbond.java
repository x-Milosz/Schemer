
package su.nextserver;

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
    "atom1_id",
    "atom1_serNum",
    "atom2_id",
    "atom2_serNum",
    "atom_pair",
    "distance",
    "donAcc_type",
    "index",
    "residue_pair"
})
@Generated("jsonschema2pojo")
public class Hbond {

    /**
     * The atom1_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_id")
    private String atom1Id = "";
    /**
     * The atom1_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_serNum")
    private Integer atom1SerNum = 0;
    /**
     * The atom2_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_id")
    private String atom2Id = "";
    /**
     * The atom2_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_serNum")
    private Integer atom2SerNum = 0;
    /**
     * The atom_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom_pair")
    private String atomPair = "";
    /**
     * The distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("distance")
    private Double distance = 0.0D;
    /**
     * The donAcc_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("donAcc_type")
    private String donAccType = "";
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
     * The residue_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("residue_pair")
    private String residuePair = "";

    /**
     * The atom1_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_id")
    public String getAtom1Id() {
        return atom1Id;
    }

    /**
     * The atom1_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_id")
    public void setAtom1Id(String atom1Id) {
        this.atom1Id = atom1Id;
    }

    /**
     * The atom1_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_serNum")
    public Integer getAtom1SerNum() {
        return atom1SerNum;
    }

    /**
     * The atom1_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom1_serNum")
    public void setAtom1SerNum(Integer atom1SerNum) {
        this.atom1SerNum = atom1SerNum;
    }

    /**
     * The atom2_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_id")
    public String getAtom2Id() {
        return atom2Id;
    }

    /**
     * The atom2_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_id")
    public void setAtom2Id(String atom2Id) {
        this.atom2Id = atom2Id;
    }

    /**
     * The atom2_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_serNum")
    public Integer getAtom2SerNum() {
        return atom2SerNum;
    }

    /**
     * The atom2_serNum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom2_serNum")
    public void setAtom2SerNum(Integer atom2SerNum) {
        this.atom2SerNum = atom2SerNum;
    }

    /**
     * The atom_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom_pair")
    public String getAtomPair() {
        return atomPair;
    }

    /**
     * The atom_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("atom_pair")
    public void setAtomPair(String atomPair) {
        this.atomPair = atomPair;
    }

    /**
     * The distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    /**
     * The distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * The donAcc_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("donAcc_type")
    public String getDonAccType() {
        return donAccType;
    }

    /**
     * The donAcc_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("donAcc_type")
    public void setDonAccType(String donAccType) {
        this.donAccType = donAccType;
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
     * The residue_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("residue_pair")
    public String getResiduePair() {
        return residuePair;
    }

    /**
     * The residue_pair schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("residue_pair")
    public void setResiduePair(String residuePair) {
        this.residuePair = residuePair;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hbond.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("atom1Id");
        sb.append('=');
        sb.append(((this.atom1Id == null)?"<null>":this.atom1Id));
        sb.append(',');
        sb.append("atom1SerNum");
        sb.append('=');
        sb.append(((this.atom1SerNum == null)?"<null>":this.atom1SerNum));
        sb.append(',');
        sb.append("atom2Id");
        sb.append('=');
        sb.append(((this.atom2Id == null)?"<null>":this.atom2Id));
        sb.append(',');
        sb.append("atom2SerNum");
        sb.append('=');
        sb.append(((this.atom2SerNum == null)?"<null>":this.atom2SerNum));
        sb.append(',');
        sb.append("atomPair");
        sb.append('=');
        sb.append(((this.atomPair == null)?"<null>":this.atomPair));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
        sb.append(',');
        sb.append("donAccType");
        sb.append('=');
        sb.append(((this.donAccType == null)?"<null>":this.donAccType));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("residuePair");
        sb.append('=');
        sb.append(((this.residuePair == null)?"<null>":this.residuePair));
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
        result = ((result* 31)+((this.residuePair == null)? 0 :this.residuePair.hashCode()));
        result = ((result* 31)+((this.atom2Id == null)? 0 :this.atom2Id.hashCode()));
        result = ((result* 31)+((this.distance == null)? 0 :this.distance.hashCode()));
        result = ((result* 31)+((this.atom1SerNum == null)? 0 :this.atom1SerNum.hashCode()));
        result = ((result* 31)+((this.donAccType == null)? 0 :this.donAccType.hashCode()));
        result = ((result* 31)+((this.atom1Id == null)? 0 :this.atom1Id.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.atom2SerNum == null)? 0 :this.atom2SerNum.hashCode()));
        result = ((result* 31)+((this.atomPair == null)? 0 :this.atomPair.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hbond) == false) {
            return false;
        }
        Hbond rhs = ((Hbond) other);
        return ((((((((((this.residuePair == rhs.residuePair)||((this.residuePair!= null)&&this.residuePair.equals(rhs.residuePair)))&&((this.atom2Id == rhs.atom2Id)||((this.atom2Id!= null)&&this.atom2Id.equals(rhs.atom2Id))))&&((this.distance == rhs.distance)||((this.distance!= null)&&this.distance.equals(rhs.distance))))&&((this.atom1SerNum == rhs.atom1SerNum)||((this.atom1SerNum!= null)&&this.atom1SerNum.equals(rhs.atom1SerNum))))&&((this.donAccType == rhs.donAccType)||((this.donAccType!= null)&&this.donAccType.equals(rhs.donAccType))))&&((this.atom1Id == rhs.atom1Id)||((this.atom1Id!= null)&&this.atom1Id.equals(rhs.atom1Id))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.atom2SerNum == rhs.atom2SerNum)||((this.atom2SerNum!= null)&&this.atom2SerNum.equals(rhs.atom2SerNum))))&&((this.atomPair == rhs.atomPair)||((this.atomPair!= null)&&this.atomPair.equals(rhs.atomPair))));
    }

}
