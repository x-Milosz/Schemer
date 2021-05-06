
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
    "hbonds"
})
@Generated("jsonschema2pojo")
public class Hbonds {

    /**
     * The hbonds schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("hbonds")
    private List<Hbond> hbonds = new ArrayList<Hbond>();

    /**
     * The hbonds schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("hbonds")
    public List<Hbond> getHbonds() {
        return hbonds;
    }

    /**
     * The hbonds schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("hbonds")
    public void setHbonds(List<Hbond> hbonds) {
        this.hbonds = hbonds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hbonds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hbonds");
        sb.append('=');
        sb.append(((this.hbonds == null)?"<null>":this.hbonds));
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
        result = ((result* 31)+((this.hbonds == null)? 0 :this.hbonds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hbonds) == false) {
            return false;
        }
        Hbonds rhs = ((Hbonds) other);
        return ((this.hbonds == rhs.hbonds)||((this.hbonds!= null)&&this.hbonds.equals(rhs.hbonds)));
    }

}
