(ns two-sum)

(defn two-sum [numbers target]
  (let [seq-index (range (count numbers))]
    (first (for [i seq-index
                 j seq-index
                 :when (and
                        (not= i j)
                        (= (+ (nth numbers i) (nth numbers j)) target))]
             [i j]))))

