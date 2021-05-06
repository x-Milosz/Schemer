
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
    "nts"
})
@Generated("jsonschema2pojo")
public class Nts {

    /**
     * The nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts")
    private List<Nt> nts = new ArrayList<Nt>();

    /**
     * The nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts")
    public List<Nt> getNts() {
        return nts;
    }

    /**
     * The nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nts")
    public void setNts(List<Nt> nts) {
        this.nts = nts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Nts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nts");
        sb.append('=');
        sb.append(((this.nts == null)?"<null>":this.nts));
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
        result = ((result* 31)+((this.nts == null)? 0 :this.nts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nts) == false) {
            return false;
        }
        Nts rhs = ((Nts) other);
        return ((this.nts == rhs.nts)||((this.nts!= null)&&this.nts.equals(rhs.nts)));
    }

}
