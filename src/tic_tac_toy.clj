(ns tic-tac-toy)

(def board ["" "" "o"
            "" "x" ""
            "" "" ""])

;; Moves
;; Position Already Occupated

;; Check State
;; Tie
;; X Wins
;; 0 Wins

(defn display-board [board]
  (let [rows (partition-by 3 board)]
    (println rows)))

(display-board board)
