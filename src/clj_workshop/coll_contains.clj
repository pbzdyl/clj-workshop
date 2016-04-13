(ns clj-workshop.coll-contains)

(defn coll-contains?
  "Returns true if the provided coll contains the given x value"
  [coll x]

  (case (count coll)
    0 false
    (if (= x (first coll))
      true
      (coll-contains? (rest coll) x )
    )
  )

  ;;loop?

)



