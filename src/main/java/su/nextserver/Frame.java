
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
    "origin",
    "quaternion",
    "rmsd",
    "x_axis",
    "y_axis",
    "z_axis"
})
@Generated("jsonschema2pojo")
public class Frame {

    /**
     * The origin schema
     * <p>
     * 
     * 
     */
    @JsonProperty("origin")
    private List<Double> origin = new ArrayList<Double>();
    /**
     * The quaternion schema
     * <p>
     * 
     * 
     */
    @JsonProperty("quaternion")
    private List<Double> quaternion = new ArrayList<Double>();
    /**
     * The rmsd schema
     * <p>
     * 
     * 
     */
    @JsonProperty("rmsd")
    private Double rmsd = 0.0D;
    /**
     * The x_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("x_axis")
    private List<Double> xAxis = new ArrayList<Double>();
    /**
     * The y_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("y_axis")
    private List<Double> yAxis = new ArrayList<Double>();
    /**
     * The z_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("z_axis")
    private List<Double> zAxis = new ArrayList<Double>();

    /**
     * The origin schema
     * <p>
     * 
     * 
     */
    @JsonProperty("origin")
    public List<Double> getOrigin() {
        return origin;
    }

    /**
     * The origin schema
     * <p>
     * 
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(List<Double> origin) {
        this.origin = origin;
    }

    /**
     * The quaternion schema
     * <p>
     * 
     * 
     */
    @JsonProperty("quaternion")
    public List<Double> getQuaternion() {
        return quaternion;
    }

    /**
     * The quaternion schema
     * <p>
     * 
     * 
     */
    @JsonProperty("quaternion")
    public void setQuaternion(List<Double> quaternion) {
        this.quaternion = quaternion;
    }

    /**
     * The rmsd schema
     * <p>
     * 
     * 
     */
    @JsonProperty("rmsd")
    public Double getRmsd() {
        return rmsd;
    }

    /**
     * The rmsd schema
     * <p>
     * 
     * 
     */
    @JsonProperty("rmsd")
    public void setRmsd(Double rmsd) {
        this.rmsd = rmsd;
    }

    /**
     * The x_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("x_axis")
    public List<Double> getxAxis() {
        return xAxis;
    }

    /**
     * The x_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("x_axis")
    public void setxAxis(List<Double> xAxis) {
        this.xAxis = xAxis;
    }

    /**
     * The y_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("y_axis")
    public List<Double> getyAxis() {
        return yAxis;
    }

    /**
     * The y_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("y_axis")
    public void setyAxis(List<Double> yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * The z_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("z_axis")
    public List<Double> getzAxis() {
        return zAxis;
    }

    /**
     * The z_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("z_axis")
    public void setzAxis(List<Double> zAxis) {
        this.zAxis = zAxis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frame.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("quaternion");
        sb.append('=');
        sb.append(((this.quaternion == null)?"<null>":this.quaternion));
        sb.append(',');
        sb.append("rmsd");
        sb.append('=');
        sb.append(((this.rmsd == null)?"<null>":this.rmsd));
        sb.append(',');
        sb.append("xAxis");
        sb.append('=');
        sb.append(((this.xAxis == null)?"<null>":this.xAxis));
        sb.append(',');
        sb.append("yAxis");
        sb.append('=');
        sb.append(((this.yAxis == null)?"<null>":this.yAxis));
        sb.append(',');
        sb.append("zAxis");
        sb.append('=');
        sb.append(((this.zAxis == null)?"<null>":this.zAxis));
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
        result = ((result* 31)+((this.yAxis == null)? 0 :this.yAxis.hashCode()));
        result = ((result* 31)+((this.xAxis == null)? 0 :this.xAxis.hashCode()));
        result = ((result* 31)+((this.quaternion == null)? 0 :this.quaternion.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.rmsd == null)? 0 :this.rmsd.hashCode()));
        result = ((result* 31)+((this.zAxis == null)? 0 :this.zAxis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frame) == false) {
            return false;
        }
        Frame rhs = ((Frame) other);
        return (((((((this.yAxis == rhs.yAxis)||((this.yAxis!= null)&&this.yAxis.equals(rhs.yAxis)))&&((this.xAxis == rhs.xAxis)||((this.xAxis!= null)&&this.xAxis.equals(rhs.xAxis))))&&((this.quaternion == rhs.quaternion)||((this.quaternion!= null)&&this.quaternion.equals(rhs.quaternion))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.rmsd == rhs.rmsd)||((this.rmsd!= null)&&this.rmsd.equals(rhs.rmsd))))&&((this.zAxis == rhs.zAxis)||((this.zAxis!= null)&&this.zAxis.equals(rhs.zAxis))));
    }

}
