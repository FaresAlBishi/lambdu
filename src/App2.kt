fun main(args: Array<String>) {
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingset = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingset")
    val moreShopping = setOf("Chives","Spainch","Milk")
    mShoppingset.addAll(moreShopping)
  println("mShopping items added:$mShoppingset )
             mShoppingList = 
}