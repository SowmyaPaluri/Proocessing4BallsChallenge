import processing.core.PApplet;

public class TryProcessing extends PApplet {
    Ball[] balls = new Ball[4];  // Array to hold the balls

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        // Initialize balls with different properties (speed and height)
        balls[0] = new Ball(1, height / 5, 1);
        balls[1] = new Ball(2, 2 * height / 5, 2);
        balls[2] = new Ball(3, 3 * height / 5, 3);
        balls[3] = new Ball(4, 4 * height / 5, 4);
    }

    @Override
    public void draw() {
        background(255);
        // Update and display each ball
        for (Ball ball : balls) {
            ball.update();
            ball.display();
        }
    }

    // Ball class to represent a ball
    class Ball {
        float x, y, speed;

        Ball(float y, float initY, float speed) {
            this.x = 0; this.y = initY; this.speed = speed;
        }

        void update() {
            x += speed;  // Move the ball
            if (x > width) x = 0;  // Reset position when off-screen
        }

        void display() {
            ellipse(x, y, 20, 20);  // Draw the ball
        }
    }
}
