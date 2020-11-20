const items = document.querySelector(".items");
const input = document.querySelector(".main_input");
const addBtn = document.querySelector(".footer_button");

console.log(items);
console.log(input);
console.log(addBtn);

function onadd() {
  const text = input.value;
  console.log(text);
  if (text === "") {
    return;
  }

  const item = createItem(text);

  items.appendChild(item);

  input.value = "";
}

function createItem(text) {
  const itemRow = document.createElement("li");
  itemRow.setAttribute("class", "item_row");

  const item = document.createElement("div");
  item.setAttribute("class", "item");

  const name = document.createElement("span");
  name.setAttribute("class", "item_name");
  name.innerText = text;

  const deleteBtn = document.createElement("div");
  deleteBtn.setAttribute("class", "item_delete");

  deleteBtn.innerHTML = '<i class="fas fa-carrot"></i>';
  deleteBtn.addEventListener("click", () => {
    items.removeChild(itemRow);
  });

  const item_divider = document.createElement("div");
  item_divider.setAttribute("class", "item_divider");

  item.appendChild(name);
  item.appendChild(deleteBtn);

  itemRow.appendChild(item);
  itemRow.appendChild(item_divider);
  return itemRow;
}

addBtn.addEventListener("click", () => {
  onadd();
});

input.addEventListener("keypress", (event) => {
  if (event.key == "Enter") {
    onadd();
  }
});
