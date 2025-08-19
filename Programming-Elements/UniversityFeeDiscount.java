// Program to calculate discounted fee
class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Fixed values
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculate final fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);
    }
}