/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 9
 */

class DiscountRate {
    static double serviceDiscountPremium = 0.2, serviceDiscountGold = 0.15, serviceDiscountSilver = 0.1,
            productDiscountPremium = 0.1, productDiscountGold = 0.1, productDiscountSilver = 0.1;

    static double getServiceDiscountRate(String type) {
        return switch (type) {
            case "Premium" -> serviceDiscountPremium;
            case "Gold" -> serviceDiscountGold;
            case "Silver" -> serviceDiscountSilver;
            default -> 0;
        };
    }

    static double getProductDiscountRate(String type) {
        return switch (type) {
            case "Premium" -> productDiscountPremium;
            case "Gold" -> productDiscountGold;
            case "Silver" -> productDiscountSilver;
            default -> 0;
        };
    }
}