(ns clj-workshop.func-prog-exe
  (:require [clj-workshop.utils :refer :all]))

(defn count-chars
  "Returns count of the provided character `c` in string `s`"
  [s c]
  (count (filter #(= c %) (seq s)))
)

(defn candidate-names
  [candidates]
  (map #(:name %) candidates)
)

(defn candidates-with-minimum-rating
  [min-rating candidates]
  (filter #(< min-rating (:rating %)) candidates)
)

(defn palindrome?
  "Checks if the given sequence is a palindrome"
  [xs]
  (= (apply str (seq xs)) (apply str (reverse xs))))

(defn count-palindromes
  [start end]
  (count (filter palindrome? (map str (range start end)))))

(defn prime? [n] (= 0 (count (filter #(= 0 (mod n %)) (range 2 n)))))

(defn primes
  "Returns a lazy seq of prime numbers"
	[]
  (filter prime? (iterate inc' 2))
)

(defn flip-flop
  [nums]
  (map #(if (= 0 (mod % 2)) % (+ 1 %)) nums
))


(defn mungle-candidate-name
  "Returns uppercased and reversed name of the candidate"
  [candidate]
  (apply str (reverse (clojure.string/upper-case (:name candidate)))))

(defn select-values
  "Selects keys from the provided map
  and return their values. For example:
  (select-values {:a 1 :b 2 :c 3} [:a :c]) => (1 3)"
  [map keyseq]
  (clojure.core/map #(% map) keyseq))

(defn rcomp
  "Composes provided functions so that
  ((rcomp f1 f2 f3) args) is the same as (f3 (f2 (f1 args)))"
  [& fns]
  (comp 'fns))

(defn power
  "Returns n to the power of m"
  [n m]
  (reduce * (take m (repeat n))))


(defn range-sum
  "Calculates the sum of numbers [0..n)"
  [n]
  (reduce + 0 (take n (range))))

(defn rating-avg
  [candidates]
  (/ (reduce + 0 (map #(:rating %) candidates)) (count candidates)))

(defn distance-tuple
  "Calculates a distance between two points.
  Points are maps with :x and :y keys."
  [p1 p2]
  (int (Math/sqrt
   (+ (* (- (nth p1 0) (nth p2 0)) (- (nth p1 0) (nth p2 0)))
      (* (- (nth p1 1) (nth p2 1)) (- (nth p1 1) (nth p2 1)))))))

(defn distance-map
  "Calculates a distance between two points.
  Points are maps with :x and :y keys."
  [p1 p2]
  (int (Math/sqrt
   (+ (* (- (:x p1) (:x p2)) (- (:x p1) (:x p2)))
      (* (- (:y p1) (:y p2)) (- (:y p1) (:y p2)))))))

