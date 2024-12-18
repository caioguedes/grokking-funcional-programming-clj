(ns ch03.coffee-break-04
  (:require [clojure.test :refer [is]]
            [clojure.string :as str]))

;Scala
;def abbreviate(name: String): String = {
;  val initial   = name.substring(0, 1)
;  val separator = name.indexOf(' ')
;  val lastName  = name.substring(separator + 1)
;  initial + ". " + lastName
;}
(defn abbreviate [name]
  (let [[fname lname] (str/split name #" ")
        initial (first fname)]
    (str initial ". " lname)))

(is (= "A. Church" (abbreviate "Alonzo Church")))
(is (= "A. Church" (abbreviate "A. Church")))
(is (= "A. Church" (abbreviate "A Church")))
