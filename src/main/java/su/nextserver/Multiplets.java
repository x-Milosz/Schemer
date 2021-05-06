
package su.nextserver;

import java.util.ArrayList;
import java.util.List;
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
    "multiplets"
})
@Generated("jsonschema2pojo")
public class Multiplets {

    /**
     * The multiplets schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("multiplets")
    private List<Multiplet> multiplets = new ArrayList<Multiplet>();

    /**
     * The multiplets schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("multiplets")
    public List<Multiplet> getMultiplets() {
        return multiplets;
    }

    /**
     * The multiplets schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("multiplets")
    public void setMultiplets(List<Multiplet> multiplets) {
        this.multiplets = multiplets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Multiplets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("multiplets");
        sb.append('=');
        sb.append(((this.multiplets == null)?"<null>":this.multiplets));
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
        result = ((result* 31)+((this.multiplets == null)? 0 :this.multiplets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Multiplets) == false) {
            return false;
        }
        Multiplets rhs = ((Multiplets) other);
        return ((this.multiplets == rhs.multiplets)||((this.multiplets!= null)&&this.multiplets.equals(rhs.multiplets)));
    }

}
