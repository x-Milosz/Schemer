
package su.nextserver;

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
    "num_chars",
    "num_nts",
    "sstr"
})
@Generated("jsonschema2pojo")
public class M1ChainDbn {

    /**
     * The bseq schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bseq")
    private String bseq = "";
    /**
     * The form schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("form")
    private String form = "";
    /**
     * The num_chars schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_chars")
    private Integer numChars = 0;
    /**
     * The num_nts schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("num_nts")
    private Integer numNts = 0;
    /**
     * The sstr schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sstr")
    private String sstr = "";

    /**
     * The bseq schema
     * <p>
     * 
     * (Required)
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
     * (Required)
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
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * The num_chars schema
     * <p>
     * 
     * (Required)
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
     * (Required)
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
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("num_nts")
    public void setNumNts(Integer numNts) {
        this.numNts = numNts;
    }

    /**
     * The sstr schema
     * <p>
     * 
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("sstr")
    public void setSstr(String sstr) {
        this.sstr = sstr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(M1ChainDbn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bseq");
        sb.append('=');
        sb.append(((this.bseq == null)?"<null>":this.bseq));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("numChars");
        sb.append('=');
        sb.append(((this.numChars == null)?"<null>":this.numChars));
        sb.append(',');
        sb.append("numNts");
        sb.append('=');
        sb.append(((this.numNts == null)?"<null>":this.numNts));
        sb.append(',');
        sb.append("sstr");
        sb.append('=');
        sb.append(((this.sstr == null)?"<null>":this.sstr));
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
        result = ((result* 31)+((this.sstr == null)? 0 :this.sstr.hashCode()));
        result = ((result* 31)+((this.bseq == null)? 0 :this.bseq.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.numChars == null)? 0 :this.numChars.hashCode()));
        result = ((result* 31)+((this.numNts == null)? 0 :this.numNts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof M1ChainDbn) == false) {
            return false;
        }
        M1ChainDbn rhs = ((M1ChainDbn) other);
        return ((((((this.sstr == rhs.sstr)||((this.sstr!= null)&&this.sstr.equals(rhs.sstr)))&&((this.bseq == rhs.bseq)||((this.bseq!= null)&&this.bseq.equals(rhs.bseq))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.numChars == rhs.numChars)||((this.numChars!= null)&&this.numChars.equals(rhs.numChars))))&&((this.numNts == rhs.numNts)||((this.numNts!= null)&&this.numNts.equals(rhs.numNts))));
    }

}
