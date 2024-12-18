(ns ch02.shopping-cart)

(defn discount-percentage [items]
  (if (first (filter #(= "Book" %) items)) 5.0 0.0))

(discount-percentage ["Book" "Apple"])
(discount-percentage ["Table" "Apple"])
