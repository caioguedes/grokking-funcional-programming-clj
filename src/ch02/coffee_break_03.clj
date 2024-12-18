(ns ch02.coffee-break-03
  (:require [clojure.test :refer [is]]))

(defn increment [i]
  (+ i 1))

(is (= 2 (increment 1)))
(is (= 5 (increment 4)))
(is (= -9 (increment -10)))

(defn add [a b]
  (+ a b))

(is (= 2 (add 1 1)))
(is (= 4 (add 3 1)))

(defn word-store [w]
  (count (filter #(not= % \a) w)))

(is (= 4 (word-store "word")))
(is (= 9 (word-store "foobarword")))
(is (= 0 (word-store "")))
