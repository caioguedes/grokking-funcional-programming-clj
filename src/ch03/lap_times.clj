(ns ch03.lap-times
  (:require [clojure.test :refer [is]]))

(def laps [31.0 20.9 21.1 21.3])

;static double totalTime(List<Double> lapTimes) {
;  lapTimes.remove(0);
;  double sum = 0;
;  for (double x : lapTimes) {
;    sum += x;
;  }
;  return sum;
;}
(defn total-time [laps]
  (reduce + (rest laps)))

(is (= "63.3" (format "%.1f" (total-time laps))))

;static double avgTime(List<Double> lapTimes) {
;  double time = totalTime(lapTimes);
;  int laps = lapTimes.size();
;  return time / laps;
;}
(defn avg-time [laps]
  (let [time (total-time laps)
        laps (count (rest laps))]
    (/ time laps)))

(is (= "21.1" (format "%.1f" (avg-time laps))))
