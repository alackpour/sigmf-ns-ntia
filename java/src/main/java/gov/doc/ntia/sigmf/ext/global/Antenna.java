package gov.doc.ntia.sigmf.ext.global;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Antenna {

    @JsonProperty(value="ntia-antenna:model", required = true)
    protected String model;

    @JsonProperty(value="ntia-antenna:type", required=false)
    protected  String type;

    @JsonProperty(value="ntia-antenna:low_frequency", required = false)
    protected Double lowFrequency;

    @JsonProperty(value="ntia-antenna:high_frequency", required = false)
    protected Double highFrequency;

    @JsonProperty(value="ntia-antenna:gain", required=false)
    protected Double gain;

    @JsonProperty(value="ntia-antenna:horizontal_gain_pattern", required = false)
    protected Double[] horizontalGainPattern;

    @JsonProperty(value="ntia-antenna:vertical_gain_pattern", required = false)
    protected  Double[] verticalGainPattern;

    @JsonProperty(value="ntia-antenna:horizontal_beam_width", required = false)
    protected Double horizontalBeamWidth;

    @JsonProperty(value="ntia-antenna:vertical_beam_width", required = false)
    protected Double verticalBeamWidth;

    @JsonProperty(value="ntia-antenna:cross_polar_discrimination", required = false)
    protected Double crossPolarDiscrimination;

    @JsonProperty(value="ntia-antenna:voltage_standing_wave_ratio", required = false)
    protected Double voltageStandingWaveRatio;

    @JsonProperty(value="ntia-antenna:cable_loss", required = false)
    protected Double cableLoss;

    @JsonProperty(value="ntia-antenna:steerable", required = false)
    protected Boolean steerable;

    @JsonProperty(value="ntia-antenna:mobile", required = false)
    protected Boolean mobile;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLowFrequency() {
        return lowFrequency;
    }

    public void setLowFrequency(Double lowFrequency) {
        this.lowFrequency = lowFrequency;
    }

    public Double getHighFrequency() {
        return highFrequency;
    }

    public void setHighFrequency(Double highFrequency) {
        this.highFrequency = highFrequency;
    }

    public Double getGain() {
        return gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Double[] getHorizontalGainPattern() {
        return horizontalGainPattern;
    }

    public void setHorizontalGainPattern(Double[] horizontalGainPattern) {
        this.horizontalGainPattern = horizontalGainPattern;
    }

    public Double[] getVerticalGainPattern() {
        return verticalGainPattern;
    }

    public void setVerticalGainPattern(Double[] verticalGainPattern) {
        this.verticalGainPattern = verticalGainPattern;
    }

    public Double getHorizontalBeamWidth() {
        return horizontalBeamWidth;
    }

    public void setHorizontalBeamWidth(Double horizontalBeamWidth) {
        this.horizontalBeamWidth = horizontalBeamWidth;
    }

    public Double getVerticalBeamWidth() {
        return verticalBeamWidth;
    }

    public void setVerticalBeamWidth(Double verticalBeamWidth) {
        this.verticalBeamWidth = verticalBeamWidth;
    }

    public Double getCrossPolarDiscrimination() {
        return crossPolarDiscrimination;
    }

    public void setCrossPolarDiscrimination(Double crossPolarDiscrimination) {
        this.crossPolarDiscrimination = crossPolarDiscrimination;
    }

    public Double getVoltageStandingWaveRatio() {
        return voltageStandingWaveRatio;
    }

    public void setVoltageStandingWaveRatio(Double voltageStandingWaveRatio) {
        this.voltageStandingWaveRatio = voltageStandingWaveRatio;
    }

    public Double getCableLoss() {
        return cableLoss;
    }

    public void setCableLoss(Double cableLoss) {
        this.cableLoss = cableLoss;
    }

    public Boolean getSteerable() {
        return steerable;
    }

    public void setSteerable(Boolean steerable) {
        this.steerable = steerable;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }


}