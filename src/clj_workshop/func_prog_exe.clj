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

(defn primes
  "Returns a lazy seq of prime numbers"
  []
  (unimplemented))

(defn flip-flop
  [nums]
  (unimplemented))

(defn mungle-candidate-name
  "Returns uppercased and reversed name of the candidate"
  [candidate]
  (unimplemented))

(defn select-values
  "Selects keys from the provided map
  and return their values. For example:
  (select-values {:a 1 :b 2 :c 3} [:a :c]) => (1 3)"
  [map keyseq]
  (unimplemented))

(defn rcomp
  "Composes provided functions so that
  ((rcomp f1 f2 f3) args) is the same as (f3 (f2 (f1 args)))"
  [& fns]
  (unimplemented))

(defn power
  "Returns n to the power of m"
  [n m]
  (unimplemented))

(defn range-sum
  "Calculates the sum of numbers [0..n)"
  [n]
  (unimplemented))

(defn ratings-avg
  [candidates]
  (unimplemented))

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
