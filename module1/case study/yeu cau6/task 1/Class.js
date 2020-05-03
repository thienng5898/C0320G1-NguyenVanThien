let Customer = function () {
    this.setName = function (name) {
        this.name = name
    }
    this.getName = function () {
        return this.name
    }
    this.setcmnd = function (cmnd) {
        this.cmnd = cmnd
    }
    this.getcmnd = function () {
        return this.cmnd
    }
    this.setBirthday = function (birthday) {
        this.birthday = birthday
    }
    this.getBirthday = function () {
        return this.birthday
    }
    this.setEmail = function (email) {
        this.email = email
    }
    this.getEmail = function () {
        return this.email
    }
    this.setAddress = function (address) {
        this.address = address
    }
    this.getAddress = function () {
        return this.address
    }
    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer
    }
    this.getTypeCustomer = function () {
        return this.typeCustomer
    }
    this.setDiscount = function (discount) {
        this.discount = discount
    }
    this.getDisCount = function () {
        return this.discount
    }
    this.setQuantityInclude = function (quantityInclude) {
        this.quantityInclude = quantityInclude
    }
    this.getQuantityInclude = function () {
        return this.quantityInclude
    }
    this.setRentDay = function (rentDay) {
        this.rentDay = rentDay
    }
    this.getRentDay = function (rentDay) {
        return this.rentDay
    }
    this.setTypeService = function (typeService) {
        this.typeService = typeService
    }
    this.getTypeService = function (typeService) {
        return this.typeService
    }
    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom
    }
    this.getTypeRoom = function (typeRoom) {
        return this.typeRoom
    }
    this.totalPay = function () {
        let money = 0;
        if (this.getTypeService() === "Villa") {
            money = 500
        } else if (this.getTypeService() === "House") {
            money = 300
        } else if (this.getTypeService() === "Room") {
            money = 100
        }
        return this.getRentDay() * money * (1 - this.getDisCount() / 100)
    }
}