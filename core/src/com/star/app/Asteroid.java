package com.star.app;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Asteroid {
    private Texture texture;
    private Vector2 position;
    private Vector2 velocity;
    private float scale;

    public Asteroid() {
        this.texture = new Texture("asteroid.png");
        this.position = new Vector2(MathUtils.random(0, ScreenManager.SCREEN_WIDTH),
                MathUtils.random(0, ScreenManager.SCREEN_WIDTH));
        this.velocity = new Vector2(MathUtils.random(-200, 200), MathUtils.random(-200, 200));
        scale = 1/;
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x-128, position.y-128, 128, 128, 256, 256,
                scale, scale, 0, 0, 0, 256, 256, false, false);
    }
    public void update(float dt) {
        position.x += velocity.x * dt;
        position.y += velocity.y * dt;
        if (position.x < -128) {
            position.x += ScreenManager.SCREEN_WIDTH + 256;
        }
        if (position.x > ScreenManager.SCREEN_WIDTH + 128) {
            position.x -= ScreenManager.SCREEN_WIDTH - 256;
        }
        if (position.y < -128) {
            position.y += ScreenManager.SCREEN_HEIGHT + 256;
        }
        if (position.y > ScreenManager.SCREEN_HEIGHT + 128) {
            position.y -= ScreenManager.SCREEN_HEIGHT + 256;
        }

    }

}
