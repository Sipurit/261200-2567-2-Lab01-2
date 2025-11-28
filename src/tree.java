public class star {
    public static void main(String[] args)

    {

        Turtle bob = new Turtle();
        bob.width(5);
        bob.penColor("purple");
        bob.fillColor("purple");

        for(int i=0;i<30;i++)

        {
            bob.forward(5);
            bob.left(15);

        }
        bob.speed(50);
        bob.forward(75);
        for(int i=0; i<12;i++){
            bob.forward(5);
            bob.right(15);
        }
        bob.forward(75);
        for(int i=0;i<24;i++)

        {
            bob.forward(5);
            bob.left(15);

        }
        bob.right(90);
        bob.forward(37);
        bob.right(180);
        bob.up();
        bob.forward(18.5);
        bob.left(90);
        bob.forward(100);
        bob.down();
        bob.penColor("green");
        for(int i=1;i<11;i++)

        {
            bob.dot("green",15*(i*0.25));
            bob.forward(10);


        }

    }
}
