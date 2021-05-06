
package su.nextserver;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The root schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "naChains",
    "num_atoms",
    "num_naChains",
    "num_notes",
    "num_waters"
})
@Generated("jsonschema2pojo")
public class Metadata {

    /**
     * The naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("naChains")
    private String naChains = "";
    /**
     * The num_atoms schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_atoms")
    private Integer numAtoms = 0;
    /**
     * The num_naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_naChains")
    private Integer numNaChains = 0;
    /**
     * The num_notes schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_notes")
    private Integer numNotes = 0;
    /**
     * The num_waters schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_waters")
    private Integer numWaters = 0;

    /**
     * The naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("naChains")
    public String getNaChains() {
        return naChains;
    }

    /**
     * The naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("naChains")
    public void setNaChains(String naChains) {
        this.naChains = naChains;
    }

    /**
     * The num_atoms schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_atoms")
    public Integer getNumAtoms() {
        return numAtoms;
    }

    /**
     * The num_atoms schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_atoms")
    public void setNumAtoms(Integer numAtoms) {
        this.numAtoms = numAtoms;
    }

    /**
     * The num_naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_naChains")
    public Integer getNumNaChains() {
        return numNaChains;
    }

    /**
     * The num_naChains schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_naChains")
    public void setNumNaChains(Integer numNaChains) {
        this.numNaChains = numNaChains;
    }

    /**
     * The num_notes schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_notes")
    public Integer getNumNotes() {
        return numNotes;
    }

    /**
     * The num_notes schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_notes")
    public void setNumNotes(Integer numNotes) {
        this.numNotes = numNotes;
    }

    /**
     * The num_waters schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_waters")
    public Integer getNumWaters() {
        return numWaters;
    }

    /**
     * The num_waters schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_waters")
    public void setNumWaters(Integer numWaters) {
        this.numWaters = numWaters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("naChains");
        sb.append('=');
        sb.append(((this.naChains == null)?"<null>":this.naChains));
        sb.append(',');
        sb.append("numAtoms");
        sb.append('=');
        sb.append(((this.numAtoms == null)?"<null>":this.numAtoms));
        sb.append(',');
        sb.append("numNaChains");
        sb.append('=');
        sb.append(((this.numNaChains == null)?"<null>":this.numNaChains));
        sb.append(',');
        sb.append("numNotes");
        sb.append('=');
        sb.append(((this.numNotes == null)?"<null>":this.numNotes));
        sb.append(',');
        sb.append("numWaters");
        sb.append('=');
        sb.append(((this.numWaters == null)?"<null>":this.numWaters));
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
        result = ((result* 31)+((this.numAtoms == null)? 0 :this.numAtoms.hashCode()));
        result = ((result* 31)+((this.numWaters == null)? 0 :this.numWaters.hashCode()));
        result = ((result* 31)+((this.numNotes == null)? 0 :this.numNotes.hashCode()));
        result = ((result* 31)+((this.naChains == null)? 0 :this.naChains.hashCode()));
        result = ((result* 31)+((this.numNaChains == null)? 0 :this.numNaChains.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return ((((((this.numAtoms == rhs.numAtoms)||((this.numAtoms!= null)&&this.numAtoms.equals(rhs.numAtoms)))&&((this.numWaters == rhs.numWaters)||((this.numWaters!= null)&&this.numWaters.equals(rhs.numWaters))))&&((this.numNotes == rhs.numNotes)||((this.numNotes!= null)&&this.numNotes.equals(rhs.numNotes))))&&((this.naChains == rhs.naChains)||((this.naChains!= null)&&this.naChains.equals(rhs.naChains))))&&((this.numNaChains == rhs.numNaChains)||((this.numNaChains!= null)&&this.numNaChains.equals(rhs.numNaChains))));
    }

}
