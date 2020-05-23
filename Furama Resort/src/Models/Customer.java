package Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phoneNum;
    private String email;
    private String typeCustomer;
    private String address;
    private Services useService;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNum, String email, String typeCustomer, String address, Services useService) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNum = phoneNum;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.useService = useService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public int getYearBirthday() {
        String temp = "";
        for (int i = birthday.length() - 4; i < birthday.length(); i++) {
            temp += birthday.charAt(i);
        }
        return new Integer(temp);
    }

    public String showInfor() {
        return "NameCustomer: " + name + "\n" +
                "idCard: " + idCard + "\n" +
                "Birthday: " + birthday + "\n" +
                "Gender: " + gender + "\n" +
                "PhoneNumber: " + phoneNum + "\n" +
                "Email: " + email + "\n" +
                "TypeCustomer: " + typeCustomer + "\n" +
                "Address: " + address + "\n";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", useService=" + useService +
                '}';
    }
}
