class ContactAddress {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    int PhoneNum;
    String Email;

    public ContactAddress(String firstname, String LastName, String address, String city, int pins, int nums,
            String mail) {
        this.FirstName = firstname;
        this.LastName = LastName;
        this.Address = address;
        this.City = city;
        this.Zip = pins;
        this.PhoneNum = nums;
        this.Email = mail;
    }

    // Getter methods for accessing private fields
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public int getZip() {
        return Zip;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public String getEmail() {
        return Email;
    }

    // Setter methods for modifying private fields
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "ContactAddress [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
                + City + ", Zip=" + Zip + ", PhoneNum=" + PhoneNum + ", Email=" + Email + "]";
    }
}