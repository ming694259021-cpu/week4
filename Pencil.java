void main() {
    int box = Integer.parseInt(IO.readln("Enter number of box: "));
    int pencilPerBox = Integer.parseInt(IO.readln("Enter number of pencils per box: "));

    int total = box * pencilPerBox;

    IO.println("Total number of pencils = " + total + " pieces");
}