void main () {
   int salary = Integer.parseInt(IO.readln("Enter salary : "));
   int deductionper = Integer.parseInt(IO.readln("Enter deduction percent : "));
   double deduction = salary * deductionper / 100;
   double Net = salary * deduction;
   IO.println("Deduction = %.2f ".formatted(deduction));
   IO.println("Net salary = %.2f ".formatted(Net));
}
