(ns clj-workshop.func-prog-exe
  (:require [clj-workshop.utils :refer :all]))

(defn count-chars
  "Returns count of the provided character `c` in string `s`"
  [s c]
  (->> s
       (filter #(= c %))
       (count)
      )
  )

(defn candidate-names
  [candidates]
  (->> candidates
       (map :name)
    )
)

(defn candidates-with-minimum-rating
  [min-rating candidates]
  (->> candidates
       (filter #(> (% :rating) 8) )
    )
  )

(defn palindrome?
  "Checks if the given sequence is a palindrome"
  [xs]
    (= (concat "" xs) (reverse xs))
  )

(defn count-palindromes
  [start end]

  (->>  (range start end)
        (map str)
        (filter palindrome?)
        (count)
    )
  )


(defn prime?
  "Checks if number is prime"
  [n]
    (->> n
           (range)
           (drop 2)
           (map #(mod n %))
           (some zero?)
           (not)
           )
  )

(defn primes
  "Returns a lazy seq of prime numbers"
  []
  (->> (range)
       (drop 2)
       (filter prime?)
       )
  )


(defn flip-flop
  [nums]
    (keep-indexed #(if (even? %1) (inc %2) %2) nums)
  )



(defn mungle-candidate-name
  "Returns uppercased and reversed name of the candidate"
  [candidate]

  (->> :name candidate
       (.toUpperCase)
       (reverse)
       (apply str)
    )
  )

(defn select-values
  "Selects keys from the provided map
  and return their values. For example:
  (select-values {:a 1 :b 2 :c 3} [:a :c]) => (1 3)"
  [map keyseq]
  )

(defn rcomp
  "Composes provided functions so that
  ((rcomp f1 f2 f3) args) is the same as (f3 (f2 (f1 args)))"
  [& fns]
  (unimplemented))

(defn power
  "Returns n to the power of m"
  [n m]
  (->> (repeat m n)
       (reduce *)
    )
  )

(defn range-sum
  "Calculates the sum of numbers [0..n)"
  [n]
    (->> n
         (range)
         (reduce +)
      )
  )

(defn rating-avg
  [candidates]
  (/ (->> candidates
       (map :rating)
       (reduce +)
      )
     (count candidates)
  )
)

(defn distance-tuple
  "Calculates a distance between two points.
  Points are two element vectors with x and y
  coordinates."
  [p1 p2]
  (unimplemented))

(defn distance-map
  "Calculates a distance between two points.
  Points are maps with :x and :y keys."
  [p1 p2]
  (unimplemented))
