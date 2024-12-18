(ns ch02.coffee-break-02
  (:require [clojure.test :refer [is]]))

;class TipCalculator {
;  private List<String> names = new ArrayList<>();
;  private int tipPercentage = 0;
;
;  public void addPerson(String name) {
;    names.add(name);
;    if(names.size() > 5) {
;      tipPercentage = 20;
;    } else if(names.size() > 0) {
;      tipPercentage = 10;
;    }
;  }
;  
;  public List<String> getNames() {
;    return names;
;  }
;  
;  public int getTipPercentage() {
;    return tipPercentage;
;  }
;}

(defn tip-percentage [group]
  (let [size (count group)]
    (cond (> size 5) 20
          (> size 0) 10
          :else 0)))

;; :else is a logical true

(is (= 0 (tip-percentage [])))
(is (= 10 (tip-percentage ["Caio" "Nico"])))
(is (= 20 (tip-percentage ["Caio" "Nico" "Raisa" "Jose" "Maria" "Iza"])))
