# /*
# Define component/entities for a Vending machine with following requirements:
# 
# 1) Vending machine can have different items with different prices(consider 3 types of products in Vending machine for now)
# 2) Vending machine accepts 10, 20 and 50 rupees notes only
# 3) Allows users to select any product and insert the notes
# 4) Allows users to cancel the current request and return the inserted note.
# 5) Return the selected items and change (if any)
# */
# 
# Classes
# Interfaces

AvailableCurrencyConfig ( 3 rows in DB ) => id, is_active, number, created_at, updated_at, description
Product ( 3 rows in DB ) => id, price, created_at, updated_at, quantity, name, description, type, is_active ( by default = 1)
Transactions => id, id_product, created_at, updated_at, status ( Initiated, Completed, Cancelled ), InsertedPrice ( sum of currencies ), change
AvailableNotes => id, quantity, description, id_currency

Inventory
Currency

VendorMachineCancellation() {

}

VendorMachineDispense(int ProductId, ) {

    Product selectedProduct = ;
    int[][] insertedCurrency;

    // Check if insertedCurrency is in AvailableCurrency
    // Check if Product is is_active

    if (selectedProduct.quantity > 0) {

        // Validation of the change
        // int change = insertedCurrency - selectedProduct.price;
        if (insertedCurrency >= selectedProduct.price) {

            // Insert transaction record
            selectedProduct.quantity--;
            
            // Algorim
            return change;
        }

    }
}
