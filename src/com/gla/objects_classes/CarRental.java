package javapractice;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        costPerDay = 100;
    }

    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();

        CarRental rental2 = new CarRental("Alice", "Toyota Camry", 3, 150);

        rental1.displayRental();
        rental2.displayRental();
    }
}