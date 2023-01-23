(ns rock-paper-scissors)

(defn rps_ [p1 p2]
  (condp = [p1 p2]
    ["rock" "scissors"] "Player 1 won!"
    ["scissors" "paper"] "Player 1 won!"
    ["paper" "rock"] "Player 1 won!"
    ["scissors" "rock"] "Player 2 won!"
    ["paper" "scissors"] "Player 2 won!"
    ["rock" "paper"] "Player 2 won!"
    "Draw!"))

(defn rps [p1 p2]
  (cond
    (= p1 p2) "Draw!"
    (#{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]} [p1 p2]) "Player 1 won!"
    :else "Player 2 won!"))