
package su.nextserver;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The items schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "C5prime_xyz",
    "Dp",
    "P_xyz",
    "alpha",
    "amplitude",
    "bb_type",
    "beta",
    "bin",
    "chain_name",
    "chi",
    "cluster",
    "dbn",
    "delta",
    "epsilon",
    "epsilon_zeta",
    "eta",
    "eta_base",
    "eta_prime",
    "filter_rmsd",
    "form",
    "frame",
    "gamma",
    "glyco_bond",
    "index",
    "index_chain",
    "nt_code",
    "nt_id",
    "nt_name",
    "nt_resnum",
    "nt_type",
    "phase_angle",
    "puckering",
    "splay_angle",
    "splay_distance",
    "splay_ratio",
    "ssZp",
    "sugar_class",
    "suiteness",
    "summary",
    "theta",
    "theta_base",
    "theta_prime",
    "v0",
    "v1",
    "v2",
    "v3",
    "v4",
    "zeta"
})
@Generated("jsonschema2pojo")
public class Nt {

    /**
     * The C5prime_xyz schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("C5prime_xyz")
    private List<Double> c5primeXyz = new ArrayList<Double>();
    /**
     * The Dp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Dp")
    private Double dp = 0.0D;
    /**
     * The P_xyz schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("P_xyz")
    private List<Object> pXyz = new ArrayList<Object>();
    /**
     * The alpha schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alpha")
    private Object alpha = null;
    /**
     * The amplitude schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amplitude")
    private Double amplitude = 0.0D;
    /**
     * The bb_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bb_type")
    private String bbType = "";
    /**
     * The beta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beta")
    private Object beta = null;
    /**
     * The bin schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bin")
    private String bin = "";
    /**
     * The chain_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain_name")
    private String chainName = "";
    /**
     * The chi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chi")
    private Double chi = 0.0D;
    /**
     * The cluster schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    private String cluster = "";
    /**
     * The dbn schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbn")
    private String dbn = "";
    /**
     * The delta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("delta")
    private Double delta = 0.0D;
    /**
     * The epsilon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon")
    private Double epsilon = 0.0D;
    /**
     * The epsilon_zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon_zeta")
    private Double epsilonZeta = 0.0D;
    /**
     * The eta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta")
    private Object eta = null;
    /**
     * The eta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_base")
    private Object etaBase = null;
    /**
     * The eta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_prime")
    private Object etaPrime = null;
    /**
     * The filter_rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("filter_rmsd")
    private Double filterRmsd = 0.0D;
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
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    private Frame frame;
    /**
     * The gamma schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    private Double gamma = 0.0D;
    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    private String glycoBond = "";
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
     * The index_chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index_chain")
    private Integer indexChain = 0;
    /**
     * The nt_code schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_code")
    private String ntCode = "";
    /**
     * The nt_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_id")
    private String ntId = "";
    /**
     * The nt_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_name")
    private String ntName = "";
    /**
     * The nt_resnum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_resnum")
    private Integer ntResnum = 0;
    /**
     * The nt_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_type")
    private String ntType = "";
    /**
     * The phase_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase_angle")
    private Double phaseAngle = 0.0D;
    /**
     * The puckering schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("puckering")
    private String puckering = "";
    /**
     * The splay_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_angle")
    private Double splayAngle = 0.0D;
    /**
     * The splay_distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_distance")
    private Double splayDistance = 0.0D;
    /**
     * The splay_ratio schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_ratio")
    private Double splayRatio = 0.0D;
    /**
     * The ssZp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssZp")
    private Double ssZp = 0.0D;
    /**
     * The sugar_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sugar_class")
    private String sugarClass = "";
    /**
     * The suiteness schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("suiteness")
    private Double suiteness = 0.0D;
    /**
     * The summary schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    private String summary = "";
    /**
     * The theta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    private Object theta = null;
    /**
     * The theta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_base")
    private Object thetaBase = null;
    /**
     * The theta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_prime")
    private Object thetaPrime = null;
    /**
     * The v0 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v0")
    private Double v0 = 0.0D;
    /**
     * The v1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v1")
    private Double v1 = 0.0D;
    /**
     * The v2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v2")
    private Double v2 = 0.0D;
    /**
     * The v3 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v3")
    private Double v3 = 0.0D;
    /**
     * The v4 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v4")
    private Double v4 = 0.0D;
    /**
     * The zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("zeta")
    private Double zeta = 0.0D;

    /**
     * The C5prime_xyz schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("C5prime_xyz")
    public List<Double> getC5primeXyz() {
        return c5primeXyz;
    }

    /**
     * The C5prime_xyz schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("C5prime_xyz")
    public void setC5primeXyz(List<Double> c5primeXyz) {
        this.c5primeXyz = c5primeXyz;
    }

    /**
     * The Dp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Dp")
    public Double getDp() {
        return dp;
    }

    /**
     * The Dp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Dp")
    public void setDp(Double dp) {
        this.dp = dp;
    }

    /**
     * The P_xyz schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P_xyz")
    public List<Object> getPXyz() {
        return pXyz;
    }

    /**
     * The P_xyz schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P_xyz")
    public void setPXyz(List<Object> pXyz) {
        this.pXyz = pXyz;
    }

    /**
     * The alpha schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alpha")
    public Object getAlpha() {
        return alpha;
    }

    /**
     * The alpha schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alpha")
    public void setAlpha(Object alpha) {
        this.alpha = alpha;
    }

    /**
     * The amplitude schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amplitude")
    public Double getAmplitude() {
        return amplitude;
    }

    /**
     * The amplitude schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amplitude")
    public void setAmplitude(Double amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * The bb_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bb_type")
    public String getBbType() {
        return bbType;
    }

    /**
     * The bb_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bb_type")
    public void setBbType(String bbType) {
        this.bbType = bbType;
    }

    /**
     * The beta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beta")
    public Object getBeta() {
        return beta;
    }

    /**
     * The beta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beta")
    public void setBeta(Object beta) {
        this.beta = beta;
    }

    /**
     * The bin schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bin")
    public String getBin() {
        return bin;
    }

    /**
     * The bin schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bin")
    public void setBin(String bin) {
        this.bin = bin;
    }

    /**
     * The chain_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain_name")
    public String getChainName() {
        return chainName;
    }

    /**
     * The chain_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain_name")
    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    /**
     * The chi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chi")
    public Double getChi() {
        return chi;
    }

    /**
     * The chi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chi")
    public void setChi(Double chi) {
        this.chi = chi;
    }

    /**
     * The cluster schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    /**
     * The cluster schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * The dbn schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbn")
    public String getDbn() {
        return dbn;
    }

    /**
     * The dbn schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbn")
    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    /**
     * The delta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("delta")
    public Double getDelta() {
        return delta;
    }

    /**
     * The delta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("delta")
    public void setDelta(Double delta) {
        this.delta = delta;
    }

    /**
     * The epsilon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon")
    public Double getEpsilon() {
        return epsilon;
    }

    /**
     * The epsilon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon")
    public void setEpsilon(Double epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * The epsilon_zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon_zeta")
    public Double getEpsilonZeta() {
        return epsilonZeta;
    }

    /**
     * The epsilon_zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("epsilon_zeta")
    public void setEpsilonZeta(Double epsilonZeta) {
        this.epsilonZeta = epsilonZeta;
    }

    /**
     * The eta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta")
    public Object getEta() {
        return eta;
    }

    /**
     * The eta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta")
    public void setEta(Object eta) {
        this.eta = eta;
    }

    /**
     * The eta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_base")
    public Object getEtaBase() {
        return etaBase;
    }

    /**
     * The eta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_base")
    public void setEtaBase(Object etaBase) {
        this.etaBase = etaBase;
    }

    /**
     * The eta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_prime")
    public Object getEtaPrime() {
        return etaPrime;
    }

    /**
     * The eta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eta_prime")
    public void setEtaPrime(Object etaPrime) {
        this.etaPrime = etaPrime;
    }

    /**
     * The filter_rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("filter_rmsd")
    public Double getFilterRmsd() {
        return filterRmsd;
    }

    /**
     * The filter_rmsd schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("filter_rmsd")
    public void setFilterRmsd(Double filterRmsd) {
        this.filterRmsd = filterRmsd;
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
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public Frame getFrame() {
        return frame;
    }

    /**
     * The root schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    /**
     * The gamma schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    public Double getGamma() {
        return gamma;
    }

    /**
     * The gamma schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    public void setGamma(Double gamma) {
        this.gamma = gamma;
    }

    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    public String getGlycoBond() {
        return glycoBond;
    }

    /**
     * The glyco_bond schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("glyco_bond")
    public void setGlycoBond(String glycoBond) {
        this.glycoBond = glycoBond;
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
     * The index_chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index_chain")
    public Integer getIndexChain() {
        return indexChain;
    }

    /**
     * The index_chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("index_chain")
    public void setIndexChain(Integer indexChain) {
        this.indexChain = indexChain;
    }

    /**
     * The nt_code schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_code")
    public String getNtCode() {
        return ntCode;
    }

    /**
     * The nt_code schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_code")
    public void setNtCode(String ntCode) {
        this.ntCode = ntCode;
    }

    /**
     * The nt_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_id")
    public String getNtId() {
        return ntId;
    }

    /**
     * The nt_id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_id")
    public void setNtId(String ntId) {
        this.ntId = ntId;
    }

    /**
     * The nt_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_name")
    public String getNtName() {
        return ntName;
    }

    /**
     * The nt_name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_name")
    public void setNtName(String ntName) {
        this.ntName = ntName;
    }

    /**
     * The nt_resnum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_resnum")
    public Integer getNtResnum() {
        return ntResnum;
    }

    /**
     * The nt_resnum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_resnum")
    public void setNtResnum(Integer ntResnum) {
        this.ntResnum = ntResnum;
    }

    /**
     * The nt_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_type")
    public String getNtType() {
        return ntType;
    }

    /**
     * The nt_type schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("nt_type")
    public void setNtType(String ntType) {
        this.ntType = ntType;
    }

    /**
     * The phase_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase_angle")
    public Double getPhaseAngle() {
        return phaseAngle;
    }

    /**
     * The phase_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase_angle")
    public void setPhaseAngle(Double phaseAngle) {
        this.phaseAngle = phaseAngle;
    }

    /**
     * The puckering schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("puckering")
    public String getPuckering() {
        return puckering;
    }

    /**
     * The puckering schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("puckering")
    public void setPuckering(String puckering) {
        this.puckering = puckering;
    }

    /**
     * The splay_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_angle")
    public Double getSplayAngle() {
        return splayAngle;
    }

    /**
     * The splay_angle schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_angle")
    public void setSplayAngle(Double splayAngle) {
        this.splayAngle = splayAngle;
    }

    /**
     * The splay_distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_distance")
    public Double getSplayDistance() {
        return splayDistance;
    }

    /**
     * The splay_distance schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_distance")
    public void setSplayDistance(Double splayDistance) {
        this.splayDistance = splayDistance;
    }

    /**
     * The splay_ratio schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_ratio")
    public Double getSplayRatio() {
        return splayRatio;
    }

    /**
     * The splay_ratio schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("splay_ratio")
    public void setSplayRatio(Double splayRatio) {
        this.splayRatio = splayRatio;
    }

    /**
     * The ssZp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssZp")
    public Double getSsZp() {
        return ssZp;
    }

    /**
     * The ssZp schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssZp")
    public void setSsZp(Double ssZp) {
        this.ssZp = ssZp;
    }

    /**
     * The sugar_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sugar_class")
    public String getSugarClass() {
        return sugarClass;
    }

    /**
     * The sugar_class schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sugar_class")
    public void setSugarClass(String sugarClass) {
        this.sugarClass = sugarClass;
    }

    /**
     * The suiteness schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("suiteness")
    public Double getSuiteness() {
        return suiteness;
    }

    /**
     * The suiteness schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("suiteness")
    public void setSuiteness(Double suiteness) {
        this.suiteness = suiteness;
    }

    /**
     * The summary schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * The summary schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * The theta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    public Object getTheta() {
        return theta;
    }

    /**
     * The theta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    public void setTheta(Object theta) {
        this.theta = theta;
    }

    /**
     * The theta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_base")
    public Object getThetaBase() {
        return thetaBase;
    }

    /**
     * The theta_base schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_base")
    public void setThetaBase(Object thetaBase) {
        this.thetaBase = thetaBase;
    }

    /**
     * The theta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_prime")
    public Object getThetaPrime() {
        return thetaPrime;
    }

    /**
     * The theta_prime schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta_prime")
    public void setThetaPrime(Object thetaPrime) {
        this.thetaPrime = thetaPrime;
    }

    /**
     * The v0 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v0")
    public Double getV0() {
        return v0;
    }

    /**
     * The v0 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v0")
    public void setV0(Double v0) {
        this.v0 = v0;
    }

    /**
     * The v1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v1")
    public Double getV1() {
        return v1;
    }

    /**
     * The v1 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v1")
    public void setV1(Double v1) {
        this.v1 = v1;
    }

    /**
     * The v2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v2")
    public Double getV2() {
        return v2;
    }

    /**
     * The v2 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v2")
    public void setV2(Double v2) {
        this.v2 = v2;
    }

    /**
     * The v3 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v3")
    public Double getV3() {
        return v3;
    }

    /**
     * The v3 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v3")
    public void setV3(Double v3) {
        this.v3 = v3;
    }

    /**
     * The v4 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v4")
    public Double getV4() {
        return v4;
    }

    /**
     * The v4 schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("v4")
    public void setV4(Double v4) {
        this.v4 = v4;
    }

    /**
     * The zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("zeta")
    public Double getZeta() {
        return zeta;
    }

    /**
     * The zeta schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("zeta")
    public void setZeta(Double zeta) {
        this.zeta = zeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Nt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("c5primeXyz");
        sb.append('=');
        sb.append(((this.c5primeXyz == null)?"<null>":this.c5primeXyz));
        sb.append(',');
        sb.append("dp");
        sb.append('=');
        sb.append(((this.dp == null)?"<null>":this.dp));
        sb.append(',');
        sb.append("pXyz");
        sb.append('=');
        sb.append(((this.pXyz == null)?"<null>":this.pXyz));
        sb.append(',');
        sb.append("alpha");
        sb.append('=');
        sb.append(((this.alpha == null)?"<null>":this.alpha));
        sb.append(',');
        sb.append("amplitude");
        sb.append('=');
        sb.append(((this.amplitude == null)?"<null>":this.amplitude));
        sb.append(',');
        sb.append("bbType");
        sb.append('=');
        sb.append(((this.bbType == null)?"<null>":this.bbType));
        sb.append(',');
        sb.append("beta");
        sb.append('=');
        sb.append(((this.beta == null)?"<null>":this.beta));
        sb.append(',');
        sb.append("bin");
        sb.append('=');
        sb.append(((this.bin == null)?"<null>":this.bin));
        sb.append(',');
        sb.append("chainName");
        sb.append('=');
        sb.append(((this.chainName == null)?"<null>":this.chainName));
        sb.append(',');
        sb.append("chi");
        sb.append('=');
        sb.append(((this.chi == null)?"<null>":this.chi));
        sb.append(',');
        sb.append("cluster");
        sb.append('=');
        sb.append(((this.cluster == null)?"<null>":this.cluster));
        sb.append(',');
        sb.append("dbn");
        sb.append('=');
        sb.append(((this.dbn == null)?"<null>":this.dbn));
        sb.append(',');
        sb.append("delta");
        sb.append('=');
        sb.append(((this.delta == null)?"<null>":this.delta));
        sb.append(',');
        sb.append("epsilon");
        sb.append('=');
        sb.append(((this.epsilon == null)?"<null>":this.epsilon));
        sb.append(',');
        sb.append("epsilonZeta");
        sb.append('=');
        sb.append(((this.epsilonZeta == null)?"<null>":this.epsilonZeta));
        sb.append(',');
        sb.append("eta");
        sb.append('=');
        sb.append(((this.eta == null)?"<null>":this.eta));
        sb.append(',');
        sb.append("etaBase");
        sb.append('=');
        sb.append(((this.etaBase == null)?"<null>":this.etaBase));
        sb.append(',');
        sb.append("etaPrime");
        sb.append('=');
        sb.append(((this.etaPrime == null)?"<null>":this.etaPrime));
        sb.append(',');
        sb.append("filterRmsd");
        sb.append('=');
        sb.append(((this.filterRmsd == null)?"<null>":this.filterRmsd));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("frame");
        sb.append('=');
        sb.append(((this.frame == null)?"<null>":this.frame));
        sb.append(',');
        sb.append("gamma");
        sb.append('=');
        sb.append(((this.gamma == null)?"<null>":this.gamma));
        sb.append(',');
        sb.append("glycoBond");
        sb.append('=');
        sb.append(((this.glycoBond == null)?"<null>":this.glycoBond));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("indexChain");
        sb.append('=');
        sb.append(((this.indexChain == null)?"<null>":this.indexChain));
        sb.append(',');
        sb.append("ntCode");
        sb.append('=');
        sb.append(((this.ntCode == null)?"<null>":this.ntCode));
        sb.append(',');
        sb.append("ntId");
        sb.append('=');
        sb.append(((this.ntId == null)?"<null>":this.ntId));
        sb.append(',');
        sb.append("ntName");
        sb.append('=');
        sb.append(((this.ntName == null)?"<null>":this.ntName));
        sb.append(',');
        sb.append("ntResnum");
        sb.append('=');
        sb.append(((this.ntResnum == null)?"<null>":this.ntResnum));
        sb.append(',');
        sb.append("ntType");
        sb.append('=');
        sb.append(((this.ntType == null)?"<null>":this.ntType));
        sb.append(',');
        sb.append("phaseAngle");
        sb.append('=');
        sb.append(((this.phaseAngle == null)?"<null>":this.phaseAngle));
        sb.append(',');
        sb.append("puckering");
        sb.append('=');
        sb.append(((this.puckering == null)?"<null>":this.puckering));
        sb.append(',');
        sb.append("splayAngle");
        sb.append('=');
        sb.append(((this.splayAngle == null)?"<null>":this.splayAngle));
        sb.append(',');
        sb.append("splayDistance");
        sb.append('=');
        sb.append(((this.splayDistance == null)?"<null>":this.splayDistance));
        sb.append(',');
        sb.append("splayRatio");
        sb.append('=');
        sb.append(((this.splayRatio == null)?"<null>":this.splayRatio));
        sb.append(',');
        sb.append("ssZp");
        sb.append('=');
        sb.append(((this.ssZp == null)?"<null>":this.ssZp));
        sb.append(',');
        sb.append("sugarClass");
        sb.append('=');
        sb.append(((this.sugarClass == null)?"<null>":this.sugarClass));
        sb.append(',');
        sb.append("suiteness");
        sb.append('=');
        sb.append(((this.suiteness == null)?"<null>":this.suiteness));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("theta");
        sb.append('=');
        sb.append(((this.theta == null)?"<null>":this.theta));
        sb.append(',');
        sb.append("thetaBase");
        sb.append('=');
        sb.append(((this.thetaBase == null)?"<null>":this.thetaBase));
        sb.append(',');
        sb.append("thetaPrime");
        sb.append('=');
        sb.append(((this.thetaPrime == null)?"<null>":this.thetaPrime));
        sb.append(',');
        sb.append("v0");
        sb.append('=');
        sb.append(((this.v0 == null)?"<null>":this.v0));
        sb.append(',');
        sb.append("v1");
        sb.append('=');
        sb.append(((this.v1 == null)?"<null>":this.v1));
        sb.append(',');
        sb.append("v2");
        sb.append('=');
        sb.append(((this.v2 == null)?"<null>":this.v2));
        sb.append(',');
        sb.append("v3");
        sb.append('=');
        sb.append(((this.v3 == null)?"<null>":this.v3));
        sb.append(',');
        sb.append("v4");
        sb.append('=');
        sb.append(((this.v4 == null)?"<null>":this.v4));
        sb.append(',');
        sb.append("zeta");
        sb.append('=');
        sb.append(((this.zeta == null)?"<null>":this.zeta));
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
        result = ((result* 31)+((this.ssZp == null)? 0 :this.ssZp.hashCode()));
        result = ((result* 31)+((this.cluster == null)? 0 :this.cluster.hashCode()));
        result = ((result* 31)+((this.suiteness == null)? 0 :this.suiteness.hashCode()));
        result = ((result* 31)+((this.bin == null)? 0 :this.bin.hashCode()));
        result = ((result* 31)+((this.glycoBond == null)? 0 :this.glycoBond.hashCode()));
        result = ((result* 31)+((this.splayAngle == null)? 0 :this.splayAngle.hashCode()));
        result = ((result* 31)+((this.delta == null)? 0 :this.delta.hashCode()));
        result = ((result* 31)+((this.filterRmsd == null)? 0 :this.filterRmsd.hashCode()));
        result = ((result* 31)+((this.ntResnum == null)? 0 :this.ntResnum.hashCode()));
        result = ((result* 31)+((this.dp == null)? 0 :this.dp.hashCode()));
        result = ((result* 31)+((this.theta == null)? 0 :this.theta.hashCode()));
        result = ((result* 31)+((this.epsilon == null)? 0 :this.epsilon.hashCode()));
        result = ((result* 31)+((this.eta == null)? 0 :this.eta.hashCode()));
        result = ((result* 31)+((this.ntType == null)? 0 :this.ntType.hashCode()));
        result = ((result* 31)+((this.chi == null)? 0 :this.chi.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.dbn == null)? 0 :this.dbn.hashCode()));
        result = ((result* 31)+((this.ntId == null)? 0 :this.ntId.hashCode()));
        result = ((result* 31)+((this.thetaBase == null)? 0 :this.thetaBase.hashCode()));
        result = ((result* 31)+((this.puckering == null)? 0 :this.puckering.hashCode()));
        result = ((result* 31)+((this.c5primeXyz == null)? 0 :this.c5primeXyz.hashCode()));
        result = ((result* 31)+((this.pXyz == null)? 0 :this.pXyz.hashCode()));
        result = ((result* 31)+((this.etaBase == null)? 0 :this.etaBase.hashCode()));
        result = ((result* 31)+((this.frame == null)? 0 :this.frame.hashCode()));
        result = ((result* 31)+((this.etaPrime == null)? 0 :this.etaPrime.hashCode()));
        result = ((result* 31)+((this.ntName == null)? 0 :this.ntName.hashCode()));
        result = ((result* 31)+((this.amplitude == null)? 0 :this.amplitude.hashCode()));
        result = ((result* 31)+((this.phaseAngle == null)? 0 :this.phaseAngle.hashCode()));
        result = ((result* 31)+((this.alpha == null)? 0 :this.alpha.hashCode()));
        result = ((result* 31)+((this.epsilonZeta == null)? 0 :this.epsilonZeta.hashCode()));
        result = ((result* 31)+((this.bbType == null)? 0 :this.bbType.hashCode()));
        result = ((result* 31)+((this.beta == null)? 0 :this.beta.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.zeta == null)? 0 :this.zeta.hashCode()));
        result = ((result* 31)+((this.chainName == null)? 0 :this.chainName.hashCode()));
        result = ((result* 31)+((this.thetaPrime == null)? 0 :this.thetaPrime.hashCode()));
        result = ((result* 31)+((this.ntCode == null)? 0 :this.ntCode.hashCode()));
        result = ((result* 31)+((this.sugarClass == null)? 0 :this.sugarClass.hashCode()));
        result = ((result* 31)+((this.splayRatio == null)? 0 :this.splayRatio.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.indexChain == null)? 0 :this.indexChain.hashCode()));
        result = ((result* 31)+((this.v0 == null)? 0 :this.v0 .hashCode()));
        result = ((result* 31)+((this.splayDistance == null)? 0 :this.splayDistance.hashCode()));
        result = ((result* 31)+((this.v1 == null)? 0 :this.v1 .hashCode()));
        result = ((result* 31)+((this.v2 == null)? 0 :this.v2 .hashCode()));
        result = ((result* 31)+((this.v3 == null)? 0 :this.v3 .hashCode()));
        result = ((result* 31)+((this.gamma == null)? 0 :this.gamma.hashCode()));
        result = ((result* 31)+((this.v4 == null)? 0 :this.v4 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nt) == false) {
            return false;
        }
        Nt rhs = ((Nt) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.ssZp == rhs.ssZp)||((this.ssZp!= null)&&this.ssZp.equals(rhs.ssZp)))&&((this.cluster == rhs.cluster)||((this.cluster!= null)&&this.cluster.equals(rhs.cluster))))&&((this.suiteness == rhs.suiteness)||((this.suiteness!= null)&&this.suiteness.equals(rhs.suiteness))))&&((this.bin == rhs.bin)||((this.bin!= null)&&this.bin.equals(rhs.bin))))&&((this.glycoBond == rhs.glycoBond)||((this.glycoBond!= null)&&this.glycoBond.equals(rhs.glycoBond))))&&((this.splayAngle == rhs.splayAngle)||((this.splayAngle!= null)&&this.splayAngle.equals(rhs.splayAngle))))&&((this.delta == rhs.delta)||((this.delta!= null)&&this.delta.equals(rhs.delta))))&&((this.filterRmsd == rhs.filterRmsd)||((this.filterRmsd!= null)&&this.filterRmsd.equals(rhs.filterRmsd))))&&((this.ntResnum == rhs.ntResnum)||((this.ntResnum!= null)&&this.ntResnum.equals(rhs.ntResnum))))&&((this.dp == rhs.dp)||((this.dp!= null)&&this.dp.equals(rhs.dp))))&&((this.theta == rhs.theta)||((this.theta!= null)&&this.theta.equals(rhs.theta))))&&((this.epsilon == rhs.epsilon)||((this.epsilon!= null)&&this.epsilon.equals(rhs.epsilon))))&&((this.eta == rhs.eta)||((this.eta!= null)&&this.eta.equals(rhs.eta))))&&((this.ntType == rhs.ntType)||((this.ntType!= null)&&this.ntType.equals(rhs.ntType))))&&((this.chi == rhs.chi)||((this.chi!= null)&&this.chi.equals(rhs.chi))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.dbn == rhs.dbn)||((this.dbn!= null)&&this.dbn.equals(rhs.dbn))))&&((this.ntId == rhs.ntId)||((this.ntId!= null)&&this.ntId.equals(rhs.ntId))))&&((this.thetaBase == rhs.thetaBase)||((this.thetaBase!= null)&&this.thetaBase.equals(rhs.thetaBase))))&&((this.puckering == rhs.puckering)||((this.puckering!= null)&&this.puckering.equals(rhs.puckering))))&&((this.c5primeXyz == rhs.c5primeXyz)||((this.c5primeXyz!= null)&&this.c5primeXyz.equals(rhs.c5primeXyz))))&&((this.pXyz == rhs.pXyz)||((this.pXyz!= null)&&this.pXyz.equals(rhs.pXyz))))&&((this.etaBase == rhs.etaBase)||((this.etaBase!= null)&&this.etaBase.equals(rhs.etaBase))))&&((this.frame == rhs.frame)||((this.frame!= null)&&this.frame.equals(rhs.frame))))&&((this.etaPrime == rhs.etaPrime)||((this.etaPrime!= null)&&this.etaPrime.equals(rhs.etaPrime))))&&((this.ntName == rhs.ntName)||((this.ntName!= null)&&this.ntName.equals(rhs.ntName))))&&((this.amplitude == rhs.amplitude)||((this.amplitude!= null)&&this.amplitude.equals(rhs.amplitude))))&&((this.phaseAngle == rhs.phaseAngle)||((this.phaseAngle!= null)&&this.phaseAngle.equals(rhs.phaseAngle))))&&((this.alpha == rhs.alpha)||((this.alpha!= null)&&this.alpha.equals(rhs.alpha))))&&((this.epsilonZeta == rhs.epsilonZeta)||((this.epsilonZeta!= null)&&this.epsilonZeta.equals(rhs.epsilonZeta))))&&((this.bbType == rhs.bbType)||((this.bbType!= null)&&this.bbType.equals(rhs.bbType))))&&((this.beta == rhs.beta)||((this.beta!= null)&&this.beta.equals(rhs.beta))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.zeta == rhs.zeta)||((this.zeta!= null)&&this.zeta.equals(rhs.zeta))))&&((this.chainName == rhs.chainName)||((this.chainName!= null)&&this.chainName.equals(rhs.chainName))))&&((this.thetaPrime == rhs.thetaPrime)||((this.thetaPrime!= null)&&this.thetaPrime.equals(rhs.thetaPrime))))&&((this.ntCode == rhs.ntCode)||((this.ntCode!= null)&&this.ntCode.equals(rhs.ntCode))))&&((this.sugarClass == rhs.sugarClass)||((this.sugarClass!= null)&&this.sugarClass.equals(rhs.sugarClass))))&&((this.splayRatio == rhs.splayRatio)||((this.splayRatio!= null)&&this.splayRatio.equals(rhs.splayRatio))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.indexChain == rhs.indexChain)||((this.indexChain!= null)&&this.indexChain.equals(rhs.indexChain))))&&((this.v0 == rhs.v0)||((this.v0 != null)&&this.v0 .equals(rhs.v0))))&&((this.splayDistance == rhs.splayDistance)||((this.splayDistance!= null)&&this.splayDistance.equals(rhs.splayDistance))))&&((this.v1 == rhs.v1)||((this.v1 != null)&&this.v1 .equals(rhs.v1))))&&((this.v2 == rhs.v2)||((this.v2 != null)&&this.v2 .equals(rhs.v2))))&&((this.v3 == rhs.v3)||((this.v3 != null)&&this.v3 .equals(rhs.v3))))&&((this.gamma == rhs.gamma)||((this.gamma!= null)&&this.gamma.equals(rhs.gamma))))&&((this.v4 == rhs.v4)||((this.v4 != null)&&this.v4 .equals(rhs.v4))));
    }

}
