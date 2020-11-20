import { Wave } from "./wave_wave.js";

export class WaveGroup {
  constructor() {
    this.totalWaves = 10;
    this.totalPoints = 60;

    this.color = [
      "rgba(255,0,0,0.4)",
      "rgba(255,255,0,0.4)",
      "rgba(0,255,255,0.4)",
      "rgba(100,100,0,0.4)",
      "rgba(0,100,255,0.4)",
      "rgba(800,0,0,0.4)",
      "rgba(0,700,0,0.4)",
      "rgba(700,0,255,0.4)",
      "rgba(0,0,100,0.4)",
      "rgba(0,800,400,0.4)",
    ];

    this.waves = [];

    for (let i = 0; i < this.totalWaves; i++) {
      const wave = new Wave(i, this.totalPoints, this.color[i]);
      this.waves[i] = wave;
    }
  }

  resize(stageWidth, stageHeight) {
    for (let i = 0; i < this.totalWaves; i++) {
      const wave = this.waves[i];
      wave.resize(stageWidth, stageHeight);
    }
  }

  draw(ctx) {
    for (let i = 0; i < this.totalWaves; i++) {
      const wave = this.waves[i];
      wave.draw(ctx);
    }
  }

  draw2(ctx) {
    for (let i = 0; i < this.totalWaves; i++) {
      const wave = this.waves[i];
      wave.draw2(ctx);
    }
  }
}
