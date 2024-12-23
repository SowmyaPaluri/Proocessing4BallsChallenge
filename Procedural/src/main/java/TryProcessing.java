import processing.core.PApplet;

public class TryProcessing extends PApplet {
    float[] ballX = new float[4];  // Array to store x positions of balls
    float[] ballY = {height / 5, 2 * height / 5, 3 * height / 5, 4 * height / 5};  // Predefined y positions
    float[] ballSpeed = {1, 2, 3, 4};  // Speeds for each ball

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        // Initialize x positions of the balls
        for (int i = 0; i < 4; i++) ballX[i] = 0;
    }

    @Override
    public void draw() {
        background(255);
        // Update and display each ball
        for (int i = 0; i < 4; i++) {
            ballX[i] += ballSpeed[i];  // Move each ball
            if (ballX[i] > width) ballX[i] = 0;  // Reset position when off-screen
            ellipse(ballX[i], ballY[i], 20, 20);  // Draw the ball
        }
    }
}
