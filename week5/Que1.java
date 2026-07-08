void main() {
    IO.print("Enter hours : ");
    int hours = Integer.parseInt(IO.readln());

    int minutes = Integer.parseInt(IO.readln("Enter minutes : "));
    int Total = (hours * 60) + minutes;
    IO.println("Total minutes = " + Total + " minutes.");
}