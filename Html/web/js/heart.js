"use strict";

const GAME_DURATION_SEC = 20;
const GUDU_COUNT = 1;
const GOLD_COUNT = 10;

const GUDU_SIZE = 80;
const FIELD_TOP_PADDING = 50;

const field = document.querySelector(".game__field");
const fieldRect = field.getBoundingClientRect();
const gameBtn = document.querySelector(".game__button");
const timerIndicator = document.querySelector(".game__timer");
const scoreText = document.querySelector(".game__score");
const popUp = document.querySelector(".pop-up");
const popUpMessage = document.querySelector(".pop-up__message");
const popUpRefreshBtn = document.querySelector(".pop-up__refresh");

const guduSound = new Audio("./sound/gudu_pull.mp3");
const failSound = new Audio("./sound/bug_pull.mp3");
const winSound = new Audio("./sound/game_win.mp3");
const bgSound = new Audio("./sound/bg.mp3");

let started = false;
let score = 0;
let timer = undefined;

gameBtn.addEventListener("click", () => {
  if (started) {
    stopGame();
  } else {
    startGame();
  }
  started = !started;
});

function startGame() {
  initGame();
  showStopButton();
  showTimerAndScore();
  startGameTimer();
  playSound(bgSound);
}

function stopGame() {
  stopGameTimer();
  hideStartButton();
  showPopUpWithText("REPLAY?");
  stopSound(bgSound);
}

function initGame() {
  field.innerHTML = "";
  addItem(field, GUDU_COUNT, "img/gudu.png", "gudu");
  addItem(field, GOLD_COUNT, "img/gold.png", "gold");
  field.addEventListener("click", onFieldClickListener);
}

function resetWorld() {
  hideTimerAndScore();
  hidePopUp();
  showStartButton();
  resetScoreText();
  score = 0;
  field.innerHTML = "";
}

function addItem(field, count, imgPath, className) {
  const x1 = 0;
  const x2 = fieldRect.width - GUDU_SIZE;
  const y1 = field.offsetTop + FIELD_TOP_PADDING;
  const y2 = field.offsetTop + fieldRect.height - GUDU_SIZE;
  for (let i = 0; i < count; i++) {
    const item = document.createElement("img");
    item.setAttribute("class", className);
    item.setAttribute("src", imgPath);
    item.style.position = "absolute";
    const x = randomNumber(x1, x2);
    const y = randomNumber(y1, y2);
    item.style.left = `${x}px`;
    item.style.top = `${y}px`;
    item.style.userDrag = "none";
    field.appendChild(item);
  }
}

function randomNumber(min, max) {
  return Math.random() * (max - min) + min;
}

function onFieldClickListener(event) {
  const target = event.target;
  if (!started) {
    return;
  }
  if (target.matches(".gudu")) {
    playSound(guduSound);
    target.remove();
    score++;
    updateScoreBoard(score);

    if (score === GUDU_COUNT) {
      finishGame(true);
    }
  } else if (target.matches(".gold")) {
    playSound(failSound);
    stopGameTimer();
    finishGame(false);
  }
}

function startGameTimer() {
  let remainingTimeSec = GAME_DURATION_SEC;
  updateTimerText(remainingTimeSec);

  timer = setInterval(() => {
    if (remainingTimeSec <= 0) {
      clearInterval(timer);

      if (started) {
        finishGame(score === GUDU_COUNT);
      }

      return;
    }
    updateTimerText(--remainingTimeSec);
  }, 1000);
}

function stopGameTimer() {
  clearInterval(timer);
}

function finishGame(win) {
  started = false;
  hideStartButton();
  stopSound(bgSound);

  if (win) {
    playSound(winSound);
  } else {
    playSound(failSound);
  }
  showPopUpWithText(win ? "당신은 신데렐라 ✨" : "넌 욕심쟁이  🎃");
}

function updateScoreBoard(newScore) {
  scoreText.innerText = GUDU_COUNT - newScore;
}

function playSound(sound) {
  sound.currentTime = 0;
  sound.play();
}

function stopSound(sound) {
  sound.pause();
}

function showStartButton() {
  const icon = gameBtn.querySelector(".fas");
  icon.classList.remove("fa-stop");
  gameBtn.style.visibility = "visible";
}

function showStopButton() {
  const icon = gameBtn.querySelector(".fas");
  icon.classList.add("fa-stop");
  gameBtn.style.visibility = "visible";
}

function hideStartButton() {
  gameBtn.style.visibility = "hidden";
}

function showTimerAndScore() {
  timerIndicator.style.visibility = "visible";
  scoreText.style.visibility = "visible";
}

function hideTimerAndScore() {
  timerIndicator.style.visibility = "hidden";
  scoreText.style.visibility = "hidden";
}

function updateTimerText(time) {
  const minutes = Math.floor(time / 60);
  const seconds = time % 60;
  timerIndicator.innerHTML = `${minutes}:${seconds}`;
}

function resetScoreText() {
  scoreText.innerText = GUDU_COUNT;
}

function showPopUpWithText(text) {
  popUpMessage.innerText = text;
  popUp.classList.remove("hide");
}

function hidePopUp() {
  popUp.classList.add("hide");
}

function init() {
  popUpRefreshBtn.addEventListener("click", () => {
    resetWorld();
    initGame();
  });
  resetWorld();
}

init();
