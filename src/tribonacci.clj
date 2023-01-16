(ns tribonacci)

(defn tribonacci [signature n]
  (let [inner-signature (take n signature)]
    (loop [sequence inner-signature]
      (cond
        (= (count sequence) n) sequence
        (= (count sequence) 1) (concat [0 0] sequence)
        (= (count sequence) 2) (conj sequence 0)
        :else (let [last (take-last 3 sequence)]
                (recur (concat sequence [(apply + last)])))))))
