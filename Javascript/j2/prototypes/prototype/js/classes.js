class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    logMe() {
        console.log(this.name + " : " + this.age);
    }
}