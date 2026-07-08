void main() {
    int distance = Integer.parseInt(IO.readln("Enter distance : "));

    int efficiency = Integer.parseInt(IO.readln("Enter fuel efficiency : "));

    int price = Integer.parseInt(IO.readln("Enter fuel price per liter : "));
    double used = distance / efficiency;
    double total = used * price;
    IO.println("Fuel used = " + used);
    IO.println("Total cost = " + total);
}