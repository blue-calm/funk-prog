(require '[clojure.string :as str])
(def students {"Inese" 10 "Vasja" 8 "Petja" 4 "Natasha" 7 "Anja" 10 "Lauris" 6 "Sandra" 8 "Krisjanis" 9})
(def studenta (select-keys students (for [[k v] data :when (str/ends-with? k "a")] k)))
(def atb (/ (double (reduce + (vals studenta))) (count studenta)))
students
studenta
atb
