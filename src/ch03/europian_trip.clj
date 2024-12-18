(ns ch03.europian-trip
 (:require [clojure.test :refer [is]]))

;static List<String> replan(List<String> plan,
;                          String newCity,
;                          String beforeCity) {
;   int newCityIndex = plan.indexOf(beforeCity);
;   List<String> replanned = new ArrayList<>(plan);
;   replanned.add(newCityIndex, newCity);
;   return replanned;
;}


(def plan ["Paris", "Berlin" "Kraków"])

(defn replan [plan old-city new-city]
  (let [pos (first (keep-indexed #(when (= %2 old-city) %1) plan))
        ;; pos (.indexOf plan old-city)
        ;; left (take pos plan)
        ;; right (drop pos plan)
        [left right] (split-at pos plan)]
    (concat left [new-city] right)))

(is (= ["Paris", "Berlin" "Vienna" "Kraków"]
       (replan plan "Kraków" "Vienna")))

(is (= ["Spain", "Paris", "Berlin" "Kraków"]
       (replan plan "Paris" "Spain")))

