(ns human-time)

(defn human-readable [x]
  (let [hours (quot x 3600)
        remainder (mod x 3600)
        minutes (quot remainder 60)
        seconds (mod remainder 60)]
    (format "%02d:%02d:%02d" hours minutes seconds)))

