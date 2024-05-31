package UsersManagement.User;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Address address;

    protected User(UserBuilder args) {
        this.firstName = args.firstName;
        this.lastName = args.lastName;
        this.email = args.email;
        this.password = args.password;
        this.phone = args.phone;
        this.address = args.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName : " + firstName + ",\n" +
                "lastName : " + lastName + ",\n" +
                "email : " + email + ",\n" +
                "password : " + password + ",\n" +
                "phone : " + phone + ",\n" +
                "address : " + address +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void Address(Address address) {
        this.address = address;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phone;
        private Address address;

        public UserBuilder FirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder LastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder Email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder Phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder Address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
           return new User(this);
        }

    }

}
