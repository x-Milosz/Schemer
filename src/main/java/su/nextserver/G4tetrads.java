
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
    "G4tetrads"
})
@Generated("jsonschema2pojo")
public class G4tetrads {

    /**
     * The G4tetrads schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4tetrads")
    private List<G4tetrad> g4tetrads = new ArrayList<G4tetrad>();

    /**
     * The G4tetrads schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4tetrads")
    public List<G4tetrad> getG4tetrads() {
        return g4tetrads;
    }

    /**
     * The G4tetrads schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("G4tetrads")
    public void setG4tetrads(List<G4tetrad> g4tetrads) {
        this.g4tetrads = g4tetrads;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(G4tetrads.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("g4tetrads");
        sb.append('=');
        sb.append(((this.g4tetrads == null)?"<null>":this.g4tetrads));
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
        result = ((result* 31)+((this.g4tetrads == null)? 0 :this.g4tetrads.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof G4tetrads) == false) {
            return false;
        }
        G4tetrads rhs = ((G4tetrads) other);
        return ((this.g4tetrads == rhs.g4tetrads)||((this.g4tetrads!= null)&&this.g4tetrads.equals(rhs.g4tetrads)));
    }

}
