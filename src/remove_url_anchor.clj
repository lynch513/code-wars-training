(ns remove-url-anchor)

(defn remove-url-anchor [url]
  (->> url
       (take-while #(not= % \#))
       (apply str)))
