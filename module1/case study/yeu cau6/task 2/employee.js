let Employee = function () {

    this.getName = function () {
        return this.name
    };

    this.getcmnd = function () {
        return this.cmnd
    };
    this.getPhone = function () {
        return this.phone
    };

    this.getBirthday = function () {
        return this.birthday
    };
    this.getLevel = function () {
        return this.level

    };
    this.getEmail = function () {
        return this.email
    };
    this.getLocation = function () {
        return this.location
    };
    this.getSalary = function () {
        if (this.getLocation() === "Manager") {
            this.salary = 500
        } else if (this.getLocation() === "Sale") {
            this.salary = 300
        } else if (this.getLocation() === "Marketing") {
            this.salary = 200
        }
        return this.salary
    };
    this.setName = function (name) {
        this.name = name
    };
    this.setBirthday = function (birthday) {
        this.birthday = birthday
    };
    this.setcmnd = function (cmnd) {
        this.cmnd = cmnd
    };
    this.setEmail = function (email) {
        this.email = email
    };
    this.setPhone = function (phone) {
        this.phone = phone
    };
    this.setLevel = function (level) {
        this.level = level
    };
    this.setLocation = function (location) {
        this.location = location
    }
} ;
