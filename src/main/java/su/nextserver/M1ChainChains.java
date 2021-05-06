
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
    "bseq",
    "form",
    "helical_axis",
    "helical_rise",
    "helical_rise_std",
    "num_chars",
    "num_nts",
    "point1",
    "point2",
    "sstr",
    "suite"
})
@Generated("jsonschema2pojo")
public class M1ChainChains {

    /**
     * The bseq schema
     * <p>
     * 
     * 
     */
    @JsonProperty("bseq")
    private String bseq = "";
    /**
     * The form schema
     * <p>
     * 
     * 
     */
    @JsonProperty("form")
    private String form = "";
    /**
     * The helical_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_axis")
    private List<Double> helicalAxis = new ArrayList<Double>();
    /**
     * The helical_rise schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise")
    private Double helicalRise = 0.0D;
    /**
     * The helical_rise_std schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise_std")
    private Double helicalRiseStd = 0.0D;
    /**
     * The num_chars schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_chars")
    private Integer numChars = 0;
    /**
     * The num_nts schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_nts")
    private Integer numNts = 0;
    /**
     * The point1 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point1")
    private List<Double> point1 = new ArrayList<Double>();
    /**
     * The point2 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point2")
    private List<Double> point2 = new ArrayList<Double>();
    /**
     * The sstr schema
     * <p>
     * 
     * 
     */
    @JsonProperty("sstr")
    private String sstr = "";
    /**
     * The suite schema
     * <p>
     * 
     * 
     */
    @JsonProperty("suite")
    private String suite = "";

    /**
     * The bseq schema
     * <p>
     * 
     * 
     */
    @JsonProperty("bseq")
    public String getBseq() {
        return bseq;
    }

    /**
     * The bseq schema
     * <p>
     * 
     * 
     */
    @JsonProperty("bseq")
    public void setBseq(String bseq) {
        this.bseq = bseq;
    }

    /**
     * The form schema
     * <p>
     * 
     * 
     */
    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    /**
     * The form schema
     * <p>
     * 
     * 
     */
    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * The helical_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_axis")
    public List<Double> getHelicalAxis() {
        return helicalAxis;
    }

    /**
     * The helical_axis schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_axis")
    public void setHelicalAxis(List<Double> helicalAxis) {
        this.helicalAxis = helicalAxis;
    }

    /**
     * The helical_rise schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise")
    public Double getHelicalRise() {
        return helicalRise;
    }

    /**
     * The helical_rise schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise")
    public void setHelicalRise(Double helicalRise) {
        this.helicalRise = helicalRise;
    }

    /**
     * The helical_rise_std schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise_std")
    public Double getHelicalRiseStd() {
        return helicalRiseStd;
    }

    /**
     * The helical_rise_std schema
     * <p>
     * 
     * 
     */
    @JsonProperty("helical_rise_std")
    public void setHelicalRiseStd(Double helicalRiseStd) {
        this.helicalRiseStd = helicalRiseStd;
    }

    /**
     * The num_chars schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_chars")
    public Integer getNumChars() {
        return numChars;
    }

    /**
     * The num_chars schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_chars")
    public void setNumChars(Integer numChars) {
        this.numChars = numChars;
    }

    /**
     * The num_nts schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_nts")
    public Integer getNumNts() {
        return numNts;
    }

    /**
     * The num_nts schema
     * <p>
     * 
     * 
     */
    @JsonProperty("num_nts")
    public void setNumNts(Integer numNts) {
        this.numNts = numNts;
    }

    /**
     * The point1 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point1")
    public List<Double> getPoint1() {
        return point1;
    }

    /**
     * The point1 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point1")
    public void setPoint1(List<Double> point1) {
        this.point1 = point1;
    }

    /**
     * The point2 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point2")
    public List<Double> getPoint2() {
        return point2;
    }

    /**
     * The point2 schema
     * <p>
     * 
     * 
     */
    @JsonProperty("point2")
    public void setPoint2(List<Double> point2) {
        this.point2 = point2;
    }

    /**
     * The sstr schema
     * <p>
     * 
     * 
     */
    @JsonProperty("sstr")
    public String getSstr() {
        return sstr;
    }

    /**
     * The sstr schema
     * <p>
     * 
     * 
     */
    @JsonProperty("sstr")
    public void setSstr(String sstr) {
        this.sstr = sstr;
    }

    /**
     * The suite schema
     * <p>
     * 
     * 
     */
    @JsonProperty("suite")
    public String getSuite() {
        return suite;
    }

    /**
     * The suite schema
     * <p>
     * 
     * 
     */
    @JsonProperty("suite")
    public void setSuite(String suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(M1ChainChains.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bseq");
        sb.append('=');
        sb.append(((this.bseq == null)?"<null>":this.bseq));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("helicalAxis");
        sb.append('=');
        sb.append(((this.helicalAxis == null)?"<null>":this.helicalAxis));
        sb.append(',');
        sb.append("helicalRise");
        sb.append('=');
        sb.append(((this.helicalRise == null)?"<null>":this.helicalRise));
        sb.append(',');
        sb.append("helicalRiseStd");
        sb.append('=');
        sb.append(((this.helicalRiseStd == null)?"<null>":this.helicalRiseStd));
        sb.append(',');
        sb.append("numChars");
        sb.append('=');
        sb.append(((this.numChars == null)?"<null>":this.numChars));
        sb.append(',');
        sb.append("numNts");
        sb.append('=');
        sb.append(((this.numNts == null)?"<null>":this.numNts));
        sb.append(',');
        sb.append("point1");
        sb.append('=');
        sb.append(((this.point1 == null)?"<null>":this.point1));
        sb.append(',');
        sb.append("point2");
        sb.append('=');
        sb.append(((this.point2 == null)?"<null>":this.point2));
        sb.append(',');
        sb.append("sstr");
        sb.append('=');
        sb.append(((this.sstr == null)?"<null>":this.sstr));
        sb.append(',');
        sb.append("suite");
        sb.append('=');
        sb.append(((this.suite == null)?"<null>":this.suite));
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
        result = ((result* 31)+((this.bseq == null)? 0 :this.bseq.hashCode()));
        result = ((result* 31)+((this.suite == null)? 0 :this.suite.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.sstr == null)? 0 :this.sstr.hashCode()));
        result = ((result* 31)+((this.helicalAxis == null)? 0 :this.helicalAxis.hashCode()));
        result = ((result* 31)+((this.helicalRise == null)? 0 :this.helicalRise.hashCode()));
        result = ((result* 31)+((this.helicalRiseStd == null)? 0 :this.helicalRiseStd.hashCode()));
        result = ((result* 31)+((this.numChars == null)? 0 :this.numChars.hashCode()));
        result = ((result* 31)+((this.point1 == null)? 0 :this.point1 .hashCode()));
        result = ((result* 31)+((this.point2 == null)? 0 :this.point2 .hashCode()));
        result = ((result* 31)+((this.numNts == null)? 0 :this.numNts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof M1ChainChains) == false) {
            return false;
        }
        M1ChainChains rhs = ((M1ChainChains) other);
        return ((((((((((((this.bseq == rhs.bseq)||((this.bseq!= null)&&this.bseq.equals(rhs.bseq)))&&((this.suite == rhs.suite)||((this.suite!= null)&&this.suite.equals(rhs.suite))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.sstr == rhs.sstr)||((this.sstr!= null)&&this.sstr.equals(rhs.sstr))))&&((this.helicalAxis == rhs.helicalAxis)||((this.helicalAxis!= null)&&this.helicalAxis.equals(rhs.helicalAxis))))&&((this.helicalRise == rhs.helicalRise)||((this.helicalRise!= null)&&this.helicalRise.equals(rhs.helicalRise))))&&((this.helicalRiseStd == rhs.helicalRiseStd)||((this.helicalRiseStd!= null)&&this.helicalRiseStd.equals(rhs.helicalRiseStd))))&&((this.numChars == rhs.numChars)||((this.numChars!= null)&&this.numChars.equals(rhs.numChars))))&&((this.point1 == rhs.point1)||((this.point1 != null)&&this.point1 .equals(rhs.point1))))&&((this.point2 == rhs.point2)||((this.point2 != null)&&this.point2 .equals(rhs.point2))))&&((this.numNts == rhs.numNts)||((this.numNts!= null)&&this.numNts.equals(rhs.numNts))));
    }

}
