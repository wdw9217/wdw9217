import { Homepage } from "./homepage.js";

("use strict");
class Homepage {
  constructor() {
    this.canvas = document.createElement("canvas");
    this.ctx = this.canvas.getContext("2d");
    document.body.appendChild(this.canvas);

    this.homepage = new Homepage();

    window.addEventListener("resize", this.resize.bind(this), false);
    this.resize();
    requestAnimationFrame(this.animate.bind(this));
  }

  resize() {
    this.stageWidth = document.body.clientWidth;
    this.stageHeight = document.body.clientHeight;
    this.canvas.width = this.stageWidth * 2;
    this.canvas.height = this.stageHeight * 2;
    this.ctx.scale(2, 2);

    this.homepage.resize(this.stageWidth, this.stageHeight);
  }

  animate(t) {
    this.ctx.clearRect(0, 0, this.stageWidth, this.stageHeight);
    this.homepage.draw(this.ctx);
    requestAnimationFrame(this.animate.bind(this));
  }
}

window.onload = () => {
  new Homepage();
};
