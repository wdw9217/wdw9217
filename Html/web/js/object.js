'use strict'
//1. object
// object= {키(우리가 접근 할 수 있는 프로퍼티): 값의 집합체(프로퍼티가 가지고 있는 값)}
/*
const name = 'mr_Woo';
const age = 31;
const job = true;
const color = 'black';
print(name, age);

function print(name, age){
    console.log(name);
    console.log(age);
}
*/


const person1 = {name:'Woo' , age: 31};

function print(person){
    console.log(person.name);
    console.log(person.age);
}


person1.job = true;
person1.pay=1000;
console.log(person1.name);
console.log(person1.age);
console.log(person1.job);
console.log(person1.pay);

//2. computed properites

console.log(person1.name);
console.log(person1['name']);
person1['job']=true;
console.log(person1.job);


function printValue(obj, key){
    console.log(obj.key);
    console.log(obj[key]);
}



printValue(person1, 'name');
printValue(person1, 'age');



//3. in operator 오브젝트 안에 해당 키가 있는지 없는지 확인

console.log('name' in person1);
console.log('age' in person1);
console.log('job' in person1);


//4. for in for of

for(key in person1){
    console.log(key);
}


const array = [1,2,3,4,5];
for (value of array){
    console.log(value);
}

for(let i=0; i<array.length;i++){
    console.log(array[i]);
}