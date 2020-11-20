//forEach

const cars = ["🚗", "🚓", "🚕", "🚙", "🚌"];
console.log(cars);

cars.forEach((car, index, array) => {
  console.log(`forEach : ${car}, ${index}, ${array}`);
});

cars.splice(4, 1);
console.log(cars);

cars.splice(0, 4);
console.log(cars);

for (let i = 0; i < cars.length; i++) {
  const j = cars[i];
  if (j == "🚗") {
  }
}
