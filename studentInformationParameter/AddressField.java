package studentInformationParameter;

public class AddressField {

    private String line1;
    private String line2;
    private String townOrCity;
    private String district;
    private String state;
    private String pincode;
    private String nation;

    public AddressField(String line1,
                        String line2,
                        String townOrCity,
                        String district,
                        String state,
                        String nation,
                        String pincode) {

        this.setLine1(line1);
        this.setLine2(line2);
        this.setTownOrCity(townOrCity);
        this.setDistrict(district);
        this.setState(state);
        this.setNation(nation);
        this.setPincode(pincode);
    }

    public String getLine1() {
        return this.line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return this.line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getTownOrCity() {
        return this.townOrCity;
    }

    public void setTownOrCity(String townOrCity) {
        this.townOrCity = townOrCity;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
