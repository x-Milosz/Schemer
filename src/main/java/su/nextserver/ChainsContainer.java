
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
    "chains"
})
@Generated("jsonschema2pojo")
public class ChainsContainer {

    /**
     * The chains schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chains")
    private Chains chains;

    /**
     * The chains schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chains")
    public Chains getChains() {
        return chains;
    }

    /**
     * The chains schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chains")
    public void setChains(Chains chains) {
        this.chains = chains;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChainsContainer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chains");
        sb.append('=');
        sb.append(((this.chains == null)?"<null>":this.chains));
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
        result = ((result* 31)+((this.chains == null)? 0 :this.chains.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChainsContainer) == false) {
            return false;
        }
        ChainsContainer rhs = ((ChainsContainer) other);
        return ((this.chains == rhs.chains)||((this.chains!= null)&&this.chains.equals(rhs.chains)));
    }

}
