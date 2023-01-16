(ns core-test
  (:require [clojure.test :refer :all]
            [two-sum :refer [two-sum]]
            [remove-url-anchor :refer [remove-url-anchor]]
            [tribonacci :refer [tribonacci]]
            [bus :refer [number]]))

(deftest two-sum-tests
  (are [seq target expected] (= (two-sum seq target) expected)
    [1 2 3] 4 [0 2]
    [1234 5678 9012] 14690 [1 2]
    [2 2 3] 4 [0 1]))

(deftest remove-ult-anchor-tests
  (are [url expected] (= (remove-url-anchor url) expected)
    "test1#test2" "test1"
    "www.codewars.com#about" "www.codewars.com"
    "www.codewars.com/katas/?page=1#about" "www.codewars.com/katas/?page=1"
    "www.codewars.com/katas/" "www.codewars.com/katas/"))

(deftest tribonacci-tests
  (are [sequence n expected] (= (tribonacci sequence n) expected)
    [1 1 1] 10 [1 1 1 3 5 9 17 31 57 105]
    [0 0 1] 10 [0 0 1 1 2 4 7 13 24 44]
    [0 1 1] 10 [0 1 1 2 4 7 13 24 44 81]
    [1 0 0] 10 [1 0 0 1 1 2 4 7 13 24]
    [0 0 0] 10 [0 0 0 0 0 0 0 0 0 0]
    [1 2 3] 10 [1 2 3 6 11 20 37 68 125 230]
    [3 2 1] 10 [3 2 1 6 9 16 31 56 103 190]
    [1 1 1] 1 [1]
    [300 200 100] 0 []
    [0.5 0.5 0.5] 30 [0.5 0.5 0.5 1.5 2.5 4.5 8.5 15.5 28.5 52.5 96.5 177.5 326.5 600.5 1104.5 2031.5 3736.5 6872.5 12640.5 23249.5 42762.5 78652.5 144664.5 266079.5 489396.5 900140.5 1655616.5 3045153.5 5600910.5 10301680.5]))

(deftest number-tests
  (are [seq expected] (= (number seq) expected)
    [[10 0] [3 5] [5 8]] 5
    [[3 0] [9 1] [4 10] [12 2] [6 1] [7 10]] 17
    [[3 0] [9 1] [4 8] [12 2] [6 1] [7 8]] 21))