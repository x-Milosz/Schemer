
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
    "helices"
})
@Generated("jsonschema2pojo")
public class Helices {

    /**
     * The helices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helices")
    private List<Helice> helices = new ArrayList<Helice>();

    /**
     * The helices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helices")
    public List<Helice> getHelices() {
        return helices;
    }

    /**
     * The helices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("helices")
    public void setHelices(List<Helice> helices) {
        this.helices = helices;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Helices.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("helices");
        sb.append('=');
        sb.append(((this.helices == null)?"<null>":this.helices));
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
        result = ((result* 31)+((this.helices == null)? 0 :this.helices.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Helices) == false) {
            return false;
        }
        Helices rhs = ((Helices) other);
        return ((this.helices == rhs.helices)||((this.helices!= null)&&this.helices.equals(rhs.helices)));
    }

}
