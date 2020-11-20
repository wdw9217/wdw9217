"use strist";

//1 오브젝트를  json화 시키기

let json = JSON.stringify(true);
console.log(json);

json = JSON.stringify("🍜", "🍪");
console.log(json);

const cat = {
  name: "tensu",
  color: "white",
  size: "null",
  birthDate: new Date(),

  yaong: () => {
    console.log(`${name} 야옹`);
  },
};

console.clear();
console.log(cat);

json = JSON.stringify(cat); //보내기
console.log(json); //받기

console.clear();

console.log(cat);
console.clear();

json = JSON.stringify(cat);
//perse = JSON.perse(json);

const obj = JSON.parse(json, (key, value) => {
  console.log(`key: ${key} value: ${value}`);
  return value == "birthDate" ? new Date(value) : value;
});

console.log(obj);
console.log(cat.birthDate.getDate());
//console.log(obj.birthDate.getDate());

function abc() {
  let a = "bbb";
  console.log(a);
  function c() {
    console.log(a);
    (function () {
      console.log(a);
      a = "ccc";
    });
    var a;
    console.log(a);
  }
}
