
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
    "DSSR",
    "LW",
    "Saenger",
    "bp",
    "index",
    "name",
    "nt1",
    "nt2"
})
@Generated("jsonschema2pojo")
public class Pair {

    /**
     * The DSSR schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DSSR")
    private String dssr = "";
    /**
     * The LW schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LW")
    private String lw = "";
    /**
     * The Saenger schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Saenger")
    private String saenger = "";
    /**
     * The bp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp")
    private String bp = "";
    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    private Integer index = 0;
    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name = "";
    /**
     * The nt1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt1")
    private String nt1 = "";
    /**
     * The nt2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt2")
    private String nt2 = "";

    /**
     * The DSSR schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DSSR")
    public String getDssr() {
        return dssr;
    }

    /**
     * The DSSR schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DSSR")
    public void setDssr(String dssr) {
        this.dssr = dssr;
    }

    /**
     * The LW schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LW")
    public String getLw() {
        return lw;
    }

    /**
     * The LW schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LW")
    public void setLw(String lw) {
        this.lw = lw;
    }

    /**
     * The Saenger schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Saenger")
    public String getSaenger() {
        return saenger;
    }

    /**
     * The Saenger schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Saenger")
    public void setSaenger(String saenger) {
        this.saenger = saenger;
    }

    /**
     * The bp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp")
    public String getBp() {
        return bp;
    }

    /**
     * The bp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp")
    public void setBp(String bp) {
        this.bp = bp;
    }

    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * The index schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The nt1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt1")
    public String getNt1() {
        return nt1;
    }

    /**
     * The nt1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt1")
    public void setNt1(String nt1) {
        this.nt1 = nt1;
    }

    /**
     * The nt2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt2")
    public String getNt2() {
        return nt2;
    }

    /**
     * The nt2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt2")
    public void setNt2(String nt2) {
        this.nt2 = nt2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pair.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dssr");
        sb.append('=');
        sb.append(((this.dssr == null)?"<null>":this.dssr));
        sb.append(',');
        sb.append("lw");
        sb.append('=');
        sb.append(((this.lw == null)?"<null>":this.lw));
        sb.append(',');
        sb.append("saenger");
        sb.append('=');
        sb.append(((this.saenger == null)?"<null>":this.saenger));
        sb.append(',');
        sb.append("bp");
        sb.append('=');
        sb.append(((this.bp == null)?"<null>":this.bp));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nt1");
        sb.append('=');
        sb.append(((this.nt1 == null)?"<null>":this.nt1));
        sb.append(',');
        sb.append("nt2");
        sb.append('=');
        sb.append(((this.nt2 == null)?"<null>":this.nt2));
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
        result = ((result* 31)+((this.dssr == null)? 0 :this.dssr.hashCode()));
        result = ((result* 31)+((this.saenger == null)? 0 :this.saenger.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.nt1 == null)? 0 :this.nt1 .hashCode()));
        result = ((result* 31)+((this.lw == null)? 0 :this.lw.hashCode()));
        result = ((result* 31)+((this.nt2 == null)? 0 :this.nt2 .hashCode()));
        result = ((result* 31)+((this.bp == null)? 0 :this.bp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pair) == false) {
            return false;
        }
        Pair rhs = ((Pair) other);
        return (((((((((this.dssr == rhs.dssr)||((this.dssr!= null)&&this.dssr.equals(rhs.dssr)))&&((this.saenger == rhs.saenger)||((this.saenger!= null)&&this.saenger.equals(rhs.saenger))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.nt1 == rhs.nt1)||((this.nt1 != null)&&this.nt1 .equals(rhs.nt1))))&&((this.lw == rhs.lw)||((this.lw!= null)&&this.lw.equals(rhs.lw))))&&((this.nt2 == rhs.nt2)||((this.nt2 != null)&&this.nt2 .equals(rhs.nt2))))&&((this.bp == rhs.bp)||((this.bp!= null)&&this.bp.equals(rhs.bp))));
    }

}
