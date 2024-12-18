(ns ch01.coffee-break-01
  (:require [clojure.test :refer [is]]))

; public static int calculateScore(String word) {
;   int store = 0;
;   for (char c : word.toCharArray()) {
;     store++;
;   }
;   return store
; }

(defn word-score [w]
  (count w))

(is (= 12 (word-score "hello world!")))

; public static int calculateScore(String word) {
;   int store = 0;
;   for (char c : word.toCharArray()) {
;     if (c !+ 'a') {
;      store++;
;     }
;   }
;   return store
; }

(defn word-score [w]
  (count (filter #(not= \a %) w)))

(is (= 12 (word-score "hello world!")))
(is (= 16 (word-score "hello world! again")))
