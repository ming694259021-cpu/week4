void main() {
    IO.print("Enter Wide: ");
    int Wide = Integer.parseInt(IO.readln());

    IO.print("Enter Long: ");
    int Long = Integer.parseInt(IO.readln());

    double BSA = (Wide * Long) / 360;
    IO.println("body surface area = " + BSA);
}