(ns bus)

(defn number [bus-stop]
  (->> bus-stop
       (reduce (fn [[a b] [c d]] [(+ a c) (+ b d)]))
       (apply (fn [a b] (- a b)))))

