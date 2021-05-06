
package su.nextserver;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The chains schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "m1_chain_A",
    "m1_chain_B",
    "m1_chain_C",
    "m1_chain_D"
})
@Generated("jsonschema2pojo")
public class Chains {

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_A")
    private M1ChainChains m1ChainA;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_B")
    private M1ChainChains m1ChainB;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_C")
    private M1ChainChains m1ChainC;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_D")
    private M1ChainChains m1ChainD;

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_A")
    public M1ChainChains getM1ChainA() {
        return m1ChainA;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_A")
    public void setM1ChainA(M1ChainChains m1ChainA) {
        this.m1ChainA = m1ChainA;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_B")
    public M1ChainChains getM1ChainB() {
        return m1ChainB;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_B")
    public void setM1ChainB(M1ChainChains m1ChainB) {
        this.m1ChainB = m1ChainB;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_C")
    public M1ChainChains getM1ChainC() {
        return m1ChainC;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_C")
    public void setM1ChainC(M1ChainChains m1ChainC) {
        this.m1ChainC = m1ChainC;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_D")
    public M1ChainChains getM1ChainD() {
        return m1ChainD;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_D")
    public void setM1ChainD(M1ChainChains m1ChainD) {
        this.m1ChainD = m1ChainD;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Chains.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("m1ChainA");
        sb.append('=');
        sb.append(((this.m1ChainA == null)?"<null>":this.m1ChainA));
        sb.append(',');
        sb.append("m1ChainB");
        sb.append('=');
        sb.append(((this.m1ChainB == null)?"<null>":this.m1ChainB));
        sb.append(',');
        sb.append("m1ChainC");
        sb.append('=');
        sb.append(((this.m1ChainC == null)?"<null>":this.m1ChainC));
        sb.append(',');
        sb.append("m1ChainD");
        sb.append('=');
        sb.append(((this.m1ChainD == null)?"<null>":this.m1ChainD));
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
        result = ((result* 31)+((this.m1ChainB == null)? 0 :this.m1ChainB.hashCode()));
        result = ((result* 31)+((this.m1ChainA == null)? 0 :this.m1ChainA.hashCode()));
        result = ((result* 31)+((this.m1ChainD == null)? 0 :this.m1ChainD.hashCode()));
        result = ((result* 31)+((this.m1ChainC == null)? 0 :this.m1ChainC.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Chains) == false) {
            return false;
        }
        Chains rhs = ((Chains) other);
        return (((((this.m1ChainB == rhs.m1ChainB)||((this.m1ChainB!= null)&&this.m1ChainB.equals(rhs.m1ChainB)))&&((this.m1ChainA == rhs.m1ChainA)||((this.m1ChainA!= null)&&this.m1ChainA.equals(rhs.m1ChainA))))&&((this.m1ChainD == rhs.m1ChainD)||((this.m1ChainD!= null)&&this.m1ChainD.equals(rhs.m1ChainD))))&&((this.m1ChainC == rhs.m1ChainC)||((this.m1ChainC!= null)&&this.m1ChainC.equals(rhs.m1ChainC))));
    }

}
