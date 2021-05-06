
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
    "stacks"
})
@Generated("jsonschema2pojo")
public class Stacks {

    /**
     * The stacks schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stacks")
    private List<Stack> stacks = new ArrayList<Stack>();

    /**
     * The stacks schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stacks")
    public List<Stack> getStacks() {
        return stacks;
    }

    /**
     * The stacks schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stacks")
    public void setStacks(List<Stack> stacks) {
        this.stacks = stacks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stacks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stacks");
        sb.append('=');
        sb.append(((this.stacks == null)?"<null>":this.stacks));
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
        result = ((result* 31)+((this.stacks == null)? 0 :this.stacks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stacks) == false) {
            return false;
        }
        Stacks rhs = ((Stacks) other);
        return ((this.stacks == rhs.stacks)||((this.stacks!= null)&&this.stacks.equals(rhs.stacks)));
    }

}
