
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
    "index",
    "nts_long",
    "nts_short",
    "num_nts"
})
@Generated("jsonschema2pojo")
public class Stack {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stack.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.ntsLong == null)? 0 :this.ntsLong.hashCode()));
        result = ((result* 31)+((this.ntsShort == null)? 0 :this.ntsShort.hashCode()));
        result = ((result* 31)+((this.numNts == null)? 0 :this.numNts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stack) == false) {
            return false;
        }
        Stack rhs = ((Stack) other);
        return (((((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index)))&&((this.ntsLong == rhs.ntsLong)||((this.ntsLong!= null)&&this.ntsLong.equals(rhs.ntsLong))))&&((this.ntsShort == rhs.ntsShort)||((this.ntsShort!= null)&&this.ntsShort.equals(rhs.ntsShort))))&&((this.numNts == rhs.numNts)||((this.numNts!= null)&&this.numNts.equals(rhs.numNts))));
    }

}
