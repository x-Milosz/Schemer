
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
    "pairs"
})
@Generated("jsonschema2pojo")
public class Pairs {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pairs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pairs");
        sb.append('=');
        sb.append(((this.pairs == null)?"<null>":this.pairs));
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
        result = ((result* 31)+((this.pairs == null)? 0 :this.pairs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pairs) == false) {
            return false;
        }
        Pairs rhs = ((Pairs) other);
        return ((this.pairs == rhs.pairs)||((this.pairs!= null)&&this.pairs.equals(rhs.pairs)));
    }

}
