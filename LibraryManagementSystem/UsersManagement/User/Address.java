package UsersManagement.User;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    protected Address(AddressBuilder args) {
        this.street = args.street;
        this.city = args.city;
        this.state = args.state;
        this.zipCode = args.zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street : '" + street + ",\n" +
                "city : " + city + ",\n" +
                "state : " + state + ",\n" +
                "zipCode : " + zipCode + '\n' +
                "}";
    }

    public static class AddressBuilder {
        private String street;
        private String city;
        private String state;
        private String zipCode;
        public AddressBuilder Street(String street) {
            this.street = street;
            return this;
        }
        public AddressBuilder City(String city) {
            this.city = city;
            return this;
        }
        public AddressBuilder State(String state) {
            this.state = state;
            return this;
        }
        public AddressBuilder ZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }
}
