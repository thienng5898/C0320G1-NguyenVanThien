class Customer {
    constructor(name, cmnd, birthday, email, address, typeCustomer, discount, quantityInclude, rentDay, typeService, typeRoom) {
        this.name = name
        this.cmnd = cmnd
        this.birthday = birthday
        this.email = email
        this.address = address
        this.typeCustomer = typeCustomer
        this.discount = discount
        this.quantityInclude = quantityInclude
        this.rentDay = rentDay
        this.typeService = typeService
        this.typeRoom = typeRoom
    }

    getName() {
        return this.name
    }

    getcmnd() {
        return this.cmnd
    }

    getBirthday() {
        return this.birthday;
    }

    getEmail() {
        return this.email;
    }

    getAddress() {
        return this.address;
    }

    getTypeCustomer() {
        return this.typeCustomer;
    }

    getDiscount() {
        return this.discount;
    }

    getQuantityInclude() {
        return this.quantityInclude;
    }

    getRentDay() {
        return this.rentDay;
    }

    getTypeService() {
        return this.typeService;
    }

    getTypeRoom() {
        return this.typeRoom;
    }

    setName(name) {
        this.name = name
    }

    setcmnd(cmnd) {
        this.cmnd = cmnd
    }

    setBirthday(birthday) {
        this.birthday = birthday
    }

    setEmail(email) {
        this.email = email
    }

    setAddress(address) {
        this.address = address
    }

    setTypeCustomer(typecustomer) {
        this.typeCustomer = typecustomer
    }

    setDiscount(discount) {
        this.discount = discount
    }

    setQuantityInclude(quantitinclude) {
        this.quantityInclude = quantitinclude
    }

    setRentDay(rentday) {
        this.rentDay = rentday
    }

    setTypeService(typeservice) {
        this.typeService = typeservice
    }

    setTypeRoom(typeroom) {
        this.typeRoom = typeroom
    }

    totalPay() {
        let money = 0;
        if (this.getTypeService() === "Villa") {
            money = 500
        } else if (this.getTypeService() === "House") {
            money = 300
        } else if (this.getTypeService() === "Room") {
            money = 100
        }
        return this.getRentDay() * money * (1 - this.getDiscount() / 100)
    }
}