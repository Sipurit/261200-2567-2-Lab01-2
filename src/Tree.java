public class Tree {
    public static void main(String[] args) {

        Turtle bob = new Turtle();
        bob.up();
        bob.left(90);
        bob.backward(200);
        bob.width(50);
        bob.penColor("Black");
        bob.down();
        bob.forward(50);
        bob.up();
        bob.forward(10);
        bob.down();
        bob.penColor("green");
        bob.left(90);
        bob.forward(100);
        bob.backward(200);
        bob.up();
        bob.setPosition(0,-100);
        bob.down();
        bob.forward(80);
        bob.backward(160);
        for(int i=1;i<5;i++){
            int y= 10*i;
            bob.up();
            bob.setPosition(0,-100+(4*y));
            bob.down();
            bob.forward(80-(20*i));
            bob.backward(160-(40*i));
        }
        bob.up();
        bob.setPosition(0,58);
        bob.down();
        bob.penColor("gold");
        bob.right(45);
        bob.width(15);
        bob.forward(10);
        bob.backward(20);
        bob.setPosition(0,58);
        bob.right(90);
        bob.forward(10);
        bob.backward(20);
        bob.setPosition(0,58);
        bob.left(45);
        bob.forward(10);
        bob.backward(20);
        bob.up();
        bob.forward(300);
    }
}
