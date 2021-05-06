
package su.nextserver;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "all_chains",
    "m1_chain_A",
    "m1_chain_B",
    "m1_chain_C",
    "m1_chain_D"
})
@Generated("jsonschema2pojo")
public class Dbn {

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("all_chains")
    private M1ChainDbn allChains;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_A")
    private M1ChainDbn m1ChainA;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_B")
    private M1ChainDbn m1ChainB;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_C")
    private M1ChainDbn m1ChainC;
    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_D")
    private M1ChainDbn m1ChainD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("all_chains")
    public M1ChainDbn getAllChains() {
        return allChains;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("all_chains")
    public void setAllChains(M1ChainDbn allChains) {
        this.allChains = allChains;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("m1_chain_A")
    public M1ChainDbn getM1ChainA() {
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
    public void setM1ChainA(M1ChainDbn m1ChainA) {
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
    public M1ChainDbn getM1ChainB() {
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
    public void setM1ChainB(M1ChainDbn m1ChainB) {
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
    public M1ChainDbn getM1ChainC() {
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
    public void setM1ChainC(M1ChainDbn m1ChainC) {
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
    public M1ChainDbn getM1ChainD() {
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
    public void setM1ChainD(M1ChainDbn m1ChainD) {
        this.m1ChainD = m1ChainD;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dbn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allChains");
        sb.append('=');
        sb.append(((this.allChains == null)?"<null>":this.allChains));
        sb.append(',');
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
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.allChains == null)? 0 :this.allChains.hashCode()));
        result = ((result* 31)+((this.m1ChainD == null)? 0 :this.m1ChainD.hashCode()));
        result = ((result* 31)+((this.m1ChainC == null)? 0 :this.m1ChainC.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dbn) == false) {
            return false;
        }
        Dbn rhs = ((Dbn) other);
        return (((((((this.m1ChainB == rhs.m1ChainB)||((this.m1ChainB!= null)&&this.m1ChainB.equals(rhs.m1ChainB)))&&((this.m1ChainA == rhs.m1ChainA)||((this.m1ChainA!= null)&&this.m1ChainA.equals(rhs.m1ChainA))))&&((this.allChains == rhs.allChains)||((this.allChains!= null)&&this.allChains.equals(rhs.allChains))))&&((this.m1ChainD == rhs.m1ChainD)||((this.m1ChainD!= null)&&this.m1ChainD.equals(rhs.m1ChainD))))&&((this.m1ChainC == rhs.m1ChainC)||((this.m1ChainC!= null)&&this.m1ChainC.equals(rhs.m1ChainC))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
