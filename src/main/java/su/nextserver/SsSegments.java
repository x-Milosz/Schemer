
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
    "ssSegments"
})
@Generated("jsonschema2pojo")
public class SsSegments {

    /**
     * The ssSegments schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssSegments")
    private List<SsSegment> ssSegments = new ArrayList<SsSegment>();

    /**
     * The ssSegments schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssSegments")
    public List<SsSegment> getSsSegments() {
        return ssSegments;
    }

    /**
     * The ssSegments schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssSegments")
    public void setSsSegments(List<SsSegment> ssSegments) {
        this.ssSegments = ssSegments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SsSegments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssSegments");
        sb.append('=');
        sb.append(((this.ssSegments == null)?"<null>":this.ssSegments));
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
        result = ((result* 31)+((this.ssSegments == null)? 0 :this.ssSegments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SsSegments) == false) {
            return false;
        }
        SsSegments rhs = ((SsSegments) other);
        return ((this.ssSegments == rhs.ssSegments)||((this.ssSegments!= null)&&this.ssSegments.equals(rhs.ssSegments)));
    }

}
