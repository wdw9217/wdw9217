'use strict'

class Person{
    constructor(name, age){
    this.name = name;
    this.age = age;
    }


speak(){
    console.log(`${this,name}: 안녕하세요.`);
}
}
const person1 = new Person('Lim' ,29);

console.log(person1.name);






//2. getter,setter


class User {
    constructor(firstName, lastname, age){
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }
    get age(){
        return this._age;
    }

    set age(value){
        this._age=value;
    }
}
const user1 = new User('Woo', 'DoWon', -1);
console.log(user1.age);



//3. public, private

class Experiment{
    publc_val = 2;
    #private_val = 4;

}

const experiment = new Experiment();
console.log(experiment.publc_val);
console.log(experiment.private_val);



//4. 다양성

class shape{
constructor(width, height, color){
    this.width=width;
    this.height=height;
    this.color=color;
}
    draw(){
    }

    getArea(){
        return this.width * this.height;
    }
}

class Triangle extends shape{ //함수의 상속
    draw(){
        console.log('🔺');
    }
    getArea(){
        return (this.width * this.height)/2; //함수의 재정의
    }

    
}
class Rectangle extends shape{
    draw(){
        console.log('⬜'); //함수 재정의  윈도우키+세미클론
    }
}


const rectangle = new Rectangle(20, 30, 'white');
rectangle.draw();
console.log(rectangle.getArea());

const triangle = new Triangle(20, 20, 'red');
triangle.draw();
console.log(triangle.getArea());

































































