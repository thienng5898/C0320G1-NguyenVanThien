class Employee {
    constructor(name, cmnd, email, birthday, phone, location, level,) {
        this.name = name
        this.cmnd = cmnd
        this.email = email
        this.birthday = birthday
        this.phone = phone
        this.location = location
        this.level = level
    }

    getName() {
        return this.name
    }

    getcmnd() {
        return this.cmnd
    }

    getEmail() {
        return this.email
    }

    getBirthday() {
        return this.birthday
    }

    getPhone() {
        return this.phone
    }

    getLocation() {
        return this.location
    }

    getLevel() {
        return this.level
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

    setPhone(phone) {
        this.email = phone
    }

    setLocation(location) {
        this.email = location
    }

    setLevel(level) {
        this.email = level
    }

    getSalary() {
        if (this.getLocation() === "Manager") {
            this.salary = 500
        } else if (this.getLocation() === "Sale") {
            this.salary = 300
        } else if (this.getLocation() === "Marketing") {
            this.salary = 200
        }
        return this.salary
    };

}