object ShoppingCard {
	def getDiscountPercentage(items: List[String]): Int = {
		if(items.contains("Книга")) {
			5
		} else {
		0
		}
	}
}
