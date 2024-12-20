(ns ch04.ranking-words
  (:require [clojure.test :refer [is]]
            [clojure.string :as str]))

; - The score of a given word is calculated by giving one point for each letter
; that is not an 'a'
; - For given list of words, return a storted list that starts with the highest-
;scoring word

(def words ["ada" "haskell" "scala" "java" "rust"])

(defn score [word]
  (count (filter #(not= % \a) word)))

;; (defn ranked-words [words]
;;  (sort #(> (score %1) (score %2)) words))
(defn score-bonus [word]
  (let [base (score word)]
    (cond
      (str/index-of word \c) (+ base 5)
      :else base)))

(defn score-bonus-penalty [word]
  (let [base (score-bonus word)]
    (cond
      (str/index-of word \s) (- base 7)
      :else base)))

(defn ranked-words [compare-fn words]
  (sort #(> (compare-fn %1) (compare-fn %2)) words))

(is (= ["haskell" "rust" "scala" "java" "ada"]
       (ranked-words score words)))

(is (= ["scala" "haskell" "rust" "java" "ada"]
       (ranked-words score-bonus words)))

(is (= ["java" "ada" "scala" "haskell" "rust" ]
       (ranked-words score-bonus-penalty words)))